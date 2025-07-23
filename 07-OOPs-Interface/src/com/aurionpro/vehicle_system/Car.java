package com.aurionpro.vehicle_system;

public class Car implements IVehicleControl {
	static String gear;
	static boolean isStarted = false;

	@Override
	public void start() {
		if(isStarted) {
		    System.out.println("Car is already started...");
		    return;
		}
		isStarted = true;
		System.out.println("Car is Started");
	}

	@Override
	public void stop() {
		if(!isStarted) {
			System.out.println("Car is Already Stopped ...");
			return;
		}
		isStarted = false;
		System.out.println("Car is Stopped");
	}

	@Override
	public void changeGear(String gear) {
		
		
		if (Car.gear != null && Car.gear.equalsIgnoreCase(gear)) {
			System.out.println("Car Already on " + gear + " gear..");
			return;
		}
		Car.gear = gear;
		System.out.println("Car is shifted to " + gear + " gear...");
	}


}
