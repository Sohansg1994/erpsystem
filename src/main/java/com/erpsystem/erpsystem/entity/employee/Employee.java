package com.erpsystem.erpsystem.entity.employee;


import com.erpsystem.erpsystem.dto.EmployeeDTO;
import com.erpsystem.erpsystem.entity.Contact.ContactDetails;
import com.erpsystem.erpsystem.entity.Contact.ContactEntity;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name="employee")
public class Employee extends ContactEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String nic;

    @Column(nullable = false)
    private String designation;

    @OneToMany(mappedBy = "employee",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Set<EmployeeJobContract> employeeJobContractSet;

    public Employee(EmployeeDTO employeeDTO) {
        super(employeeDTO.getContactDetails());
        this.name = employeeDTO.getName();
        this.nic = employeeDTO.getNic();
        this.designation = employeeDTO.getDesignation();
    }

    public Employee(){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Set<EmployeeJobContract> getEmployeeJobContractSet() {
        return employeeJobContractSet;
    }

    public void setEmployeeJobContractSet(Set<EmployeeJobContract> employeeJobContractSet) {
        this.employeeJobContractSet = employeeJobContractSet;
    }
}
