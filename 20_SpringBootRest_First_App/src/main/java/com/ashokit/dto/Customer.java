package com.ashokit.dto;

public class Customer {

    private String custId;

    private String custName;

    private String custLocation;

    public Customer(){
    }

    public Customer(String custId, String custLocation, String custName) {
        this.custId = custId;
        this.custLocation = custLocation;
        this.custName = custName;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustLocation() {
        return custLocation;
    }

    public void setCustLocation(String custLocation) {
        this.custLocation = custLocation;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId='" + custId + '\'' +
                ", custName='" + custName + '\'' +
                ", custLocation='" + custLocation + '\'' +
                '}';
    }
}
