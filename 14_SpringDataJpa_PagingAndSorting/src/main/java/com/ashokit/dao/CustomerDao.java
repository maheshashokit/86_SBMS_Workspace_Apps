package com.ashokit.dao;

import com.ashokit.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerDao extends PagingAndSortingRepository<Customer,Integer>, CrudRepository<Customer,Integer> {
}
