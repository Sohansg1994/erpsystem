package com.erpsystem.erpsystem.controller;

import com.erpsystem.erpsystem.dto.ResponseDTO;
import com.erpsystem.erpsystem.dto.WarehouseDTO;
import com.erpsystem.erpsystem.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/warehouse")
@CrossOrigin
public class WarehouseController {

    @Autowired
    WarehouseService warehouseService;

    @PostMapping("/")
    public ResponseEntity saveWarehouse(@RequestBody WarehouseDTO warehouseDTO){
        ResponseDTO responseDTO;
        responseDTO=warehouseService.saveWarehouse(warehouseDTO);
        return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);
    }

}
