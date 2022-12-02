package com.erpsystem.erpsystem.entity;

import com.erpsystem.erpsystem.entity.Contact.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name="branch")
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "branch_code",nullable = false)
    private int branchCode;

    @Column(name = "branch_name",nullable = false)
    private String branchName;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_detail_id", referencedColumnName = "contact_detail_id")
    private Address address;


  @OneToMany(mappedBy = "branch",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
  private Set<Warehouse> warehouseSet;


    public Branch(String branchName, int contactDetailsId) {
        this.branchName = branchName;


    }
    public Branch(){}

    public int getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(int branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }


    public Set<Warehouse> getWarehouseSet() {
        return warehouseSet;
    }

    public void setWarehouseSet(Set<Warehouse> warehouseSet) {
        this.warehouseSet = warehouseSet;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
