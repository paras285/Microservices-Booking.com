package com.nagarro.nagp.hotelService.dao;

import java.util.List;

import com.nagarro.nagp.hotelService.dto.HotelDetails;
import com.nagarro.nagp.hotelService.dto.TravelDetails;

public interface HotelSearchDao {

	public List<HotelDetails> getHotelDetails(TravelDetails travelDetails);

	public List<HotelDetails> getHotelDetails(List<String> hotelIdList);
}
