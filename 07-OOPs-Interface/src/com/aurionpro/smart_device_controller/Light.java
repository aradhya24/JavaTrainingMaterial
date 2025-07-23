package com.aurionpro.smart_device_controller;

public class Light implements IControllable {

	static Boolean isOn = false;

	@Override
	public void turnOn() {

		if (isOn) {
			System.out.println("\nLights Already ON..");
			return;
		}

		isOn = true;
		System.out.println("\nLights turned ON");
	}

	@Override
	public void turnOff() {

		if (!isOn) {
			System.out.println("\nLights Already OFF..");
			return;
		}

		isOn = false;
		System.out.println("\nLights turned OFF");
	}

	@Override
	public void setMode(String mode) {
		if(isOn) {
			System.out.println("\nLights mode set to : " + mode);
			return;
		}
		System.out.println("\nLights are off , Can't change mode..");
	}

}
