package com.nagarro.nagp.flightmanagement.dao;

import java.util.List;

public interface FlightConfirmationDao {

	boolean confirmFlightBooking(List<String> flightIds);

}
