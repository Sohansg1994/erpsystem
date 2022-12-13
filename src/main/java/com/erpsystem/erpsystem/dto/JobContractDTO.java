package com.erpsystem.erpsystem.dto;

public class JobContractDTO extends BaseDTO{
    private int branchCode;
    private int empId;
    private String timePeriod;
    private double basicSalary;
    private double fixedAllowances;

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

    public JobContractDTO(int branchCode, int empId, String timePeriod, double basicSalary, double fixedAllowances) {
        this.branchCode = branchCode;
        this.empId = empId;
        this.timePeriod = timePeriod;
        this.basicSalary = basicSalary;
        this.fixedAllowances = fixedAllowances;



    }

    @Override
    public boolean isRequiredAvailable() {
        boolean isAllItemsAvailable= ((branchCode>0)&& (empId>0) && (timePeriod !=null && !timePeriod.isEmpty())
                && (basicSalary>0));

        return isAllItemsAvailable;

    }

}
