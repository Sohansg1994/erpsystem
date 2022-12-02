package com.erpsystem.erpsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name="Warehouse")
@Entity
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "warehouse_code",nullable = false)
    private int warehouseCode;

    @Column(name = "warehouse_name",nullable = false)
    private String warehouseName;

    @Column(name = "contact_details_Id",nullable = false)
    private int contactDetailsId;

    @Column(name = "capacity",nullable = false)
    private double capacity;


    @ManyToOne
    @JoinColumn(name="branch_code")
    private Branch branch;

    public Warehouse(String warehouseName, int contactDetailsId, double capacity) {
        this.warehouseName = warehouseName;
        this.contactDetailsId = contactDetailsId;
        this.capacity = capacity;
    }

    public Warehouse(){}

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public int getContactDetailsId() {
        return contactDetailsId;
    }

    public void setContactDetailsId(int contactDetailsId) {
        this.contactDetailsId = contactDetailsId;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}
