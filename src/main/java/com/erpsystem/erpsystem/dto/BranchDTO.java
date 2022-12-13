package com.erpsystem.erpsystem.dto;


import com.erpsystem.erpsystem.entity.Contact.ContactDetails;
import com.erpsystem.erpsystem.entity.Warehouse;

import java.util.Set;


public class BranchDTO extends BaseDTO{
    private String branchName;
    private ContactDetails contactDetails;

    private Set<Warehouse> warehouseSet;


    public BranchDTO(String branchName, ContactDetails contactDetails,Set<Warehouse> warehouseSet) {
        this.branchName = branchName;
        this.contactDetails = contactDetails;
        this.warehouseSet=warehouseSet;
    }

    public BranchDTO(){}

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public Set<Warehouse> getWarehouseSet() {
        return warehouseSet;
    }

    public void setWarehouseSet(Set<Warehouse> warehouseSet) {
        this.warehouseSet = warehouseSet;
    }

    @Override
    public boolean isRequiredAvailable() {
        boolean isAllItemsAvailable= ((branchName !=null && !branchName.isEmpty())&& (contactDetails !=null ));

        return isAllItemsAvailable;

    }
}

