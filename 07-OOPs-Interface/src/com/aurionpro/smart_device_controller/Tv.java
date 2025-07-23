package com.aurionpro.smart_device_controller;

public class Tv implements IControllable {
	
	static Boolean isOn = false;

	@Override
	public void turnOn() {
		if (isOn) {
			System.out.println("\nTV Already ON..");
			return;
		}
		isOn = true;
		System.out.println("\nTV turned ON");
	}

	@Override
	public void turnOff() {
		if (!isOn) {
			System.out.println("\nTV Already OFF..");
			return;
		}
		isOn = false;
		System.out.println("\nTV turned OFF");
	}

	@Override
	public void setMode(String mode) {
		if(isOn) {
			System.out.println("\nTv mode set to : " + mode);
			return;
		}
		System.out.println("\nTv is off , Can't change mode..");
	}

}
