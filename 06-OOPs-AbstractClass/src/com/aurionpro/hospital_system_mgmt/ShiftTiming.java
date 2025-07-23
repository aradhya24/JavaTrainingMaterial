package com.aurionpro.hospital_system_mgmt;

public enum ShiftTiming {
    MORNING, EVENING, NIGHT;
	
	public static void displayAllShiftTiming() {
		System.out.println("Available ShiftTiming choose from it : ");
		for (int i = 0; i < values().length; i++) {
			System.out.println((i + 1) + " -> " + values()[i]);
		}
	}

	public static ShiftTiming getByIndex(int index) {
		return values()[index - 1];
	}
}
