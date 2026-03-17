package com.ashokit.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//Field Names = properties file key names
@Component
//Reading data from properties file based on common prefix
@ConfigurationProperties(prefix = "com.ashokit.customer")
public class Customer {

    private String id;

    private String name;

    private Integer billAmount;

    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        System.out.println("Customer.setId");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Customer.setName");
        this.name = name;
    }

    public Integer getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(Integer billAmount) {
        System.out.println("Customer.setBillAmount");
        this.billAmount = billAmount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", billAmount='" + billAmount + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
