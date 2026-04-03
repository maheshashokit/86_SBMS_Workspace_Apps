package com.ashokit.service;

import com.ashokit.entity.Customer;
import java.util.List;

public interface CustomerService {

    //1.Method for saving customers information for dummy data
    public Iterable<Customer> saveAllCustomers(List<Customer> customers);

    //2.Method for Fetching records based on supplied PageNo
    public List<Customer> getCustomerInfo(int pageNo, int pageSize);

    //3.Method to perform sorting
    public void getAllCustomerInSortingOrder(String direction,String... args);

    //4.Method for Fetching all the page of Records
    public void getCustomerInfo();
}