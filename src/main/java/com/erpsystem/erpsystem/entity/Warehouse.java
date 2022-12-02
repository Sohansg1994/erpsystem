package com.erpsystem.erpsystem.entity;

import com.erpsystem.erpsystem.entity.Contact.Address;
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

    @Column(name = "capacity",nullable = false)
    private double capacity;


    @ManyToOne
    @JoinColumn(name="branch_code")
    private Branch branch;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_detail_id",referencedColumnName ="contact_detail_id" )
    private Address address;



    public Warehouse(String warehouseName, double capacity) {
        this.warehouseName = warehouseName;
        this.capacity = capacity;
    }

    public Warehouse(){}

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
