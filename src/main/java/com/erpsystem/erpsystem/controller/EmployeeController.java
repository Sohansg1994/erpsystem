package com.erpsystem.erpsystem.controller;

import com.erpsystem.erpsystem.dto.EmployeeDTO;
import com.erpsystem.erpsystem.dto.ResponseDTO;
import com.erpsystem.erpsystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/")
    public ResponseEntity addEmployee(@RequestBody EmployeeDTO employeeDTO){
        ResponseDTO responseDTO;
        if(!employeeDTO.isRequiredAvailable()){
            responseDTO=new ResponseDTO("Invalid Input",null);
            return new ResponseEntity(responseDTO,HttpStatus.BAD_REQUEST);

        }
        try {
            responseDTO=employeeService.addEmployee(employeeDTO);
            return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);
        }catch (Exception e){
            responseDTO=new ResponseDTO(e.getMessage(),null);
            return new ResponseEntity(responseDTO,HttpStatus.NOT_ACCEPTABLE);
        }

    }



}
