package com.airline.service;

import java.util.List;

import com.airline.model.Flight;
import com.airline.model.FlightRequest;

public interface FlightFinderService {

	List<Flight> findFlights(FlightRequest flightRequest);
}
