package com.erpsystem.erpsystem.entity;


import com.erpsystem.erpsystem.entity.Contact.ContactEntity;
import jakarta.persistence.*;


import java.util.Set;

@Entity
@Table(name="branch")
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "branch_code")// nullable
    private int branchCode;

    @Column(name = "branch_name",nullable = false)
    private String branchName;


  @OneToMany(mappedBy = "branch",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
  private Set<Warehouse> warehouseSet;

    public Branch(String branchName) {
        this.branchName = branchName;
    }

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
}
