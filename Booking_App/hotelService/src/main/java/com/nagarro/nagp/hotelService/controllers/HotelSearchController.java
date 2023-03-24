package com.nagarro.nagp.hotelService.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.hotelService.dto.HotelDetails;
import com.nagarro.nagp.hotelService.dto.TravelDetails;
import com.nagarro.nagp.hotelService.services.HotelSearchService;

@RestController
public class HotelSearchController {
	
	@Autowired
	private HotelSearchService hotelSearchService;
	
	@GetMapping("hotel-listing")
	public List<HotelDetails> searchHotels(@RequestParam Map<String,String> queryParameters) throws ParseException {
		String hotelName = queryParameters.get("hotelName");
		String city = queryParameters.get("city");
		String checkInDate = queryParameters.get("checkInDate");
		String checkOutDate = queryParameters.get("checkOutDate");
		
		if(StringUtils.isBlank(city) || StringUtils.isBlank(checkInDate) || StringUtils.isBlank(checkOutDate)) {
			return new ArrayList<>();
		}
		
		TravelDetails travelDetails = new TravelDetails();
		travelDetails.setCity(city);
		travelDetails.setHotelName(hotelName);
		travelDetails.setCheckInDate(new SimpleDateFormat("yyyy-MM-dd").parse(checkInDate));
		travelDetails.setCheckOutDate(new SimpleDateFormat("yyyy-MM-dd").parse(checkOutDate));
		
		return hotelSearchService.getHotelDetails(travelDetails);
	}
	
	@GetMapping("hotel-details")
	public List<HotelDetails> searchHotels(@RequestParam List<String> hotelId){
		return hotelSearchService.getHotelDetails(hotelId);
	}


}
