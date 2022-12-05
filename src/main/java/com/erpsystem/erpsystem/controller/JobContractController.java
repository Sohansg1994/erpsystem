package com.erpsystem.erpsystem.controller;

import com.erpsystem.erpsystem.dto.JobContractDTO;
import com.erpsystem.erpsystem.dto.ResponseDTO;
import com.erpsystem.erpsystem.service.JobContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/jobContract")
public class JobContractController {
    @Autowired
    JobContractService jobContractService;

    @PostMapping("/")
    public ResponseEntity addJobContract(@RequestBody JobContractDTO jobContractDTO){
        ResponseDTO responseDTO;
        try {
            responseDTO=jobContractService.addJobContract(jobContractDTO);
            return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);
        }catch (Exception e){
            responseDTO=new ResponseDTO(e.getMessage(),null);
            return new ResponseEntity(responseDTO,HttpStatus.NOT_ACCEPTABLE);
        }

    }
}
