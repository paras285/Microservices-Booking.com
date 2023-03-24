package com.nagarro.nagp.flightmanagement.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.flightmanagement.dto.FlightDetails;
import com.nagarro.nagp.flightmanagement.dto.TravelDetails;
import com.nagarro.nagp.flightmanagement.services.FlightSearchService;

@RestController
public class FlightServiceController {

	@Autowired
	private FlightSearchService flightSearchService;

	@GetMapping("flight-listing")
	public List<FlightDetails> searchFlights(@RequestParam Map<String, String> queryParameters) throws ParseException {

		String arrivalLocation = queryParameters.get("arrivalLocation");
		String departureLocation = queryParameters.get("departureLocation");
		String flightName = queryParameters.get("flightName");
		String flightType = queryParameters.get("flightType");
		String travelDate = queryParameters.get("travelDate");

		if (StringUtils.isBlank(arrivalLocation) || StringUtils.isBlank(departureLocation)
				|| Objects.isNull(travelDate)) {
			return new ArrayList<>();
		}

		TravelDetails travelDetails = new TravelDetails();
		travelDetails.setArrivalLocation(arrivalLocation);
		travelDetails.setDepartureLocation(departureLocation);
		travelDetails.setFlightName(flightName);
		travelDetails.setFlightType(flightType);
		travelDetails.setTravelDate(new SimpleDateFormat("yyyy-MM-dd").parse(travelDate));
		return flightSearchService.getFlightDetails(travelDetails);
	}
	
	@GetMapping("flight-details")
	public List<FlightDetails> getFlightDetails(@RequestParam List<String> flightIds){
		return flightSearchService.getFlightDetails(flightIds);
	}
}
