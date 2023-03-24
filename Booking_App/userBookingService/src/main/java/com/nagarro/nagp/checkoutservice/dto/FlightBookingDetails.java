package com.nagarro.nagp.checkoutservice.dto;

import java.io.Serializable;
import java.util.List;

public class FlightBookingDetails implements Serializable {

	private static final long serialVersionUID = 4550687088174736517L;
	private String userId;
	private List<String> flightId;
	private String paymentOption;
	private String price;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<String> getFlightId() {
		return flightId;
	}

	public void setFlightId(List<String> flightId) {
		this.flightId = flightId;
	}

	public String getPaymentOption() {
		return paymentOption;
	}

	public void setPaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
