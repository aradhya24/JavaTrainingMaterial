package com.aurionpro.vehicle_behaviour;

public class VehicleBehaviour {

	public static void main(String[] args) {
         Vehicle[] vehicle = new Vehicle[4];
         vehicle[0] = new Car();
         vehicle[1] = new Bike();
         
         vehicle[0].start();
         vehicle[0].fuelType("Diesel");
         vehicle[0].stop();
         
         vehicle[1].start();
         vehicle[1].fuelType("Petrol");
         vehicle[1].stop();
         
         
	}

}
