package com.erpsystem.erpsystem.entity.employee;


import com.erpsystem.erpsystem.entity.Contact.ContactDetails;
import com.erpsystem.erpsystem.entity.Contact.ContactEntity;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="employee")
public class Employee extends ContactEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String NIC;

    @Column(nullable = false)
    private String designation;

    @OneToMany(mappedBy = "employee",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Set<EmployeeJobContract> employeeJobContractSet;

    public Employee(ContactDetails contactDetails, String name, String NIC, String designation) {
        super(contactDetails);
        this.name = name;
        this.NIC = NIC;
        this.designation = designation;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
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
