package com.nagarro.nagp.flightmanagement.dao.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nagarro.nagp.flightmanagement.dao.FlightConfirmationDao;
import com.nagarro.nagp.flightmanagement.dto.FlightDetails;
import com.nagarro.nagp.flightmanagement.helper.FlightListDetails;

@Repository
public class FlightConfirmationDaoImpl implements FlightConfirmationDao {

	@Autowired
	private FlightListDetails flightDetails;

	@Override
	public boolean confirmFlightBooking(List<String> flightIds) {
		System.out.println("Flight Size is: "+flightDetails.getFlightDetailsList().size());
		List<FlightDetails> flightList = flightDetails.getFlightDetailsList().stream()
				.filter(flightDetail -> flightIds.contains(flightDetail.getFlightId()))
				.filter(flightDetail -> flightDetail.isFlightStatus()).collect(Collectors.toList());
		System.out.println("Flight IDs to be booked are: "+ flightIds.size());
		if (flightList == null || flightList.isEmpty() || flightList.size() != flightIds.size()) {
			return false;
		}
		for (FlightDetails flight : flightList) {
			System.out.println("Flight :"+flight.getFlightId()+" status: "+flight.isFlightStatus());
			flight.setFlightStatus(false);
		}
		return true;
	}

}