package com.erpsystem.erpsystem.entity.employee;

import jakarta.persistence.*;

@Entity
@Table(name = "jobContractPayment")
public class JobContractPayment {
    @Id
    @Column(name = "payment_id")
    private int paymentId;

    @Column(nullable = false)
    private String paymentMonth;

    @Column(nullable = false)
    private double grossPay;

    @Column(nullable = false)
    private double panelty;

    @Column(nullable = false)
    private double epf;

    @Column(nullable = false)
    private double netPay;


    @ManyToOne
    @JoinColumn(name="contract_num", nullable=false)
    private EmployeeJobContract employeeJobContract;

    @OneToOne(mappedBy = "jobContractPayment", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private OT ot;





    public JobContractPayment( String paymentMonth, double grossPay, double panelty, double epf, double netPay) {
        this.paymentMonth = paymentMonth;
        this.grossPay = grossPay;
        this.panelty = panelty;
        this.epf = epf;
        this.netPay = netPay;
    }

    public int getPaymentId() {
        return paymentId;
    }
    
    public String getPaymentMonth() {
        return paymentMonth;
    }

    public void setPaymentMonth(String paymentMonth) {
        this.paymentMonth = paymentMonth;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }

    public double getPanelty() {
        return panelty;
    }

    public void setPanelty(double panelty) {
        this.panelty = panelty;
    }

    public double getEpf() {
        return epf;
    }

    public void setEpf(double epf) {
        this.epf = epf;
    }

    public double getNetPay() {
        return netPay;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }

    public EmployeeJobContract getEmployeeJobContract() {
        return employeeJobContract;
    }

    public void setEmployeeJobContract(EmployeeJobContract employeeJobContract) {
        this.employeeJobContract = employeeJobContract;
    }

    public OT getOt() {
        return ot;
    }

    public void setOt(OT ot) {
        this.ot = ot;
    }


}
