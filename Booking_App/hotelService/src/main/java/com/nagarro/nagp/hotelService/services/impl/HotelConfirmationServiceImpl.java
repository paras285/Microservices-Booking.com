package com.nagarro.nagp.hotelService.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.nagp.hotelService.dao.HotelConfirmationDao;
import com.nagarro.nagp.hotelService.services.HotelConfirmationService;

@Service
public class HotelConfirmationServiceImpl implements HotelConfirmationService {

	@Autowired
	private HotelConfirmationDao hotelConfirmationDao;
	
	@Override
	public boolean confirmHotelBooking(String hotelId) {
		return hotelConfirmationDao.getHotelStatus(hotelId);
	}

	
}
