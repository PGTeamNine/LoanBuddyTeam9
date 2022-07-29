package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dao.CustomerDao;
import com.lti.entity.LoanApplication;
import com.lti.service.ContactService;
import com.lti.service.CustomerService;
import com.lti.service.LoanAppService;
import com.lti.service.PropertyService;

@RestController
@RequestMapping("/application")
public class LoanAppController {

	@Autowired
	CustomerService customerService;
	@Autowired
	PropertyService propertyService;
	CustomerDao dao1;
	@Autowired
	ContactService contactService;
	@Autowired
	LoanAppService loanService;
	
	@GetMapping("/allApplications")
	public List<LoanApplication> seeAllApplications()
	{
		return loanService.getAllApplications();
	}
	
	@GetMapping("/applicationForCust/{customerId}")
	public LoanApplication seeAppForCustomer(@PathVariable int customerId) {
		return loanService.getAppByCustId(customerId);
	}
	
	
	@GetMapping("/approvedApp")
	public List<LoanApplication> seeApproved() {
		return loanService.approvedApplications();
	}
	
	@GetMapping("/rejectedApp")
	public List<LoanApplication> seeRejected() {
		return loanService.rejectedApplications();
	}
	

	
	
	
	
}
