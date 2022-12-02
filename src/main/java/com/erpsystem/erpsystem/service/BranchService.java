package com.erpsystem.erpsystem.service;

import com.erpsystem.erpsystem.dto.BranchDTO;
import com.erpsystem.erpsystem.dto.ResponseDTO;
import com.erpsystem.erpsystem.entity.Branch;
import com.erpsystem.erpsystem.repo.BranchRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BranchService {
    @Autowired
    BranchRepository branchRepository;

    @Autowired
    ModelMapper modelMapper;

    public ResponseDTO saveBranch(BranchDTO branchDTO){
        ResponseDTO responseDTO;
        Branch map=modelMapper.map(branchDTO,Branch.class);
        branchRepository.save(map);
        responseDTO =new ResponseDTO("Branch Successfully added",null);
        return responseDTO;
    }


}