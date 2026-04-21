package com.ashokit.dao;

import com.ashokit.entity.Enquiry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EnquiryDao extends CrudRepository<Enquiry, Integer>, ListCrudRepository<Enquiry,Integer>, PagingAndSortingRepository<Enquiry,Integer> {
}
