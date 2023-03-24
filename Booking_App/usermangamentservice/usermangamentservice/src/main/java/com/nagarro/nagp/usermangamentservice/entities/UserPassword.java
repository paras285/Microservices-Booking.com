package com.nagarro.nagp.usermangamentservice.entities;

import java.io.Serializable;

public class UserPassword implements Serializable {

	private static final long serialVersionUID = 2245271105516797558L;
	private long id;
	private String emailAddress;
	private String password;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserPassword(String userId, String password) {
		super();
		this.emailAddress = userId;
		this.password = password;
	}
	
	public UserPassword() {
		super();
	}

}
