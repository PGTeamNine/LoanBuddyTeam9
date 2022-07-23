package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "customer_tbl")
public class Customer {
	// Fields for customer
	@Id
	@SequenceGenerator(name = "cust_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "cust_seq",strategy = GenerationType.SEQUENCE)
	int customerId;
	String name;
	String email;
	String password;
	LocalDate dob;
	String adharNumber;
	String panNumber;
	String phoneNumber;
	String organizationName;
	double customer_income;
	EmployementTypeEnum employmentType;
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public double getCustomer_income() {
		return customer_income;
	}
	public void setCustomer_income(double customer_income) {
		this.customer_income = customer_income;
	}
	public EmployementTypeEnum getEmploymentType() {
		return employmentType;
	}
	public void setEmploymentType(EmployementTypeEnum employmentType) {
		this.employmentType = employmentType;
	}
	public int getCustomerId() {
		return customerId;
	}
	
	
}
