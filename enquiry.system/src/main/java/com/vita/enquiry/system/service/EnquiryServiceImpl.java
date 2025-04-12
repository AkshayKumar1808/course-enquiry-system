package com.vita.enquiry.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vita.enquiry.system.repository.EnquiryRepository;
import com.vita.libraries.model.Enquiry;
import com.vita.libraries.model.ResponseModel;

@Service
public class EnquiryServiceImpl implements EnquiryService {

	@Autowired
	private EnquiryRepository enquiryRepository;

	@Override
	public ResponseModel getAllEnquiries() {
		// TODO Auto-generated method stub
		List<Enquiry> enquiries = enquiryRepository.findAll();
		if (!enquiries.isEmpty()) {
			return new ResponseModel.Builder().setObj(enquiries.toString())
					.setMessage("All enquiries fetched successfully").build();
		}
		return ResponseModel.Builder().setObj(null).setExceptionCode(304)
				.setExceptionDescription("Their is no any enquiry is present").build();
	}

}
