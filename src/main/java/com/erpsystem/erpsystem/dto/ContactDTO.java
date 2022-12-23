package com.erpsystem.erpsystem.dto;

public class ContactDTO {

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
}
