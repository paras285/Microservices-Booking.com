package com.nagarro.nagp.hotelService.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.hotelService.services.HotelConfirmationService;

@RestController
public class HotelConfirmationController {

	@Autowired
	private HotelConfirmationService hotelConfirmationService;
	
	@PostMapping("confirm")
	public boolean confirmHotelBooking(@RequestBody String hotelId) {
		return hotelConfirmationService.confirmHotelBooking(hotelId);
	}
}
