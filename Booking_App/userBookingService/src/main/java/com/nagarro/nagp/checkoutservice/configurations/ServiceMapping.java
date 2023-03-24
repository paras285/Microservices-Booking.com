package com.nagarro.nagp.checkoutservice.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "url")
public class ServiceMapping {

	private String hotelDetails;
	private String confirmPayment;
	private String confirmHotel;
	private String confirmFlight;
	private String flightDetails;

	public String getConfirmFlight() {
		return confirmFlight;
	}

	public void setConfirmFlight(String confirmFlight) {
		this.confirmFlight = confirmFlight;
	}

	public String getFlightDetails() {
		return flightDetails;
	}

	public void setFlightDetails(String flightDetails) {
		this.flightDetails = flightDetails;
	}

	public String getHotelDetails() {
		return hotelDetails;
	}

	public void setHotelDetails(String hotelDetails) {
		this.hotelDetails = hotelDetails;
	}

	public String getConfirmPayment() {
		return confirmPayment;
	}

	public void setConfirmPayment(String confirmPayment) {
		this.confirmPayment = confirmPayment;
	}

	public String getConfirmHotel() {
		return confirmHotel;
	}

	public void setConfirmHotel(String confirmHotel) {
		this.confirmHotel = confirmHotel;
	}

}
