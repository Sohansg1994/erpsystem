package com.erpsystem.erpsystem.dto;

import com.erpsystem.erpsystem.entity.Contact.ContactDetails;

public class EmployeeDTO extends BaseDTO{
    private String name;
    private String nic;
    private String designation;

    private ContactDTO contactDTO;

    public EmployeeDTO(String name, String nic, String designation, ContactDTO contactDTO) {
        this.name = name;
        this.nic = nic;
        this.designation = designation;
        this.contactDTO = contactDTO;
    }

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

    public ContactDTO getContactDTO() {
        return contactDTO;
    }

    public void setContactDTO(ContactDTO contactDTO) {
        this.contactDTO = contactDTO;
    }

    @Override
    public boolean isRequiredAvailable() {
        boolean isAllItemsAvailable= ((name !=null && !name.isEmpty())&& (nic !=null && !nic.isEmpty())&&
                (designation !=null && !designation.isEmpty())&&(contactDTO !=null ) );

        return isAllItemsAvailable;
    }
}


