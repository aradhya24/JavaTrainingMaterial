package com.aurionpro.vehicle_system;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VehicleSystemTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		IVehicleControl vehicleControls;

		int choice = 0;

		while (true) {
			System.out.print("\nChoose vehicle type : \n1 -> Bike, 2 -> Car, 3 -> Truck , 4 -> EXIT : ");
			while (true) {
				try {
					choice = scanner.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Input Mismatched, Enter input again:");
					System.out.print("\nChoose vehicle type : \n1 -> Bike, 2 -> Car, 3 -> Truck , 4 -> EXIT : ");
					scanner.next();
				}
			}

			switch (choice) {
			case 1:
				vehicleControls = new Bike();
				VehicleOperations.vehicleOperations(scanner, vehicleControls);
				break;

			case 2:
				vehicleControls = new Car();
				VehicleOperations.vehicleOperations(scanner, vehicleControls);
				break;

			case 3:
				vehicleControls = new Truck();
				VehicleOperations.vehicleOperations(scanner, vehicleControls);
				break;

			case 4:
				System.out.println("Exiting...");
				scanner.close();
				return;

			default:
				System.out.println("Invalid input choice.");
			}
		}
	}
}
