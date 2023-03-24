package com.nagarro.nagp.checkoutservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.checkoutservice.dto.FlightBookingDetails;
import com.nagarro.nagp.checkoutservice.dto.UserBookingEventDto;
import com.nagarro.nagp.checkoutservice.services.FlightBookingService;

@RestController
public class ConfirmFlightBookingController {
	
	@Autowired
	private FlightBookingService flightBookingService;
	
	@PostMapping("confirm-flight")
	public UserBookingEventDto confirmFlightBooking(@RequestBody FlightBookingDetails bookingDetails) {
		return flightBookingService.confirmFlightBooking(bookingDetails);
		
	}

}
