package com.aurionpro.mp2_student_performance_mgmt_system;

public enum Stream {
	SCIENCE, COMMERCE, ARTS;

	public static void displayAllStream() {
		System.out.println("Available Stream choose from it : ");
		for (int i = 0; i < values().length; i++) {
			System.out.println((i + 1) + " -> " + values()[i]);
		}
	}

	public static Stream getByIndex(int index) {
		return values()[index - 1];
	}

}
