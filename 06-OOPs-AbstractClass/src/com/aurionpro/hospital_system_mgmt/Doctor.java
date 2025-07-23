package com.aurionpro.hospital_system_mgmt;

import java.util.Arrays;

public  class Doctor extends HospitalStaff {

	Specialization specialization;
	protected String[] patientNames;

	public Doctor(Long staffId, String name, Department department, Specialization specialization, String[] patientNames) {
		super(staffId, name, department);
		this.specialization = specialization;
		this.patientNames = patientNames;
	}

	@Override
	void work() {
		System.out.println("Dr. " + name + " is diagonising patient...");
		System.out.println("----------------------------------");
	}

	public String toString() {
		return (super.toString() + "\nSpecialization : " + specialization + "\nPatient Names : "
				+ Arrays.toString(patientNames));
	}

}
