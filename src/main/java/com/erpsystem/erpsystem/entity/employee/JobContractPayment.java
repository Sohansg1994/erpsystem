package com.erpsystem.erpsystem.entity.employee;

import com.erpsystem.erpsystem.dto.JobContractPaymentDTO;
import jakarta.persistence.*;

@Entity
@Table(name = "jobContractPayment")
public class JobContractPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private int paymentId;
    @Column(nullable = true)
    private String paymentMonth;

    @Column(nullable = true)
    private double grossPay;

    @Column(nullable = true)
    private double penalty;

    @Column(nullable = true)
    private double netPay;

    @Column(nullable = true)
    private double otAmount;


    @ManyToOne
    @JoinColumn(name="contract_num", nullable=false)
    private EmployeeJobContract employeeJobContract;

   // @OneToOne(mappedBy = "jobContractPayment", cascade = CascadeType.ALL)
   // @PrimaryKeyJoinColumn
   // private OT ot;


    public JobContractPayment(JobContractPaymentDTO jobContractPaymentDTO) {
        this.paymentMonth = jobContractPaymentDTO.getPaymentMonth();
        this.penalty =jobContractPaymentDTO.getPenalty();

    }
    public JobContractPayment(){}

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

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
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

   /* public OT getOt() {
        return ot;
    }

    public void setOt(OT ot) {
        this.ot = ot;
    }*/

    public double getOtAmount() {
        return otAmount;
    }

    public void setOtAmount(double otAmount) {
        this.otAmount = otAmount;
    }
}
