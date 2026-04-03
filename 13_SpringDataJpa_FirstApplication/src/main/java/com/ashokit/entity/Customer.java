package com.ashokit.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "shopping_customers")
public class Customer {

    @Id
    @Column(name="cust_id")
    /*@GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_seq"
    )
    @SequenceGenerator(
            name = "customer_seq",
            sequenceName ="shopping_customers_seq",
            initialValue = 1000,
            allocationSize = 1
    )*/
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue(strategy = GenerationType.TABLE)
    @GeneratedValue(strategy=GenerationType.TABLE, generator="customers")
    @TableGenerator(
            name="customers",
            table="sequence_store",
            pkColumnName = "seq_name",
            valueColumnName = "seq_value",
            pkColumnValue="customers_seq_id",
            initialValue=1,
            allocationSize=1
    )
    private Integer customerId;

    @Column(name="cust_name")
    private String customerName;

    @Column(name="email")
    private String emailId;

    private String location;

    @Column(name="contact_no")
    private String contactNo;

    public Customer(){

    }

    public Customer(Integer customerId, String customerName, String emailId, String location, String contactNo) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.emailId = emailId;
        this.location = location;
        this.contactNo = contactNo;
    }

    public Customer(String customerName, String emailId, String location, String contactNo) {
        this.customerName = customerName;
        this.emailId = emailId;
        this.location = location;
        this.contactNo = contactNo;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", location='" + location + '\'' +
                ", contactNo='" + contactNo + '\'' +
                '}';
    }
}
