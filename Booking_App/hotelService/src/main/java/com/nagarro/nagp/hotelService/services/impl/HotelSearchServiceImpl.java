package com.nagarro.nagp.hotelService.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.nagp.hotelService.dao.HotelSearchDao;
import com.nagarro.nagp.hotelService.dto.HotelDetails;
import com.nagarro.nagp.hotelService.dto.TravelDetails;
import com.nagarro.nagp.hotelService.services.HotelSearchService;

@Service
public class HotelSearchServiceImpl implements HotelSearchService {

	@Autowired
	private HotelSearchDao hotelSearchDao;

	@Override
	public List<HotelDetails> getHotelDetails(TravelDetails travelDetails) {
		return hotelSearchDao.getHotelDetails(travelDetails);
	}

	@Override
	public List<HotelDetails> getHotelDetails(List<String> hotelIdList) {
		if(hotelIdList == null || hotelIdList.isEmpty()) {
			return new ArrayList<>();
		}
		return hotelSearchDao.getHotelDetails(hotelIdList);
	}

}
