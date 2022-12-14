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
      if(!warehouseDTO.isRequiredAvailable()){
          responseDTO=new ResponseDTO("Invalid Input",null);
          return new ResponseEntity(responseDTO,HttpStatus.BAD_REQUEST);

      }
        try {
            responseDTO = warehouseService.addWarehouse(warehouseDTO);
            return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);

        }catch(Exception e){
            responseDTO=new ResponseDTO("Error",null);
            return new ResponseEntity(responseDTO,HttpStatus.NOT_ACCEPTABLE);
        }
    }
    @GetMapping("/warehouseCount")
    public ResponseEntity getWarehouseCount(){
        ResponseDTO responseDTO;
        try {
            responseDTO = warehouseService.getWarehouseCount();
            return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);
        }catch (Exception e){
            responseDTO=new ResponseDTO(e.getMessage(), null);
            return new ResponseEntity(responseDTO,HttpStatus.NOT_ACCEPTABLE);
        }

    }



}
