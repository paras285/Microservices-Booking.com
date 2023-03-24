package com.nagarro.nagp.flightmanagement.dao.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nagarro.nagp.flightmanagement.dao.FlightSearchDao;
import com.nagarro.nagp.flightmanagement.dto.FlightDetails;
import com.nagarro.nagp.flightmanagement.dto.TravelDetails;
import com.nagarro.nagp.flightmanagement.helper.FlightListDetails;

@Repository
public class FlightSearchDaoImpl implements FlightSearchDao {

	@Autowired
	private FlightListDetails flightDetails;

	@Override
	public List<FlightDetails> getFlightDetails(TravelDetails travelDetails) {
		return flightDetails.getFlightDetailsList().stream()
				.filter(flightDetail -> flightDetail.getDepartureLocation()
						.equals(travelDetails.getDepartureLocation()))
				.filter(flightDetail -> flightDetail.getArrivalLocation().equals(travelDetails.getArrivalLocation()))
				.filter(flightDetail -> flightDetail.getTravelDate().equals(travelDetails.getTravelDate()))
				.filter(flightDetail -> null == travelDetails.getFlightType()
						|| flightDetail.getFlightType().equals(travelDetails.getFlightType()))
				.filter(flightDetail -> null == travelDetails.getFlightName()
						|| flightDetail.getFlightName().equals(travelDetails.getFlightName()))
				.collect(Collectors.toList());
	}

	@Override
	public List<FlightDetails> getFlightDetails(List<String> flightIds) {
		return flightDetails.getFlightDetailsList().stream()
				.filter(flightDetail -> flightIds.contains(flightDetail.getFlightId())).collect(Collectors.toList());
	}

}