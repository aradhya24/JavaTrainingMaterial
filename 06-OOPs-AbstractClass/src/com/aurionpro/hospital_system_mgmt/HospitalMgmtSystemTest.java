package com.aurionpro.hospital_system_mgmt;

import java.util.Scanner;

public class HospitalMgmtSystemTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Doctor[] doctors = StaffInputService.getAllDoctorsInput();
		Nurse[] nurses = StaffInputService.getAllNurseInput();
		HospitalStaff[] hospitalStaffs = null;

		Integer choice = 0;

		while (true) {
			System.out.print("\n\n1 -> View All Doctors | 2 -> View All Nurses | 3 -> Assigned work to staff \n"
					+ "               4 -> View Working Staff | 9 -> Exit : ");
			choice = scanner.nextInt();

			switch (choice) {

			case 1:
				StaffDetailsService.getAllDoctorDetails(doctors);
				break;

			case 2:
				StaffDetailsService.getAllNurseDetails(nurses);
				break;

			case 3:
				hospitalStaffs = WorkingStaffService.getWorkingStaffInput(scanner, doctors, nurses);
				break;

			case 4:
				StaffDetailsService.getAllWorkingStaff(hospitalStaffs);
				break;

			case 9:
				System.out.println("System Exited.....");
				return;

			default:
				System.out.println("Enter Wrong Choice .... , Enter Again ");
			}
		}
	}
}
