package com.nagarro.nagp.usermangamentservice.dto;

import java.io.Serializable;

public class UserAuthenticatorDto implements Serializable {

	private static final long serialVersionUID = -3199364340873024029L;
	private String emailId;
	private String password;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
