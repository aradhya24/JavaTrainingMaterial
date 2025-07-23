package com.aurionpro.smart_device_controller;

public class Speaker implements IControllable{
    
	static Boolean isOn = false;
	
	@Override
	public void turnOn() {
		if (isOn) {
			System.out.println("\nSpeaker Already ON..");
			return;
		}
		isOn = true;
		System.out.println("\nSpeaker turned ON");
	}

	@Override
	public void turnOff() {
		if (!isOn) {
			System.out.println("\nSpeaker Already OFF..");
			return;
		}
		isOn = false;
		System.out.println("\nSpeaker turned OFF");
	}

	@Override
	public void setMode(String mode) {
		if(isOn) {
			System.out.println("\nSpeaker mode set to : " + mode);
			return;
		}
		System.out.println("\nSpeaker is off , Can't change mode..");
	}
    
}
