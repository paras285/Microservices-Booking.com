package com.nagarro.nagp.flightmanagement.helper;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.nagarro.nagp.flightmanagement.dto.FlightDetails;

@Component
public class FlightListDetails {

	private List<FlightDetails> flightDetailsList = new ArrayList<>();

	public FlightListDetails() throws ParseException {
		FlightDetails flightDetails1 = new FlightDetails("1","AIR-INDIA", "AMRITSAR", "DELHI", "ECONOMY",
				new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2023-5-28"), 5000l);
		FlightDetails flightDetails2 = new FlightDetails("2","AIR-INDIA", "AMRITSAR", "MUMBAI", "ECONOMY",
				new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2023-5-28"), 7500l);
		FlightDetails flightDetails3 = new FlightDetails("3","AIR-INDIA", "AMRITSAR", "BANGALORE", "ECONOMY",
				new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2023-5-28"), 8000l);
		FlightDetails flightDetails4 = new FlightDetails("4","AIR-INDIA", "AMRITSAR", "DELHI", "BUSINESS",
				new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2023-5-28"), 15000l);
		FlightDetails flightDetails5 = new FlightDetails("5","AIR-INDIA", "AMRITSAR", "MUMBAI", "BUSINESS",
				new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2023-5-28"), 25000l);
		FlightDetails flightDetails6 = new FlightDetails("6","AIR-INDIA", "DELHI", "AMRITSAR", "ECONOMY",
				new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2023-5-28"), 25000l);
		FlightDetails flightDetails7 = new FlightDetails("7","AIR-INDIA", "MUMBAI", "AMRITSAR", "ECONOMY",
				new java.text.SimpleDateFormat("yyyy-MM-dd").parse("2023-5-28"), 25000l);
		flightDetailsList.add(flightDetails1);
		flightDetailsList.add(flightDetails2);
		flightDetailsList.add(flightDetails3);
		flightDetailsList.add(flightDetails4);
		flightDetailsList.add(flightDetails5);
		flightDetailsList.add(flightDetails6);
		flightDetailsList.add(flightDetails7);
	}

	public List<FlightDetails> getFlightDetailsList() {
		return flightDetailsList;
	}

	public void setFlightDetailsList(List<FlightDetails> flightDetailsList) {
		this.flightDetailsList = flightDetailsList;
	}
	
}
