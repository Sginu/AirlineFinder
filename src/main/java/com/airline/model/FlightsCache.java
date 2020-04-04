package com.airline.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightsCache {

	private static Map<String, List<Flight>> allFlights;

	public FlightsCache() {
		super();
		loadFlightsCache();
	}
		
	private void loadFlightsCache() {
		System.out.println("---------cache loading--------");
		if(allFlights == null){
			allFlights = new HashMap<>();
		}
		Flight united1 = new Flight("SFO", "U1234", "SFO", "NYC", "10/10/2018", "10:00:10", "13:30:30");
		Flight united2 = new Flight("KCA", "U2234", "KCA", "NYC", "10/10/2018", "03:00:10", "08:30:00");
		Flight american1 = new Flight("SFO", "A1234", "SFO", "NYC", "10/10/2018", "11:30:10", "13:30:30");
		Flight american2 = new Flight("NYC", "A2234", "NYC", "AUS", "10/10/2018", "10:00:10", "14:30:00");
		
		List<Flight> sfoFlights = new ArrayList<>();
		sfoFlights.add(united1);
		sfoFlights.add(american1);
		
		List<Flight> nycFlights = new ArrayList<>();
		nycFlights.add(american2);
		
		List<Flight> kcaFlights = new ArrayList<>();
		kcaFlights.add(united2);
		
		allFlights.put("SFO", sfoFlights);
		allFlights.put("NYC", nycFlights);
		allFlights.put("KCA", kcaFlights);
	}
	
	public Map<String, List<Flight>> getAllFlights(){
		return allFlights;
	}
	
	
}
