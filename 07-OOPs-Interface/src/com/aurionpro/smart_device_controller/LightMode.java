package com.aurionpro.smart_device_controller;

public enum LightMode{
	LIGHT, DIM, DARK, WARM;

	public static void displayAllLightMode() {
		System.out.println("Available Light Mode choose from it : ");
		for (int i = 0; i < values().length; i++) {
			System.out.println((i + 1) + " -> " + values()[i]);
		}
	}

	public static LightMode getByIndex(int index) {
		return values()[index - 1];
	}
}
