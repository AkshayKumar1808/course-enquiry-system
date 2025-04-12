package com.vita.enquiry.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vita.libraries.model.Enquiry;

@Repository
public interface EnquiryRepository extends JpaRepository<Enquiry, Long> {

}
