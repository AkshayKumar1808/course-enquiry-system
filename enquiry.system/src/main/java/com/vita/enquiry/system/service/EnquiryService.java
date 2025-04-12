package com.vita.enquiry.system.service;


import com.vita.enquiry.system.dto.EnquiryPayload;
import com.vita.libraries.model.ResponseModel;

public interface EnquiryService {

	public ResponseModel getAllEnquiries();
	
	public ResponseModel addEnquiry(EnquiryPayload enquiryPayload);
}
