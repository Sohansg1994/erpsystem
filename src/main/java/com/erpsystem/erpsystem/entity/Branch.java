package com.erpsystem.erpsystem.entity;


import com.erpsystem.erpsystem.entity.Contact.ContactDetails;
import com.erpsystem.erpsystem.entity.Contact.ContactEntity;
import com.erpsystem.erpsystem.entity.employee.EmployeeJobContract;
import jakarta.persistence.*;


import java.util.Set;

@Entity
@Table(name="branch")
public class Branch extends ContactEntity{

    @Column(name = "branch_name",nullable = false)
    private String branchName;


  @OneToMany(mappedBy = "branch",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
  private Set<Warehouse> warehouseSet;

  @OneToMany(mappedBy ="branch",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
  private Set<EmployeeJobContract> employeeJobContractSet;

    public Branch(ContactDetails contactDetails, String branchName) {
        super(contactDetails);
        this.branchName = branchName;
    }

    public Branch(String branchName) {
        this.branchName = branchName;
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

    public Set<EmployeeJobContract> getEmployeeJobContractSet() {
        return employeeJobContractSet;
    }

    public void setEmployeeJobContractSet(Set<EmployeeJobContract> employeeJobContractSet) {
        this.employeeJobContractSet = employeeJobContractSet;
    }
}
