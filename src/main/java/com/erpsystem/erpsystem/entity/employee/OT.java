package com.erpsystem.erpsystem.entity.employee;


import jakarta.persistence.*;
import org.apache.tomcat.Jar;

@Entity
@Table(name="ot")
public class OT {
    @Id
    @OneToOne
    @MapsId
    @JoinColumn(name = "payment_id")
    private JobContractPayment jobContractPayment;

    private double overTimeHours;
    private double otAmount;


    public OT(double overTimeHours, double otAmount) {
        this.overTimeHours = overTimeHours;
        this.otAmount=otAmount;
    }

    public JobContractPayment getJobContractPayment() {
        return jobContractPayment;
    }

    public void setJobContractPayment(JobContractPayment jobContractPayment) {
        this.jobContractPayment = jobContractPayment;
    }

    public double getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(double overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public double getOtAmount() {
        return otAmount;
    }

    public void setOtAmount(double otAmount) {
        this.otAmount = otAmount;
    }
}
