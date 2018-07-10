package com.qa.AccountApplication;

public class Account {
	
	private long id;
	private String firstName;
	private String lastName;
	private String accountNumber;
	
	public Account(long id, String firstName, String lastName, String accountNumber) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
	}
	
	public Long getID() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String toString() {
		return "Account ID: "+ getID() + "\n"
				+ "First name: " + getFirstName() + "\n"
				+ "Last name: " + getLastName() + "\n"
				+ "Account number: " + getAccountNumber();
	}
	
	

}
