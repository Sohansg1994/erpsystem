package com.erpsystem.erpsystem.entity.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue()
    private int empId;
    private String name;
    private String NIC;
    private int contactDetailId;
    private String designation;
}
