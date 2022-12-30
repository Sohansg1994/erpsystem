package com.erpsystem.erpsystem.dto;

public class WarehouseDTO extends BaseDTO{
    private int branchCode;
    private String warehouseName;
    private double capacity;
    private ContactDTO contactDTO;

    public WarehouseDTO(int branchCode, String warehouseName, double capacity, ContactDTO contactDTO) {
        this.branchCode = branchCode;
        this.warehouseName = warehouseName;
        this.capacity = capacity;
        this.contactDTO = contactDTO;
    }

    public int getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(int branchCode) {
        this.branchCode = branchCode;
    }

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

    public ContactDTO getContactDTO() {
        return contactDTO;
    }

    public void setContactDTO(ContactDTO contactDTO) {
        this.contactDTO = contactDTO;
    }

    @Override
    public boolean isRequiredAvailable() {
        boolean isAllItemsAvailable= ((branchCode>0)&& (warehouseName !=null && !warehouseName.isEmpty())&&
                (capacity>0) && (contactDTO.isRequiredAvailable()));
        return isAllItemsAvailable;

    }


}
