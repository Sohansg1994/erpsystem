package com.erpsystem.erpsystem.controller;

import com.erpsystem.erpsystem.dto.BranchDTO;
import com.erpsystem.erpsystem.dto.ResponseDTO;
import com.erpsystem.erpsystem.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/branch")
@CrossOrigin
public class BranchController {
    @Autowired
    BranchService branchService;


    @PostMapping("/")
    public ResponseEntity saveBranch(@RequestBody BranchDTO branchDTO){
        ResponseDTO responseDTO;
        if(!branchDTO.isRequiredAvailable()){
            responseDTO=new ResponseDTO("Invalid Input",null);
            return new ResponseEntity(responseDTO,HttpStatus.BAD_REQUEST);

        }

        try {
            responseDTO = branchService.addBranch(branchDTO);
            return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);
        }catch (Exception e){
            responseDTO=new ResponseDTO("Error",null);
            return new ResponseEntity(responseDTO,HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @GetMapping()
    public ResponseEntity getBranch(@RequestParam int branchCode){
        ResponseDTO responseDTO;
        try {
            responseDTO = branchService.getBranch(branchCode);
            return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);
        }catch (Exception e){
            responseDTO=new ResponseDTO(e.getMessage(), null);
            return new ResponseEntity(responseDTO,HttpStatus.NOT_ACCEPTABLE);
        }

    }

    @GetMapping("/branchCount")
    public ResponseEntity getBranchCount(){
        ResponseDTO responseDTO;
        try {
            responseDTO = branchService.getBranchCount();
            return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);
        }catch (Exception e){
            responseDTO=new ResponseDTO(e.getMessage(), null);
            return new ResponseEntity(responseDTO,HttpStatus.NOT_ACCEPTABLE);
        }

    }
    @GetMapping("/branchDetails")
    public ResponseEntity getBranchDetails(){
        ResponseDTO responseDTO;

        try {
            responseDTO = branchService.getBranchDetails();
            return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);
        }catch (Exception e){
            responseDTO=new ResponseDTO(e.getMessage(), null);
            return new ResponseEntity(responseDTO,HttpStatus.NOT_ACCEPTABLE);
        }

    }







}
