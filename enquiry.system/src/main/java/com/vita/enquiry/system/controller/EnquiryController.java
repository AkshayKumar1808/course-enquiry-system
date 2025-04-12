package com.vita.enquiry.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vita.enquiry.system.service.EnquiryService;
import com.vita.libraries.model.ResponseModel;
@RequestMapping("/enquiry/v1")
@RestController
public class EnquiryController {
	@Autowired
	private EnquiryService enquiryService;

	@GetMapping("/Allenquiry")
	public ResponseEntity<ResponseModel> getAllEnquiries() {
		ResponseModel response = enquiryService.getAllEnquiries();
		if (response.getExceptionCode() == -1) {
			return new ResponseEntity<>(response, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
