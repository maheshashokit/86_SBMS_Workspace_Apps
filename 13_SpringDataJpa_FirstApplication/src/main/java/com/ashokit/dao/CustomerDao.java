package com.ashokit.dao;

import com.ashokit.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDao extends CrudRepository<Customer,Integer> {


}
