package com.aurionpro.vehicle_behaviour;

public class Bike implements Vehicle{

	@Override
	public void start() {
		System.out.println("Bike Started");
	}

	@Override
	public void stop() {
		System.out.println("Bike Stopped!!!");
	}

	@Override
	public void fuelType(String fuelType) {
		System.out.println("Fuel type : " + fuelType);
	}
   
}
