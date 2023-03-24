package com.nagarro.nagp.checkoutservice.services;

import com.nagarro.nagp.checkoutservice.dto.FlightBookingDetails;
import com.nagarro.nagp.checkoutservice.dto.UserBookingEventDto;

public interface FlightBookingService {

	UserBookingEventDto confirmFlightBooking(FlightBookingDetails bookingDetails);

}
