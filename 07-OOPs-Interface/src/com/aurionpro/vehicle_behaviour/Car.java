package com.aurionpro.vehicle_behaviour;

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Car Started");

	}

	@Override
	public void stop() {
		System.out.println("Car Stopped!!!");
	}

	@Override
	public void fuelType(String fuelType) {
		System.out.println("Fuel type : " + fuelType);
	}

}
