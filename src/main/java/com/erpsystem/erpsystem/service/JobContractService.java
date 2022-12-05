package com.erpsystem.erpsystem.service;

import com.erpsystem.erpsystem.dto.JobContractDTO;
import com.erpsystem.erpsystem.dto.ResponseDTO;
import com.erpsystem.erpsystem.entity.employee.EmployeeJobContract;
import com.erpsystem.erpsystem.repo.BranchRepository;
import com.erpsystem.erpsystem.repo.EmployeeRepository;
import com.erpsystem.erpsystem.repo.JobContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class JobContractService {

    @Autowired
    JobContractRepository jobContractRepository;
    @Autowired
    BranchRepository branchRepository;
    @Autowired
    EmployeeRepository employeeRepository;

    public ResponseDTO addJobContract(JobContractDTO jobContractDTO) throws Exception{
        ResponseDTO responseDTO;
        EmployeeJobContract employeeJobContract=new EmployeeJobContract(jobContractDTO);
        employeeJobContract.setBranch(branchRepository.getReferenceById(jobContractDTO.getBranchCode()));
        employeeJobContract.setEmployee(employeeRepository.getReferenceById(jobContractDTO.getEmpId()));
        jobContractRepository.save(employeeJobContract);
        return responseDTO=new ResponseDTO("Job Contract is added successfully",null);
    }
}
