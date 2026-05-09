package com.ashokit.controller;

import com.ashokit.dto.Customer;
import com.ashokit.util.CustomerUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customers")
public class CustomerResource {

    @GetMapping(value="/")
    public ResponseEntity<List<Customer>> getAllCustomers(){
        List<Customer> allCustomers = CustomerUtils.getAllCustomers();
        return new ResponseEntity<List<Customer>>(allCustomers, HttpStatus.OK);
    }

    @GetMapping(value="/{customerId}")
    public ResponseEntity<?> getCustomersDetails(@PathVariable("customerId") String customerId){
        //Get All Customers
        List<Customer> allcustomers = CustomerUtils.getAllCustomers();

        //filtering the customer based on customerId path variable
        Optional<Customer> customerOpt = allcustomers.stream().filter(eachCustomer -> eachCustomer.getCustId().equals(customerId)).findFirst();

        if(customerOpt.isPresent()) {
            return new ResponseEntity<Customer>(customerOpt.get(),HttpStatus.OK);
        }else {
            return new ResponseEntity<String>("Customer Data Not Found With Supplied CustomerId...",HttpStatus.OK);
        }
    }

    @PostMapping(value="/",consumes = {"application/json","application/xml"})
    public ResponseEntity<String> createNewCustomer(@RequestBody Customer customer){
        System.out.println("Customer Object:::::" + customer);
        String custOpt = Optional.of(customer).get().getCustId();
        return new ResponseEntity<String>(custOpt+" Record Created Successfully",HttpStatus.CREATED);
    }
}
