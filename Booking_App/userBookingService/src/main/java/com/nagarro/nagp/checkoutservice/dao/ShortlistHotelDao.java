package com.nagarro.nagp.checkoutservice.dao;

import java.util.List;

import com.nagarro.nagp.checkoutservice.dto.HotelShortlistDetials;

public interface ShortlistHotelDao {

	void shortlistHotels(HotelShortlistDetials hotelShortlistDetials);

	List<String> getShortlistHotels(String userId);

}
