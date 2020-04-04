package com.airline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.airline.dao.FlightFinderDao;
import com.airline.model.Flight;
import com.airline.model.FlightRequest;

public class FlightFinderServiceImpl implements FlightFinderService {

	@Autowired
	private FlightFinderDao flightFinderDao;
	
	@Override
	public List<Flight> findFlights(FlightRequest flightRequest) {
		return flightFinderDao.findFlights(flightRequest);
	}

}
