package com.aurionpro.hospital_system_mgmt;

import java.util.Scanner;

public class WorkingStaffService {

	public static HospitalStaff[] getWorkingStaffInput(Scanner scanner , Doctor[] doctors , Nurse[] nurses)  {

		System.out.print("\n\nEnter number of hospital staff to which work assigned : ");
		Integer count = scanner.nextInt();
		HospitalStaff[] staffMembers = new HospitalStaff[count];
		
		for(int i = 0 ; i < count ; i++) {
			System.out.print("\nChoose 1 -> Doctor | 2 -> Nurse : ");
			Integer choice = scanner.nextInt();
			switch(choice) {
			case 1:
				StaffDetailsService.getAllDoctorNames(doctors);
				System.out.println("Enter choice : ");
				choice = scanner.nextInt();
				staffMembers[i] = doctors[choice-1];
				break;
			
			case 2:
				StaffDetailsService.getAllNurseNames(nurses);
				System.out.println("Enter choice : ");
				choice = scanner.nextInt();
				staffMembers[i] = nurses[choice-1];
				break;
			
			default:
				System.out.println("Enter wrong choice ! enter Again ..");
				i--;
			
			}
		}
		return staffMembers;
	}

	public void getDoctorList(Doctor[] doctors) {
		StaffDetailsService.getAllDoctorDetails(doctors);
	}

}
