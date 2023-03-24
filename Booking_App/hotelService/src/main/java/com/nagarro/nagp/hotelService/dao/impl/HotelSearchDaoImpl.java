package com.nagarro.nagp.hotelService.dao.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nagarro.nagp.hotelService.dao.HotelSearchDao;
import com.nagarro.nagp.hotelService.dto.HotelDetails;
import com.nagarro.nagp.hotelService.dto.TravelDetails;
import com.nagarro.nagp.hotelService.helper.HotelDetailsHelper;

@Repository
public class HotelSearchDaoImpl implements HotelSearchDao {

	@Autowired
	private HotelDetailsHelper hotelHelper;

	@Override
	public List<HotelDetails> getHotelDetails(TravelDetails travelDetails) {

		return hotelHelper
				.getHotelDetailsList().stream()
				.filter(hotelDetails -> hotelDetails.getAvailableCheckInDate().equals(travelDetails.getCheckInDate()))
				.filter(hotelDetails -> hotelDetails.getAvailableCheckOutDate().equals(travelDetails.getCheckOutDate()))
				.filter(hotelDetails -> null == travelDetails.getCity()
						|| hotelDetails.getCity().equals(travelDetails.getCity()))
				.filter(hotelDetails -> null == travelDetails.getHotelName()
						|| hotelDetails.getCity().equals(travelDetails.getHotelName()))
				.filter(HotelDetails::isHotelStatus)
				.collect(Collectors.toList());
	}

	@Override
	public List<HotelDetails> getHotelDetails(List<String> hotelId) {
		return hotelHelper.getHotelDetailsList().stream()
				.filter(hotelDetails -> hotelId.contains(String.valueOf(hotelDetails.getId())))
				.collect(Collectors.toList());
	}

}
