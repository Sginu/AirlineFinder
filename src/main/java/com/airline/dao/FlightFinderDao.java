package com.airline.dao;

import java.util.List;

import com.airline.model.Flight;
import com.airline.model.FlightRequest;

public interface FlightFinderDao {

	/**
	 * find all flights matching the user request
	 * @param flightRequest
	 * @return
	 */
	public List<Flight> findFlights(FlightRequest flightRequest);
}
