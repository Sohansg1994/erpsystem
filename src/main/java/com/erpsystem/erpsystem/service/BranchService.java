package com.erpsystem.erpsystem.service;
import com.erpsystem.erpsystem.dto.*;
import com.erpsystem.erpsystem.entity.Branch;
import com.erpsystem.erpsystem.entity.Contact.ContactDetails;
import com.erpsystem.erpsystem.entity.Contact.ContactEntity;
import com.erpsystem.erpsystem.repo.BranchRepository;
import com.erpsystem.erpsystem.repo.ContactRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class BranchService {
    @Autowired
    BranchRepository branchRepository;

    @Autowired
    ContactRepository contactRepository;

    @Autowired
    ModelMapper modelMapper;

    public ResponseDTO addBranch(BranchDTO branchDTO){
        ResponseDTO responseDTO;
        Branch branch =new Branch(branchDTO);
        branchRepository.save(branch);
        return responseDTO=new ResponseDTO("Branch Successfully Added",null);

    }

    public ResponseDTO getBranch(int branchCode){
        ResponseDTO responseDTO;
        Branch branch=branchRepository.getReferenceById(branchCode);
        BranchDetailsDTO branchDetailsDTO=new BranchDetailsDTO();
        branchDetailsDTO.setBranchName(branch.getBranchName());

        return responseDTO=new ResponseDTO("Success",branchDetailsDTO);

    }

    public ResponseDTO getBranchCount(){
        ResponseDTO responseDTO;
        long branchCount=branchRepository.count();
        System.out.println(branchCount);

        return responseDTO=new ResponseDTO("Success",branchCount);

    }

    public ResponseDTO getBranchDetails(){
        ResponseDTO responseDTO;
        List<Branch> branchList=branchRepository.findAll();
        List<BranchDetailsDTO> branchDetailsDTOList=new ArrayList<>();
        for(Branch branch:branchList){
            BranchDetailsDTO branchDetailsDTO=new BranchDetailsDTO();
            branchDetailsDTO.setBranchCode(branch.getId());
        }

        return responseDTO=new ResponseDTO("Success",branchList);

    }




}
