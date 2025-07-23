package com.aurionpro.smart_device_controller;

public enum SpeakerMode {
     BASS , LOW , HIGH;
	
	public static void displayAllSpeakerMode() {
		System.out.println("Available Speaker Modes choose from it : ");
		for (int i = 0; i < values().length; i++) {
			System.out.println((i + 1) + " -> " + values()[i]);
		}
	}

	public static SpeakerMode getByIndex(int index) {
		return values()[index - 1];
	}
}
