package com.aurionpro.hospital_system_mgmt;

public enum Department {
	CARDIOLOGY, NEUROLOGY, PHYSIOTHERAPY, DENTISTRY, DERMATOLOGY, ONCOLOGY, PATHOLOGY;
    
	public static void displayAllDepartment() {
		System.out.println("Available Department choose from it : ");
		for (int i = 0; i < values().length; i++) {
			System.out.println((i + 1) + " -> " + values()[i]);
		}
	}

	public static Department getByIndex(int index) {
		return values()[index - 1];
	}
}
