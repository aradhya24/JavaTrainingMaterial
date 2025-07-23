package com.aurionpro.sortflights_by_fare_2;

public class Flight {
	protected String airline;
	protected Double fare;

	public Flight(String airline, Double fare) {
		super();
		this.airline = airline;
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "\nAirline : " + airline + ",  Fare=" + fare 	;
	}

}
