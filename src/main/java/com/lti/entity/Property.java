package com.lti.entity;

public class Property {
	int propertyId;
	String propertyLocation;
	String propertyAmount;
	PropertyType propertyType;
	Customer customer;

	public String getPropertyLocation() {
		return propertyLocation;
	}

	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}

	public String getPropertyAmount() {
		return propertyAmount;
	}

	public void setPropertyAmount(String propertyAmount) {
		this.propertyAmount = propertyAmount;
	}

	public PropertyType getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(PropertyType propertyType) {
		this.propertyType = propertyType;
	}

	public int getPropertyId() {
		return propertyId;
	}

	public Customer getCustomer() {
		return customer;
	}

}
