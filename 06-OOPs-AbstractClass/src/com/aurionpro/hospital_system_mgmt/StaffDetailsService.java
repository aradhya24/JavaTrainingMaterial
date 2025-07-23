package com.aurionpro.hospital_system_mgmt;

import java.util.Iterator;

public class StaffDetailsService {

	static void getAllDoctorDetails(Doctor[] doctors) {
		System.out.println("\n\n---------- Doctor Details ----------");
		for (Doctor doctor : doctors) {
			if (doctor != null) {
				System.out.println(doctor);
			} else {
				System.out.println("Null doctor record found. Skipping...");
			}
			System.out.println("------------------------------------");
		}

	}

	static void getAllNurseDetails(Nurse[] nurses) {
		System.out.println("\n\n---------- Nurse Details ----------");
		for (Nurse nurse : nurses) {
			if (nurse != null) {
				System.out.println(nurse);
			} else {
				System.out.println("Null nurse record found. Skipping...");
			}
			System.out.println("------------------------------------");
		}
	}

	static void getAllDoctorNames(Doctor[] doctors) {
		System.out.println("---------- Doctor Names ----------");
		int i = 0;
		for (Doctor doctor : doctors) {
			System.out.println(++i + " -> " + doctor.name);
		}
		System.out.println("------------------------------------");
	}

	static void getAllNurseNames(Nurse[] nurses) {
		System.out.println("---------- Doctor Names ----------");
		int i = 0;
		for (Nurse nurse : nurses) {
			System.out.println(++i + " -> " + nurse.name);
		}
		System.out.println("------------------------------------");
	}

	static void getAllWorkingStaff(HospitalStaff[] hospitalStaffs) {
		System.out.println("\n\n------ Currently Working Staff -------\n");
		for (HospitalStaff hospitalStaff : hospitalStaffs) {
			hospitalStaff.work();
		}
	}
}
