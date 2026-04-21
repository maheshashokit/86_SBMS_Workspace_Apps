package com.ashokit.service;

import com.ashokit.beans.EnquiryDTO;
import com.ashokit.entity.Enquiry;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EnquiryService {

    public EnquiryDTO createEnquiry(EnquiryDTO enquiry);

    //Getting the all enquires information with out pagination
    public List<Enquiry> getAllEnquires();

    //Getting all enquires information with pagination
    public Page<Enquiry> getAllEnquiresByPages(int pageNo, int pageSize);

    //Getting all enquires information with pagination and Sorting support
    public Page<Enquiry> getAllEnquiresSortByPage(int pageNo,int pageSize,String sortField,String sortDirection);


}
