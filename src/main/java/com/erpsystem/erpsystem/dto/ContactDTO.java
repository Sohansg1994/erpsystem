package com.erpsystem.erpsystem.dto;

import com.erpsystem.erpsystem.entity.Contact.ContactDetails;

public class ContactDTO extends BaseDTO {

    private String mobileNo;

    private String telephoneNo;

    private String email;

    private String faxNo;

    private AddressDTO addressDTO;

    public ContactDTO(String mobileNo, String telephoneNo, String email, String faxNo, AddressDTO addressDTO) {
        this.mobileNo = mobileNo;
        this.telephoneNo = telephoneNo;
        this.email = email;
        this.faxNo = faxNo;
        this.addressDTO = addressDTO;
    }
    public ContactDTO(ContactDetails contactDetails , AddressDTO addressDTO) {
        this.mobileNo =contactDetails.getMobileNo();
        this.telephoneNo = contactDetails.getTelephoneNo();
        this.email = contactDetails.getEmail();
        this.faxNo = contactDetails.getFaxNo();
        this.addressDTO = addressDTO;
    }


    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(String telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFaxNo() {
        return faxNo;
    }

    public void setFaxNo(String faxNo) {
        this.faxNo = faxNo;
    }

    public AddressDTO getAddressDTO() {
        return addressDTO;
    }

    public void setAddressDTO(AddressDTO addressDTO) {
        this.addressDTO = addressDTO;
    }

    @Override
    public boolean isRequiredAvailable(){
        boolean isAllItemsAvailable= ((mobileNo !=null && !mobileNo.isEmpty())&& (telephoneNo !=null && !telephoneNo.isEmpty())&&
                (email !=null && !email.isEmpty()) );

        return isAllItemsAvailable;
    }

}
