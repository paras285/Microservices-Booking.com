package com.nagarro.nagp.usermangamentservice.entities;

import java.io.Serializable;
import java.util.List;

public class UserPayment implements Serializable {

	private static final long serialVersionUID = -7395364389230924806L;
	private long id;
	private String userId;
	private List<String> upiDetails;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<String> getUpiDetails() {
		return upiDetails;
	}

	public void setUpiDetails(List<String> upiDetails) {
		this.upiDetails = upiDetails;
	}

}
