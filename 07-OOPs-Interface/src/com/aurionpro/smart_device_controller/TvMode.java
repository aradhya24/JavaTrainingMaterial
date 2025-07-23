package com.aurionpro.smart_device_controller;


public enum TvMode {
	HD, FHD, UHD;

	public static void displayAllTvMode() {
		System.out.println("Available Tv Modes choose from it : ");
		for (int i = 0; i < values().length; i++) {
			System.out.println((i + 1) + " -> " + values()[i]);
		}
	}

	public static TvMode getByIndex(int index) {
		return values()[index - 1];
	}
}
