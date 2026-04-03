package com.ashokit.service;

import com.ashokit.dao.CustomerDao;
import com.ashokit.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public Customer creatingNewBrandCustomer(Customer customer) {
        //If given entity doesn't have value for primary key column will go for insertion otherwise updation
        return customerDao.save(customer);
    }

    @Override
    public Iterable<Customer> creatingNewBrandCustomers(List<Customer> customers) {
       return customerDao.saveAll(customers);
    }

    @Override
    public Customer findCustomerById(Integer customerId) {
        Optional<Customer> optionalCustomer = customerDao.findById(customerId);
        return optionalCustomer.orElse(null);
    }

    @Override
    public Iterable<Customer> fetchAllCustomers() {
        return customerDao.findAll();
    }
}
