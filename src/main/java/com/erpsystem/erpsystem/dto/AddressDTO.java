package com.erpsystem.erpsystem.dto;

import com.erpsystem.erpsystem.entity.Contact.Address;

public class AddressDTO extends BaseDTO{

    private String houseNo;

    private String streetName;

    private String city;

    private String state;

    private String zipCode;


    public AddressDTO(String houseNo, String streetName, String city, String state, String zipCode) {
        this.houseNo = houseNo;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public AddressDTO(Address address) {
        this.houseNo = address.getHouseNo();
        this.streetName = address.getStreetName();
        this.city = address.getCity();
        this.state = address.getState();
        this.zipCode = address.getZipCode();
    }



    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public boolean isRequiredAvailable() {
        boolean isAllItemsAvailable= ((houseNo !=null && !houseNo.isEmpty())&& (streetName !=null && !streetName.isEmpty())&&
                (city !=null && !city.isEmpty()) && (state !=null && !state.isEmpty())&&(zipCode !=null && !zipCode.isEmpty()) );

        return isRequiredAvailable();
    }
}


