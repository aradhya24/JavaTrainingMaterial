package com.aurionpro.smart_device_controller;

public class Fan implements IControllable {
    
	static Boolean isOn = false;
	
	@Override
	public void turnOn() {
		if (isOn) {
			System.out.println("\nFan Already ON..");
			return;
		}
		isOn = true;
		System.out.println("\nFan turned ON");
	}

	@Override
	public void turnOff() {
		if (!isOn) {
			System.out.println("\nFan Already OFF..");
			return;
		}
		isOn = false;
		System.out.println("\nFan turned OFF");
	}

	@Override
	public void setMode(String mode) {
		if(isOn) {
			System.out.println("\nFan mode set to : " + mode);
			return;
		}
		System.out.println("\nFan is off , Can't change mode..");
	}

}
