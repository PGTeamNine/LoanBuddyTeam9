package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lti.entity.Customer;
import com.lti.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	public String signup(Customer customer) {
		String message=customerService.registerNewCustomer(customer);
		return message;
	}
	
	public Customer findCustomer(int customerId) {
		return customerService.findCustomer(customerId);
	}
	
	public List<Customer> viewAllCustomers(){
		return customerService.viewAllCustomers();
	}
	
}
