package com.aurionpro.inheritance.vehicle_mgmt_multilvl;

public class Car extends Vehicle {
	private String fuelType;
	private int numSeats;
	public Car(String brand, String model, double speed, String fuelType, int numSeats) {
		super(brand, model, speed);
		this.fuelType = fuelType;
		this.numSeats = numSeats;
	}
	
	public void displayInfo() {
		System.out.println("Car");
		super.displayInfo();
		System.out.println("Fuel type : " + fuelType);
		System.out.println("Number of Seats : " + numSeats);
	}
}
