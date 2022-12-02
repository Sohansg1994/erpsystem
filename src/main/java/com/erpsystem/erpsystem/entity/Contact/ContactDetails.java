package com.erpsystem.erpsystem.entity.Contact;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="contactDetails")
@Inheritance(strategy =InheritanceType.TABLE_PER_CLASS)
public class ContactDetails implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="contact_detail_id", nullable = false)
    private int ContactDetailId;

    @Column(nullable = false)
    private String mobileNo;

    @Column(nullable = true)
    private String telephoneNo;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String faxNo;

    public ContactDetails(String mobileNo, String telephoneNo, String email, String faxNo) {
        this.mobileNo = mobileNo;
        this.telephoneNo = telephoneNo;
        this.email = email;
        this.faxNo = faxNo;
    }


    public ContactDetails(){
        super();
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
}