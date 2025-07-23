package com.aurionpro.hospital_system_mgmt;

import java.util.Arrays;

import com.aurionpro.game_character_attack.GameCharacter;

public class Nurse extends HospitalStaff {

	ShiftTiming shiftTimings;

	public Nurse(Long staffId, String name, Department department, ShiftTiming shiftTimings) {
		super(staffId, name, department);
		this.shiftTimings = shiftTimings;
	}

	@Override
	void work() {
		System.out.println(name + " nurse is Assisting during the " + shiftTimings + " shift...");
		System.out.println("----------------------------------");
	}

	public String toString() {
		return (super.toString() + "\nShift Timing : " + shiftTimings);
	}

}
