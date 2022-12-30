package com.erpsystem.erpsystem.service;

import com.erpsystem.erpsystem.dto.EmployeeDTO;
import com.erpsystem.erpsystem.dto.ResponseDTO;
import com.erpsystem.erpsystem.entity.employee.Employee;
import com.erpsystem.erpsystem.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public ResponseDTO addEmployee(EmployeeDTO employeeDTO) throws Exception{
        ResponseDTO responseDTO;
        if(!employeeRepository.existsEmployeeBynic(employeeDTO.getNic())) {
            Employee employee = new Employee(employeeDTO);
            employeeRepository.save(employee);
            return responseDTO = new ResponseDTO("Employee added successfully", null);
        }else {
            return responseDTO = new ResponseDTO("Employee is already registered in the system", null);
        }


    }

    public ResponseDTO getEmployeeCount(){
        ResponseDTO responseDTO;
        long employeeCount=employeeRepository.count();
        System.out.println(employeeCount);

        return responseDTO=new ResponseDTO("Success",employeeCount);

    }



}
