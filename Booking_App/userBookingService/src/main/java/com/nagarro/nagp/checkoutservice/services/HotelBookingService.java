package com.nagarro.nagp.checkoutservice.services;

import com.nagarro.nagp.checkoutservice.dto.HotelBookingDetails;
import com.nagarro.nagp.checkoutservice.dto.UserBookingEventDto;

public interface HotelBookingService {

	UserBookingEventDto confirmHotelBooking(HotelBookingDetails bookingDetails);

}
