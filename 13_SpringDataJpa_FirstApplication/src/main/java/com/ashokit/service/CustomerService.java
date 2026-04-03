package com.ashokit.service;
import com.ashokit.entity.Customer;

import java.util.List;

public interface CustomerService {

    //creating single new customer
    public Customer creatingNewBrandCustomer(Customer customer);

    //creating bulk of new customers
    public Iterable<Customer> creatingNewBrandCustomers(List<Customer> customers);

   //Fetching customerDetails based on the customerId
    public Customer findCustomerById(Integer customerId);

    //Fetching all customer Details
    public Iterable<Customer> fetchAllCustomers();

}
