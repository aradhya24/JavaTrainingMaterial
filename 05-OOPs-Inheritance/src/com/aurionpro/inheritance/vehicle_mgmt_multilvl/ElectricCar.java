package com.aurionpro.inheritance.vehicle_mgmt_multilvl;

public class ElectricCar extends Car {
	private double batteryCapacity;
	private double chargingTime;

	public ElectricCar(String brand, String model, double speed, String fuelType, int numSeats, double batteryCapacity,
			double chargingTime) {
		super(brand, model, speed, fuelType, numSeats);
		this.batteryCapacity = batteryCapacity;
		this.chargingTime = chargingTime;
	}

	public void displayInfo() {
		System.out.println("\nElectric Car");
		super.displayInfo();
		System.out.println("Battery Capacity : " + batteryCapacity + " km");
		System.out.println("Charging time : " + chargingTime + " hrs");
	}

}
