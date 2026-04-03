package com.ashokit.dao;

import com.ashokit.entity.Employee;
import org.springframework.data.repository.CrudRepository;
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

}