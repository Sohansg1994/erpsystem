package com.erpsystem.erpsystem.entity.Contact;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class Address extends ContactDetails{


    @Column(nullable = false)
    private String houseNo;

    @Column(nullable = false)
    private String streetName;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private String zipCode;

    public Address(String mobileNo, String telephoneNo, String email, String faxNo, String houseNo, String streetName,
                   String city, String state, String zipCode) {
        super(mobileNo, telephoneNo, email, faxNo);
        this.houseNo = houseNo;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Address(){
        super();
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
}
