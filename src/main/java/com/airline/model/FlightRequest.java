package com.airline.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class FlightRequest implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String fromCity;
	private String toCity;
	private String travelDate;

	
	public FlightRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public FlightRequest(String fromCity, String toCity, String travelDate) {
		super();
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.travelDate = travelDate;
	}


	public String getFromCity() {
		return fromCity;
	}
	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}
	public String getToCity() {
		return toCity;
	}
	public void setToCity(String toCity) {
		this.toCity = toCity;
	}
	public String getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}
	
	
}
