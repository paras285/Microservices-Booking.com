package com.nagarro.nagp.checkoutservice.services;

import com.nagarro.nagp.checkoutservice.dto.HotelShortlistDetials;

public interface ShortlistHotelService {

	String shortlistHotels(HotelShortlistDetials hotelShortlistDetials);

	String getShortlistHotels(String userId);

}
