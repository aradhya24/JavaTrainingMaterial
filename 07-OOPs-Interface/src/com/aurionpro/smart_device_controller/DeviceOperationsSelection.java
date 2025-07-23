package com.aurionpro.smart_device_controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.aurionpro.banking_domain.AccountOperations;

public class DeviceOperationsSelection {

	static void deviceOperationSelection(Scanner scanner, IControllable iControllable, String mode) {
		int choice = 0;

		while (true) {
			System.out.print("\nChoose Operation : \n1 -> Turn ON, 2 -> Turn OFF, 3 -> Change mode, 4 -> Exit : ");
			while (true) {
				try {
					choice = scanner.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Input Mismatched, Enter input again:");
					System.out.print(
							"\nChoose Operation : \n1 -> Turn ON, 2 -> Turn OFF, 3 -> Change mode, 4 -> Exit : ");
					scanner.next();
				}
			}

			switch (choice) {

			case 1:
				iControllable.turnOn();
				break;

			case 2:
				iControllable.turnOff();
				break;

			case 3:
				while (true) {
					try {
						iControllable.setMode(modeSelection(scanner, mode));
						break;
					} catch (InputMismatchException e) {
						System.out.print("Input Mismatched, Enter input again ...");
						iControllable.setMode(modeSelection(scanner, mode));
					} catch (ArrayIndexOutOfBoundsException e) {
						System.out.print("Invalid input , Enter Again ...");
						iControllable.setMode(modeSelection(scanner, mode));
					}
				}

				break;

			case 4:
				System.out.println("Exiting...");

				return;

			default:
				System.out.println("Invalid account choice.");

			}
		}
	}

	static String modeSelection(Scanner scanner, String mode) {
		int choice = -1;

		while (true) {
			try {
				switch (mode) {
				case "LIGHT":
					LightMode.displayAllLightMode();
					choice = scanner.nextInt();
					return LightMode.getByIndex(choice).toString();

				case "SPEAKER":
					SpeakerMode.displayAllSpeakerMode();
					choice = scanner.nextInt();
					return SpeakerMode.getByIndex(choice).toString();

				case "TV":
					TvMode.displayAllTvMode();
					choice = scanner.nextInt();
					return TvMode.getByIndex(choice).toString();

				case "FAN":
					FanMode.displayAllFanMode();
					choice = scanner.nextInt();
					return FanMode.getByIndex(choice).toString();
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("Input Mismatched, enter a valid number...");
				scanner.next();
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid choice, please choose a valid option...");
			}
		}
		return null;
	}

}