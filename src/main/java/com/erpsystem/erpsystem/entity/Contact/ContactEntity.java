package com.erpsystem.erpsystem.entity.Contact;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class ContactEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "contact_detail_id")
    private ContactDetails contactDetails;

    public ContactEntity(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

     protected ContactEntity(){}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }
}
