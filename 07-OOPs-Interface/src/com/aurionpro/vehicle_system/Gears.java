package com.aurionpro.vehicle_system;


public enum Gears {
   FIRST , SECOND , THIRD , FOURTH , FIFTH , REVERSE;
	
	public static void displayAllGears() {
		System.out.println("Available Gears choose from it : ");
		for (int i = 0; i < values().length; i++) {
			System.out.println((i + 1) + " -> " + values()[i]);
		}
	}

	public static Gears getByIndex(int index) {
		return values()[index - 1];
	}
}
