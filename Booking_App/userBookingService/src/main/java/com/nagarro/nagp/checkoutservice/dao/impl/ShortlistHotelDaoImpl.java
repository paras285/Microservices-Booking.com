package com.nagarro.nagp.checkoutservice.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.nagarro.nagp.checkoutservice.dao.ShortlistHotelDao;
import com.nagarro.nagp.checkoutservice.dto.HotelShortlistDetials;

@Repository
public class ShortlistHotelDaoImpl implements ShortlistHotelDao {

	Map<String, List<String>> shortlistMap = new HashMap<>();

	@Override
	public void shortlistHotels(HotelShortlistDetials hotelShortlistDetials) {
		if(shortlistMap.get(hotelShortlistDetials.getUserId()) == null) {
			List<String> hotelList = new ArrayList<>();
			hotelList.add(hotelShortlistDetials.getHotelId());
			shortlistMap.put(hotelShortlistDetials.getUserId(), hotelList);
		}else {
			List<String> shortlistedHotels = shortlistMap.get(hotelShortlistDetials.getUserId());
			shortlistedHotels.add(hotelShortlistDetials.getHotelId());
		}
	}

	@Override
	public List<String> getShortlistHotels(String userId) {
		return shortlistMap.get(userId);
	}

}
