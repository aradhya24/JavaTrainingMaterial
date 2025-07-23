package com.aurionpro.hospital_system_mgmt;

public enum Specialization {
	CARDIOLOGIST, NEUROLOGIST, PHYSIOTHERAPIST, DENTIST, DERMATOLIST, ONCOLOGIST, PATHOLIGIST;

	public static void displayAllSpecialization() {
		System.out.println("Available specialization choose from it : ");
		for (int i = 0; i < values().length; i++) {
			System.out.println((i + 1) + " -> " + values()[i]);
		}
	}

	public static Specialization getByIndex(int index) {
		return values()[index - 1];
	}
}
