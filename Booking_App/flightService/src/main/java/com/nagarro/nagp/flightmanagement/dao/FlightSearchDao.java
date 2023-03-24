package com.nagarro.nagp.flightmanagement.dao;

import java.util.List;

import com.nagarro.nagp.flightmanagement.dto.FlightDetails;
import com.nagarro.nagp.flightmanagement.dto.TravelDetails;

public interface FlightSearchDao {

	List<FlightDetails> getFlightDetails(TravelDetails travelDetails);

	List<FlightDetails> getFlightDetails(List<String> flightIds);

}
