package com.lti.entity;

public class LoanApplication {
	int loanAppId;
	double maxLoanGrant;
	int tenure;
	double loanAmmount;

	Character customer;

	Property property;

	boolean isApproved;

	public double getMaxLoanGrant() {
		return maxLoanGrant;
	}

	public void setMaxLoanGrant(double maxLoanGrant) {
		this.maxLoanGrant = maxLoanGrant;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public double getLoanAmmount() {
		return loanAmmount;
	}

	public void setLoanAmmount(double loanAmmount) {
		this.loanAmmount = loanAmmount;
	}

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}

	public int getLoanAppId() {
		return loanAppId;
	}

	public Character getCustomer() {
		return customer;
	}

	public Property getProperty() {
		return property;
	}

}
