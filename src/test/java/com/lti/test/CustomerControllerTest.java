package com.lti.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.controller.CustomerController;
import com.lti.entity.Customer;
import com.lti.entity.EmployementTypeEnum;

public class CustomerControllerTest {

	CustomerController controller;

	@Before
	public void initialize() {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		controller = context.getBean(CustomerController.class);
	}

	@Test
	public void signupTest() {
		Customer customer = new Customer();
		customer.setName("Parth");
		customer.setEmail("Parth@gmail.com");
		customer.setDob(LocalDate.of(2022, 02, 01));
		customer.setAdharNumber("123445");
		customer.setPanNumber("BJK123");
		customer.setPhoneNumber("87864353");
		customer.setOrganizationName("LTI");
		customer.setCustomer_income(132214);
		customer.setEmploymentType(EmployementTypeEnum.PERMANENT);

		String actualMessage = controller.signup(customer);
		System.out.println(actualMessage);
	}

	@Test
	public void findCustomerTest() {
		Customer customer = controller.findCustomer(3);
		System.out
				.println("Customer Name - " + customer.getName() + "\n" + "Customer Id - " + customer.getCustomerId());

	}

	@Test
	public void viewAllCustomerTest() {
		List<Customer> customerList = controller.viewAllCustomers();
		assertFalse(customerList.isEmpty());
	}

}
