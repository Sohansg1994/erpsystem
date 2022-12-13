package com.erpsystem.erpsystem.dto;

import com.erpsystem.erpsystem.entity.Contact.ContactDetails;

public class EmployeeDTO extends BaseDTO{
    private String name;
    private String nic;
    private String designation;
    private ContactDetails contactDetails;

    public EmployeeDTO(String name, String NIC, String designation, ContactDetails contactDetails) {
        this.name = name;
        this.nic = NIC;
        this.designation = designation;
        this.contactDetails = contactDetails;
    }

    public EmployeeDTO(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    @Override
    public boolean isRequiredAvailable() {
        boolean isAllItemsAvailable= ((name !=null && !name.isEmpty())&& (nic !=null && !nic.isEmpty())&&
                (designation !=null && !designation.isEmpty())&&(contactDetails !=null ) );

        return isAllItemsAvailable;
    }
}


