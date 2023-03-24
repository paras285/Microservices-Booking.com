package com.nagarro.nagp.hotelService.dto;

import java.io.Serializable;
import java.util.Date;

public class HotelDetails implements Serializable {

	private static final long serialVersionUID = 4916383462707792078L;

	private int id;
	private String hotelName;
	private String city;
	private Date availableCheckInDate;
	private Date availableCheckOutDate;
	private long price;
	private boolean hotelStatus = true;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getAvailableCheckInDate() {
		return availableCheckInDate;
	}

	public void setAvailableCheckInDate(Date availableCheckInDate) {
		this.availableCheckInDate = availableCheckInDate;
	}

	public Date getAvailableCheckOutDate() {
		return availableCheckOutDate;
	}

	public void setAvailableCheckOutDate(Date availableCheckOutDate) {
		this.availableCheckOutDate = availableCheckOutDate;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public boolean isHotelStatus() {
		return hotelStatus;
	}

	public void setHotelStatus(boolean hotelStatus) {
		this.hotelStatus = hotelStatus;
	}

	public HotelDetails(int id, String hotelName, String city, Date availableCheckInDate, Date availableCheckOutDate,
			long price) {
		super();
		this.id = id;
		this.hotelName = hotelName;
		this.city = city;
		this.availableCheckInDate = availableCheckInDate;
		this.availableCheckOutDate = availableCheckOutDate;
		this.price = price;
	}

}
