package com.nagarro.nagp.checkoutservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.checkoutservice.dto.HotelBookingDetails;
import com.nagarro.nagp.checkoutservice.dto.UserBookingEventDto;
import com.nagarro.nagp.checkoutservice.services.HotelBookingService;

@RestController
public class ConfirmHotelBookingController {

	@Autowired
	private HotelBookingService hotelBookingService;

	@PostMapping("confirm-hotel")
	public UserBookingEventDto confirmHotelBooking(@RequestBody HotelBookingDetails bookingDetails) {
		return hotelBookingService.confirmHotelBooking(bookingDetails);
	}
}