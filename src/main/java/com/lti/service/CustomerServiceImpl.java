package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.CustomerDao;
import com.lti.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;

	public String registerNewCustomer(Customer customer) {
		try {
			Customer customer1 = customerDao.addOrUpdateCustomer(customer);
			return "Registration Successful. Your user Id is : " + customer1.getCustomerId();
		} catch (Exception e) {

			return "Error Occured While Registration.";
		}

	}

	public Customer findCustomer(int customerId) {
		// TODO Auto-generated method stub
		Customer customer2 = customerDao.getCustomerById(customerId);
		return customer2;
	}

	public List<Customer> viewAllCustomers() {
		// TODO Auto-generated method stub
		List<Customer> customerList = customerDao.viewAllCustomers();
		return customerList;
	}

}
