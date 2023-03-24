package com.nagarro.nagp.checkoutservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.checkoutservice.dto.HotelShortlistDetials;
import com.nagarro.nagp.checkoutservice.services.ShortlistHotelService;

@RestController
@RequestMapping("shortlist")
public class ShortlistHotelController {

	@Autowired
	private ShortlistHotelService shortlistHotelService;

	@PostMapping("hotel")
	public String shortlistHotels(@RequestBody HotelShortlistDetials hotelShortlistDetials) {
		return shortlistHotelService.shortlistHotels(hotelShortlistDetials);
	}
	
	@GetMapping("hotel")
	public String getShortlistHotels(@RequestParam String userId) {
		return shortlistHotelService.getShortlistHotels(userId);
	}
}
