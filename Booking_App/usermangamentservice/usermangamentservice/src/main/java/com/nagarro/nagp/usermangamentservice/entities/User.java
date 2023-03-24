package com.nagarro.nagp.usermangamentservice.entities;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = -6782669083663128139L;
	private String id;
	private String emailId;
	private String firstName;
	private String lastName;
	private String address;
	private long contactNumber;
	private String balance;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public User(String id, String emailId, String firstName, String lastName, String address, long contactNumber) {
		this.id = id;
		this.emailId = emailId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.contactNumber = contactNumber;
		this.balance = "30000";
	}

	public User() {
		super();
	}

}
