package com.aurionpro.vehicle_system;

import java.util.InputMismatchException;
import java.util.Scanner;


public class VehicleOperations {

	static void vehicleOperations(Scanner scanner, IVehicleControl vehicleControl) {
		int choice = 0;

		while (true) {
			System.out.print("\nChoose vehicle type : \n1 -> Start, 2 -> Stop, 3 -> Change Gear,  4 -> EXIT : ");
			while (true) {
				try {
					choice = scanner.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Input Mismatched, Enter input again:");
					System.out.print("\nChoose vehicle type : \n1 -> Start, 2 -> Stop, 3 -> Change Gear,  4 -> EXIT : ");
					scanner.next();
				}
			}

			switch (choice) {
			case 1:
				vehicleControl.start();
				break;

			case 2:
				vehicleControl.stop();
				break;

			case 3:
				scanner.nextLine();
				String gear = "";
				
				int chooseGear = -1;
				while (true) {
					try {
						    Gears.displayAllGears();
						    chooseGear = scanner.nextInt();
							gear = Gears.getByIndex(chooseGear).toString();
						break;
					} catch (InputMismatchException e) {
						System.out.println("Input Mismatched, enter a valid Gear number...");
						scanner.next();
					} catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("Invalid choice, please choose a  option...");
					}
				}
				vehicleControl.changeGear(gear);
				break;

			case 4:
				System.out.println("Exiting...");
				return;

			default:
				System.out.println("Invalid input choice.");
			}
		}
	}
	
	
}
