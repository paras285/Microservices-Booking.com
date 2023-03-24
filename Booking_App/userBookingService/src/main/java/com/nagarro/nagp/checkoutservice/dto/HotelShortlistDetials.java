package com.nagarro.nagp.checkoutservice.dto;

public class HotelShortlistDetials {

	private String userId;
	private String hotelId;

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

	public HotelShortlistDetials(String userId, String hotelId) {
		super();
		this.userId = userId;
		this.hotelId = hotelId;
	}

}
