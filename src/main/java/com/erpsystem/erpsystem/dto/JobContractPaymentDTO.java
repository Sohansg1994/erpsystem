package com.erpsystem.erpsystem.dto;

public class JobContractPaymentDTO extends BaseDTO {

    private int contractNum;

    private String paymentMonth;
    private double overTimeHours;
    private double penalty;

    public JobContractPaymentDTO(int contractNum, String paymentMonth, double overTimeHours, double penalty) {
        this.contractNum = contractNum;
        this.paymentMonth = paymentMonth;
        this.overTimeHours = overTimeHours;
        this.penalty = penalty;
    }

    public JobContractPaymentDTO(){}

    public int getContractNum() {
        return contractNum;
    }

    public void setContractNum(int contractNum) {
        this.contractNum = contractNum;
    }

    public String getPaymentMonth() {
        return paymentMonth;
    }

    public void setPaymentMonth(String paymentMonth) {
        this.paymentMonth = paymentMonth;
    }

    public double getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(double overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    @Override
    public boolean isRequiredAvailable() {
        boolean isAllItemsAvailable = ((contractNum > 0) && (paymentMonth != null && !paymentMonth.isEmpty()) &&
                (overTimeHours > 0) && (penalty > 0));

        return isAllItemsAvailable;

    }
}
