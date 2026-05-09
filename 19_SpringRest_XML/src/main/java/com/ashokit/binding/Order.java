package com.ashokit.binding;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Order {

    @XmlElement(name="customerOrderNumber")
    private Integer orderId;

    @XmlElement(name="customerBillAmount")
    private double billAmount;

    public Order(){

    }

    public Order(Integer orderId, double billAmount) {
        this.orderId = orderId;
        this.billAmount = billAmount;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", billAmount=" + billAmount +
                '}';
    }
}
