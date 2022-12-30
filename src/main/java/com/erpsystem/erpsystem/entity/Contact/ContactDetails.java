package com.erpsystem.erpsystem.entity.Contact;

import com.erpsystem.erpsystem.dto.ContactDTO;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name="contactDetails")

public class ContactDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "contact_detail_id")
    private int ContactDetailId;

    @Column(nullable = false)
    private String mobileNo;

    @Column(nullable = true)
    private String telephoneNo;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String faxNo;

    @OneToOne(mappedBy = "contactDetails")
    private ContactEntity contactEntity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_detail_id", referencedColumnName = "address_id")
    private Address address;




    public ContactDetails(ContactDTO contactDTO) {
        this.mobileNo =contactDTO.getMobileNo();
        this.telephoneNo = contactDTO.getTelephoneNo();
        this.email = contactDTO.getEmail();
        this.faxNo = contactDTO.getFaxNo();
        this.address=new Address(contactDTO.getAddressDTO());
    }

    public ContactDetails(){}

    public int getContactDetailId() {
        return ContactDetailId;
    }

    public void setContactDetailId(int contactDetailId) {
        ContactDetailId = contactDetailId;
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

    public ContactEntity getContactEntity() {
        return contactEntity;
    }

    public void setContactEntity(ContactEntity contactEntity) {
        this.contactEntity = contactEntity;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}