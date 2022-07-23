package com.lti.test;

import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.lti.dao.CustomerDao;
import com.lti.entity.Customer;
import com.lti.entity.EmployementTypeEnum;

public class CTest {
	
	CustomerDao dao;

	@Before
	public void initializeDao() {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		dao = context.getBean(CustomerDao.class);
	}

	@Test
	public void viewAllCustomers() {
		List<Customer> listCustomer = dao.viewAllCustomers();
		for (Customer i : listCustomer) {
			System.out.println(i.getCustomerId() + " " + i.getName() + " " + i.getEmail() + " " + i.getPassword() + " "
					+ i.getDob() + " " + i.getAdharNumber() + " " + i.getPanNumber() + " " + i.getPhoneNumber() + " "
					+ i.getOrganizationName() + " " + i.getCustomer_income() + " " + i.getEmploymentType());
		}
		assertNotNull(listCustomer);
	}
	
	@Test
	public void addOrUpdateCustomerTest() {
		Customer customer = new Customer();
		customer.setName("Swati");
		customer.setEmail("swati@lti.com");
		customer.setPassword("Pass@123");
		customer.setDob(LocalDate.of(2022, 02, 01));
		customer.setAdharNumber("123445");
		customer.setPanNumber("BJK123");
		customer.setPhoneNumber("87864353");
		customer.setOrganizationName("LTI");
		customer.setCustomer_income(132214);
		customer.setEmploymentType(EmployementTypeEnum.PERMANENT);
		
		

		Customer savedUser = dao.addOrUpdateCustomer(customer);

		assertNotNull(savedUser);
	}
	
	@Test
	public void getCustomerByIdTest() {
		 Customer customer=dao.getCustomerById(1);
		 System.out.println(customer.getName());
		 assertNotNull(customer);
	
	}
	
	
	
	

}
