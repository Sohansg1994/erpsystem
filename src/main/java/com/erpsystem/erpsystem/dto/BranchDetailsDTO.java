package com.erpsystem.erpsystem.dto;

import com.erpsystem.erpsystem.entity.Warehouse;

import java.util.Set;

public class BranchDetailsDTO extends BaseDTO{
    private int branchCode;
    private String branchName;
    private ContactDTO contactDTO;

    private Set<Warehouse> warehouseSet;

    public BranchDetailsDTO(int branchCode, String branchName, ContactDTO contactDTO, Set<Warehouse> warehouseSet) {
        this.branchCode = branchCode;
        this.branchName = branchName;
        this.contactDTO = contactDTO;
        this.warehouseSet = warehouseSet;
    }

    public BranchDetailsDTO(){}

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

    public ContactDTO getContactDTO() {
        return contactDTO;
    }

    public void setContactDTO(ContactDTO contactDTO) {
        this.contactDTO = contactDTO;
    }

    public Set<Warehouse> getWarehouseSet() {
        return warehouseSet;
    }

    public void setWarehouseSet(Set<Warehouse> warehouseSet) {
        this.warehouseSet = warehouseSet;
    }
}
