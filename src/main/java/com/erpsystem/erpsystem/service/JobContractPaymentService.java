package com.erpsystem.erpsystem.service;

import com.erpsystem.erpsystem.dto.JobContractPaymentDTO;
import com.erpsystem.erpsystem.dto.ResponseDTO;
import com.erpsystem.erpsystem.entity.employee.EmployeeJobContract;
import com.erpsystem.erpsystem.entity.employee.JobContractPayment;
import com.erpsystem.erpsystem.repo.JobContractPaymentRepository;
import com.erpsystem.erpsystem.repo.JobContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class JobContractPaymentService {

    @Autowired
    JobContractPaymentRepository jobContractPaymentRepository;

    @Autowired
    JobContractRepository jobContractRepository;

    public ResponseDTO addJobContractPayment(JobContractPaymentDTO jobContractPaymentDTO) throws Exception{
        ResponseDTO responseDTO;
        if (jobContractRepository.existsById(jobContractPaymentDTO.getContractNum())) {
            JobContractPayment jobContractPayment = new JobContractPayment(jobContractPaymentDTO);
            EmployeeJobContract employeeJobContract = jobContractRepository.getReferenceById
                    (jobContractPaymentDTO.getContractNum());
            jobContractPayment.setEmployeeJobContract(employeeJobContract);
            jobContractPayment.setOtAmount((employeeJobContract.getOTHourRate()) * (jobContractPaymentDTO.getOverTimeHours()));
            System.out.println(jobContractPayment.getOtAmount());
            jobContractPayment.setGrossPay(employeeJobContract.getBasicSalary()
                    + employeeJobContract.getFixedAllowances()
                    + jobContractPayment.getOtAmount());
            jobContractPayment.setNetPay(jobContractPayment.getGrossPay()
                    - jobContractPayment.getPenalty()
                    - employeeJobContract.getEpfDeduction());

            jobContractPaymentRepository.save(jobContractPayment);
            return responseDTO = new ResponseDTO("Monthly Payment Added", null);
        }else {
            return responseDTO = new ResponseDTO("The employment contract does not exist in the system",
                    null);
        }


    }





}
