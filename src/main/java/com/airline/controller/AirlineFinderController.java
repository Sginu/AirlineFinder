package com.airline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.airline.model.Flight;
import com.airline.model.FlightRequest;
import com.airline.service.FlightFinderService;

@RestController
@RequestMapping("/")
public class AirlineFinderController {

	@Autowired
	private FlightFinderService servie;
	
	@RequestMapping(value="/search/flights", method=RequestMethod.POST)
	public List<Flight> getFlights(@RequestBody FlightRequest flightRequest){
		return servie.findFlights(flightRequest);
	}
	
	
	@RequestMapping(value="/get", method=RequestMethod.GET)
	public List<Flight> getAllFlights(@RequestBody FlightRequest flightRequest){
		return servie.findFlights(flightRequest);
	}
}
