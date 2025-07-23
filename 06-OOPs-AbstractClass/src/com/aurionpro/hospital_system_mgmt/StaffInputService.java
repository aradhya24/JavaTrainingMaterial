package com.aurionpro.hospital_system_mgmt;

import java.util.Scanner;

public class StaffInputService {

	static Scanner scanner = new Scanner(System.in);

	public static Doctor[] getAllDoctorsInput() {
		System.out.println("----------------------------------");
		System.out.print("Enter number of Dr to be recorded :");
		Integer count = scanner.nextInt();
		Doctor[] doctors = new Doctor[count];
		for (int i = 0; i < doctors.length; i++) {
			System.out.println("Enter Doctor Details:" + (i + 1));

			scanner.nextLine();
			System.out.print("Name : ");
			String name = scanner.nextLine();

			System.out.print("Staff Id : ");
			Long staffId = scanner.nextLong();

			Department.displayAllDepartment();
			Department department = Department.getByIndex(scanner.nextInt());
            
			Specialization.displayAllSpecialization();
			Specialization specialization = Specialization.getByIndex(scanner.nextInt());

			System.out.println("Patient Details ");
			System.out.print("Enter no of Patients to be recorded : ");
			count = scanner.nextInt();
			String[] patientNames = getPatientsNames(count);

			doctors[i] = new Doctor(staffId, name, department, specialization, patientNames);
			System.out.println("--------------------------------------------------");
		}
		return doctors;
	}

	public static Nurse[] getAllNurseInput() {
		
		System.out.print("\n\nEnter number of Nurses to be recorded :");
		Integer count = scanner.nextInt();
		Nurse[] nurses = new Nurse[count];
		for (int i = 0; i < nurses.length; i++) {
			
			System.out.println("Enter Nurse Details:" + (i + 1));

			scanner.nextLine();
			System.out.print("Name : ");
			String name = scanner.nextLine();

			System.out.print("Staff Id : ");
			Long staffId = scanner.nextLong();

			Department.displayAllDepartment();
			Department department = Department.getByIndex(scanner.nextInt());

			System.out.println("Shift Timings ");
			ShiftTiming.displayAllShiftTiming();
			ShiftTiming shiftTiming = ShiftTiming.getByIndex(scanner.nextInt());

			nurses[i] = new Nurse(staffId, name, department, shiftTiming);
			System.out.println("--------------------------------------------------");
		}
		return nurses;
	}

	public static String[] getPatientsNames(Integer count) {
		String[] patientNames = new String[count];
		scanner.nextLine();
		System.out.println();
		for (int i = 0; i < count; i++) {
			System.out.print("Enter patient " + (i + 1) + " name : ");
			patientNames[i] = scanner.nextLine();
		}
		return patientNames;
	}

}
