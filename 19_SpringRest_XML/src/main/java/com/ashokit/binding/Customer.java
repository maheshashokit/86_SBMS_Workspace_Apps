package com.ashokit.binding;

import jakarta.xml.bind.annotation.*;

import java.util.List;

@XmlRootElement   //root element to be represent in xml file
@XmlAccessorType(XmlAccessType.FIELD) //performing the marshalling process at field level
public class Customer {

    @XmlElement(name="customerId")
    private Integer id;

    @XmlElement(name="customerName")
    private String name;

    @XmlElement(name="customerLocation")
    private String location;

    @XmlElementWrapper(name = "customerOrdersList") //wrapping orders into ordersList
    @XmlElement(name="customerOrder")
    private List<Order> orders;

    public Customer(){

    }

    public Customer(Integer id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public Customer(Integer id, String name, String location, List<Order> orders) {
        this.id = id;
        this.orders = orders;
        this.location = location;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", orders=" + orders +
                '}';
    }
}
