package com.erpsystem.erpsystem.repo;

import com.erpsystem.erpsystem.entity.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    boolean existsEmployeeBynic(String nic);

}
