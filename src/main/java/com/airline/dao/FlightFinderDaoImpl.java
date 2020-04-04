package com.airline.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.airline.model.Flight;
import com.airline.model.FlightRequest;
import com.airline.model.FlightsCache;

@Repository
public class FlightFinderDaoImpl implements FlightFinderDao {

	@Autowired
	FlightsCache flightsCache;
	
	@Override
	public List<Flight> findFlights(FlightRequest flightRequest) {
		return getFlights(flightRequest);
	}
	
	private List<Flight> getFlights(FlightRequest flightRequest){
		List<Flight> matchingFLights = null;
		if (flightsCache != null){
			Map<String, List<Flight>> allFlights= flightsCache.getAllFlights();
			List<Flight> flightsByDepCity = allFlights.get(flightRequest.getFromCity());
			for(Flight flight:flightsByDepCity){
				if (flight.getDepartureDate().equals(flightRequest.getTravelDate())){
					if (matchingFLights == null){
						matchingFLights = new ArrayList<>();
					}
					matchingFLights.add(flight);
				}
			}
		}
		return matchingFLights;
	}
	
	
	
	

}
