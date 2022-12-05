package com.erpsystem.erpsystem.dto;

public class JobContractPaymentDTO {

    private int contractNum;

    private String paymentMonth;
    private double overTimeHours;
    private double panelty;

    public JobContractPaymentDTO(int contractNum, String paymentMonth, double overTimeHours, double panelty) {
        this.contractNum = contractNum;
        this.paymentMonth = paymentMonth;
        this.overTimeHours = overTimeHours;
        this.panelty = panelty;
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

    public double getPanelty() {
        return panelty;
    }

    public void setPanelty(double panelty) {
        this.panelty = panelty;
    }
}
