package com.aurionpro.smart_device_controller;

public enum FanMode {
	SLOW, MEDIUM, FAST;

	public static void displayAllFanMode() {
		System.out.println("Available Fan Mode choose from it : ");
		for (int i = 0; i < values().length; i++) {
			System.out.println((i + 1) + " -> " + values()[i]);
		}
	}

	public static FanMode getByIndex(int index) {
		return values()[index - 1];
	}
}
