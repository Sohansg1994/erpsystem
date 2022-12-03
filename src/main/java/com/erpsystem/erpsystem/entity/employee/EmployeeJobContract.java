package com.erpsystem.erpsystem.entity.employee;

import com.erpsystem.erpsystem.entity.Branch;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="employeeJobContract")
public class EmployeeJobContract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int contractNum;

    @Column(nullable = false)
    private String timePeriod;

    @Column(nullable = false)
    private double basicSalary;

    @Column(nullable = false)
    private double fixedAllowances;

    @Column(nullable = false)
    private double OTHourRate;

    @ManyToOne
    private Employee employee;

    @ManyToOne
    private Branch branch;

    @OneToMany(mappedBy = "employeeJobContract",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Set<JobContractPayment> jobContractPaymentSet;

    public EmployeeJobContract(String timePeriod, double basicSalary, double fixedAllowances, double OTHourRate) {
        this.timePeriod = timePeriod;
        this.basicSalary = basicSalary;
        this.fixedAllowances = fixedAllowances;
        this.OTHourRate = OTHourRate;
    }


    public int getContractNum() {
        return contractNum;
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }



}
