package com.nagarro.nagp.checkoutservice.dto;

public class HotelBookingDetails {

	private String userId;
	private String hotelId;
	private String paymentOption;
	private String price;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
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

	public HotelBookingDetails(String userId, String hotelId) {
		super();
		this.userId = userId;
		this.hotelId = hotelId;
	}

}
