package com.aurionpro.vehicle_system;

public class Truck implements IVehicleControl {

	static String gear;
	static boolean isStarted = false;

	@Override
	public void start() {
		if(isStarted) {
		    System.out.println("Truck is already started...");
		    return;
		}
		isStarted = true;
		System.out.println("Truck is Started");
	}

	@Override
	public void stop() {
		if(!isStarted) {
			System.out.println("Truck is Already Stopped ...");
			return;
		}
		isStarted = false;
		System.out.println("Truck is Stopped");
	}

	@Override
	public void changeGear(String gear) {
		
		
		if (Truck.gear != null && Truck.gear.equalsIgnoreCase(gear)) {
			System.out.println("Truck Already on " + gear + " gear..");
			return;
		}
		Truck.gear = gear;
		System.out.println("Truck is shifted to " + gear + " gear...");
	}

}
