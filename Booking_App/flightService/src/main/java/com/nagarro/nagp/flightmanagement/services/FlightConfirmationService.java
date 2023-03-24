package com.nagarro.nagp.flightmanagement.services;

import java.util.List;

public interface FlightConfirmationService {

	boolean confirmFlightBooking(List<String> flightIds);

}
