package com.erpsystem.erpsystem.repo;

import com.erpsystem.erpsystem.entity.employee.EmployeeJobContract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobContractRepository extends JpaRepository<EmployeeJobContract,Integer> {
}
