package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dao.CustomerDao;
import com.lti.entity.Contact;
import com.lti.entity.Customer;
import com.lti.entity.Property;
import com.lti.service.ContactService;
import com.lti.service.CustomerService;
import com.lti.service.PropertyService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	@Autowired
	PropertyService propertyService;
	CustomerDao dao1;
	@Autowired
	ContactService contactService;
	// http://localhost:8181/LoanBuddy/myapp/customers/customer/3
	//@RequestMapping(value = "/signup",method = RequestMethod.POST)
	@PostMapping(value = "/signup")
	public String signup(@RequestBody Customer customer) {
		String message=customerService.registerNewCustomer(customer);
		return message;
	}
	@GetMapping("/customer/{customerId}")
	public Customer findCustomer(@PathVariable int customerId) {
		return customerService.findCustomer(customerId);
	}
	@GetMapping("/viewAllCustomers")
	public List<Customer> viewAllCustomers(){
		return customerService.viewAllCustomers();
	}


	

	
}
