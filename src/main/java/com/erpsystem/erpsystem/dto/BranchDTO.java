package com.erpsystem.erpsystem.dto;



import com.erpsystem.erpsystem.entity.Warehouse;

import java.util.Set;


public class BranchDTO extends BaseDTO{
    private String branchName;
    private ContactDTO contactDTO;

    private Set<Warehouse> warehouseSet;


    public BranchDTO(String branchName, ContactDTO contactDTO, Set<Warehouse> warehouseSet) {
        this.branchName = branchName;
        this.contactDTO = contactDTO;
        this.warehouseSet = warehouseSet;
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

    @Override
    public boolean isRequiredAvailable() {
        boolean isAllItemsAvailable= ((branchName !=null && !branchName.isEmpty())&& (contactDTO !=null ));

        return isAllItemsAvailable;

    }
}

