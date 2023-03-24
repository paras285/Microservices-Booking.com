package com.nagarro.nagp.hotelService.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.nagarro.nagp.hotelService.dto.HotelDetails;

@Component
public class HotelDetailsHelper {

	List<HotelDetails> hotelDetailsList = new ArrayList<HotelDetails>();

	public List<HotelDetails> getHotelDetailsList() {
		return hotelDetailsList;
	}

	public void setHotelDetailsList(List<HotelDetails> hotelDetailsList) {
		this.hotelDetailsList = hotelDetailsList;
	}

	public HotelDetailsHelper() throws ParseException {
		HotelDetails hotelDetails1 = new HotelDetails(1, "TAJ", "DELHI",
				new SimpleDateFormat("yyyy-MM-dd").parse("2023-5-28"),
				new SimpleDateFormat("yyyy-MM-dd").parse("2023-5-29"), 10000l);
		HotelDetails hotelDetails2 = new HotelDetails(2, "HYATT", "DELHI",
				new SimpleDateFormat("yyyy-MM-dd").parse("2023-5-28"),
				new SimpleDateFormat("yyyy-MM-dd").parse("2023-5-29"), 10000l);
		HotelDetails hotelDetails3 = new HotelDetails(3, "LEELA", "DELHI",
				new SimpleDateFormat("yyyy-MM-dd").parse("2023-5-28"),
				new SimpleDateFormat("yyyy-MM-dd").parse("2023-5-29"), 10000l);
		HotelDetails hotelDetails4 = new HotelDetails(4, "RADDISSON", "DELHI",
				new SimpleDateFormat("yyyy-MM-dd").parse("2023-5-28"),
				new SimpleDateFormat("yyyy-MM-dd").parse("2023-5-29"), 10000l);
		HotelDetails hotelDetails5 = new HotelDetails(5, "RAMADA", "DELHI",
				new SimpleDateFormat("yyyy-MM-dd").parse("2023-5-28"),
				new SimpleDateFormat("yyyy-MM-dd").parse("2023-5-29"), 10000l);
		hotelDetailsList.add(hotelDetails1);
		hotelDetailsList.add(hotelDetails2);
		hotelDetailsList.add(hotelDetails3);
		hotelDetailsList.add(hotelDetails4);
		hotelDetailsList.add(hotelDetails5);
	}
}
