package com.ashokit.service;

import com.ashokit.beans.EnquiryDTO;
import com.ashokit.dao.EnquiryDao;
import com.ashokit.entity.Enquiry;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnquiryServiceImpl implements EnquiryService{

    @Autowired
    private EnquiryDao enquiryDao;

    @Autowired
    private ModelMapper mapper;

    @Override
    public EnquiryDTO createEnquiry(EnquiryDTO enquiry) {

        //converting the DTO into entity for persisting the data
        Enquiry enquiry1 = mapper.map(enquiry, Enquiry.class);

        //Persisting the data
        Enquiry savedEnquiryDetails = enquiryDao.save(enquiry1);

        //converting the entity object into DTO object for presenting data in UI
        return mapper.map(savedEnquiryDetails, EnquiryDTO.class);
    }

    @Override
    public List<Enquiry> getAllEnquires() {
        return enquiryDao.findAll();
    }

    @Override
    public Page<Enquiry> getAllEnquiresByPages(int pageNo, int pageSize) {
        Pageable pageEnquiries = PageRequest.of(pageNo-1, pageSize);
        return enquiryDao.findAll(pageEnquiries);
    }

    @Override
    public Page<Enquiry> getAllEnquiresSortByPage(int pageNo, int pageSize, String sortField, String sortDirection) {
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
                Sort.by(sortField).descending();
        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
        return this.enquiryDao.findAll(pageable);
    }
}
