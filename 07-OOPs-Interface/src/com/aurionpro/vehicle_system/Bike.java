package com.aurionpro.vehicle_system;

public class Bike implements IVehicleControl {

	static String gear;
	static boolean isStarted = false;

	@Override
	public void start() {
		if(isStarted) {
		    System.out.println("Bike is already started...");
		    return;
		}
		isStarted = true;
		System.out.println("Bike is Started");
	}

	@Override
	public void stop() {
		if(!isStarted) {
			System.out.println("Bike is Already Stopped ...");
			return;
		}
		isStarted = false;
		System.out.println("Bike is Stopped");
	}

	@Override
	public void changeGear(String gear) {
		
		
		if (Bike.gear != null && Bike.gear.equalsIgnoreCase(gear)) {
			System.out.println("Bike Already on " + gear + " gear..");
			return;
		}
		Bike.gear = gear;
		System.out.println("Bike is shifted to " + gear + " gear...");
	}

}
