package com.erpsystem.erpsystem.entity.employee;

import jakarta.persistence.*;

@Entity
@Table(name="employeeJobContract")
public class EmployeeJobContract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int contractNum;

    @Column(nullable = false)
    private int branchCode;

    @Column(nullable = false)
    private int empId;

    @Column(nullable = false)
    private String timePeriod;

    @Column(nullable = false)
    private double basicSalary;

    @Column(nullable = false)
    private double fixedAllowances;

    @Column(nullable = false)
    private double OTHourRate;


    public EmployeeJobContract(int branchCode, int empId, String timePeriod, double basicSalary, double fixedAllowances, double OTHourRate) {
        this.branchCode = branchCode;
        this.empId = empId;
        this.timePeriod = timePeriod;
        this.basicSalary = basicSalary;
        this.fixedAllowances = fixedAllowances;
        this.OTHourRate = OTHourRate;
    }


    public EmployeeJobContract(){}

    public int getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(int branchCode) {
        this.branchCode = branchCode;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getFixedAllowances() {
        return fixedAllowances;
    }

    public void setFixedAllowances(double fixedAllowances) {
        this.fixedAllowances = fixedAllowances;
    }

    public double getOTHourRate() {
        return OTHourRate;
    }

    public void setOTHourRate(double OTHourRate) {
        this.OTHourRate = OTHourRate;
    }
}
