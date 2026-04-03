package com.ashokit.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.enities.Customer;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerDao extends JpaRepository<Customer, Integer> {

    public List<Customer> findByCustomerName(String customerName);

    public List<Customer> findByCustomerLocation(String customerLocation);

    public Customer findByCustomerNameAndCustomerLocation(String customerName,String customerLocation);

    public Page<Customer> findByCustomerLocation(String location, Pageable pageable);

    public List<Customer> findByCustomerName(String name, Sort sort);

    public Integer countByCustomerName(String name);

    //@Query(value="select c.* from Customer c") //HQL Query
    @Query(value="from Customer c")//HQL Query
    public Iterable<Customer> getAllCustomersByCustomQuery();

    @Query(value="select * from ashokit_customers", nativeQuery=true) //SQL Query
    public Iterable<Customer> getAllCustomersByNativeQuery();

    @Query(value="select customer_name,customer_location from ashokit_customers", nativeQuery=true)
    public List<Object[]> getCustomerNameAndCustomerLocationByCustomQuery();

    @Query(value="select c.customerName,c.customerLocation from Customer c")
    public List<Object[]> getCustomerNameAndCustomerLocationByHQLQuery();

    //NamedParameters
    @Query(value="from Customer c where c.customerLocation=:custLocation")
    public List<Customer> getAllCustomersByCity(String custLocation);

    //IndexedParameters
    @Query(value="from Customer c where c.customerLocation=?1")
    public List<Customer> getAllCustomersByLocation(String custLocation);
}