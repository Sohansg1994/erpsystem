package com.erpsystem.erpsystem.controller;

import com.erpsystem.erpsystem.dto.JobContractDTO;
import com.erpsystem.erpsystem.dto.JobContractPaymentDTO;
import com.erpsystem.erpsystem.dto.ResponseDTO;
import com.erpsystem.erpsystem.service.JobContractPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/payment")
public class JobContractPaymentController {
    @Autowired
    JobContractPaymentService jobContractPaymentService;

    @PostMapping("/")
    public ResponseEntity addJobContract(@RequestBody JobContractPaymentDTO jobContractPaymentDTO){
        ResponseDTO responseDTO;
        try {
            responseDTO=jobContractPaymentService.addJobContractPayment(jobContractPaymentDTO);
            return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);
        }catch (Exception e){
            responseDTO=new ResponseDTO(e.getMessage(),null);
            return new ResponseEntity(responseDTO,HttpStatus.NOT_ACCEPTABLE);
        }

    }
}
