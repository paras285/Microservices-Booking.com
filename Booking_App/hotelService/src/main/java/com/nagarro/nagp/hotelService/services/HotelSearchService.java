package com.nagarro.nagp.hotelService.services;

import java.util.List;

import com.nagarro.nagp.hotelService.dto.HotelDetails;
import com.nagarro.nagp.hotelService.dto.TravelDetails;

public interface HotelSearchService {

	List<HotelDetails> getHotelDetails(TravelDetails travelDetails);

	List<HotelDetails> getHotelDetails(List<String> hotelIdList);

}
