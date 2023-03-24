package com.nagarro.nagp.hotelService.dao.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nagarro.nagp.hotelService.dao.HotelConfirmationDao;
import com.nagarro.nagp.hotelService.dto.HotelDetails;
import com.nagarro.nagp.hotelService.helper.HotelDetailsHelper;

@Repository
public class HotelConfirmationDaoImpl implements HotelConfirmationDao {

	@Autowired
	private HotelDetailsHelper hotelHelper;

	@Override
	public boolean getHotelStatus(String hotelId) {

		boolean isHotelConfirmed = false;

		Optional<HotelDetails> hotelDetailsOptional = hotelHelper.getHotelDetailsList().stream()
				.filter(hotel -> String.valueOf(hotel.getId()).equals(hotelId)).findFirst();
		if (hotelDetailsOptional.isPresent()) {
			HotelDetails hotelDetails = hotelDetailsOptional.get();
			if(hotelDetails.isHotelStatus()) {
				hotelDetails.setHotelStatus(false);
				isHotelConfirmed = true;
			}
		}
		return isHotelConfirmed;

	}

}