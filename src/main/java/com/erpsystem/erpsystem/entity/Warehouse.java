package com.erpsystem.erpsystem.entity;
import com.erpsystem.erpsystem.entity.Contact.ContactDetails;
import com.erpsystem.erpsystem.entity.Contact.ContactEntity;
import jakarta.persistence.*;

@Table(name="Warehouse")
@Entity
public class Warehouse extends ContactEntity {

    @Column(name = "warehouse_name",nullable = false)
    private String warehouseName;

    @Column(name = "capacity",nullable = false)
    private double capacity;


    @ManyToOne
    private Branch branch;


    public Warehouse(ContactDetails contactDetails, String warehouseName, double capacity) {
        super(contactDetails);
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


}
