package com.dvt.databaselayer.entities;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

/**
 *
 * @author hmanganyi
 */

@Entity
@Table(name = "\"Customer\"")
@NamedQueries({
    @NamedQuery(name = "Customer.findByPhoneNumber", query = "from Customer c where c.phoneNumber = :phoneNumber")})
public class Customer implements Serializable {
    
    @Id
    @Column(name = "\"ID\"")
    @SequenceGenerator(name = "customer_seq" ,sequenceName = "customerid_seq",initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq")
    private Integer id;
    @Column(name = "\"FIRSTNAME\"")
    private String firstName;
    @Column(name = "\"LASTNAME\"")
    private String lastName;
    @Column(name = "\"USERNAME\"")
    private String username;
    @Column(name = "\"PHONENUMBER\"")
    private String phoneNumber;
    @Column(name = "\"ZIPCODE\"")
    private String zipCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}