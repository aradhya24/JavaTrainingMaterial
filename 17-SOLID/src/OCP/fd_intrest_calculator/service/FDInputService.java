package OCP.fd_intrest_calculator.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import OCP.fd_intrest_calculator.festivalinterest.DiwaliInterest;
import OCP.fd_intrest_calculator.festivalinterest.HoliInterest;
import OCP.fd_intrest_calculator.festivalinterest.NewYearInterest;
import OCP.fd_intrest_calculator.festivalinterest.OtherInterest;
import OCP.fd_intrest_calculator.model.FestivalType;
import OCP.fd_intrest_calculator.model.FixedDeposit;
import OCP.fd_intrest_calculator.model.IFestivalInterest;

public class FDInputService {

	static List<FixedDeposit> list = new ArrayList<>();

	public static void getFDInput(Scanner scanner) {

		FixedDeposit fixedDeposit = new FixedDeposit();

		System.out.println("\nEnter FD account Details");

		scanner.nextLine();
		System.out.print("Enter name: ");
		while (true) {
		    try {
		        String name = scanner.nextLine();
		        
		        while (name.matches(".*\\d.*")) {
		            System.out.println("Can't enter digits in name...");
		            System.out.print("Enter name: ");
		            name = scanner.nextLine();
		        }

		        fixedDeposit.setName(name);
		        break;

		    } catch (InputMismatchException e) {
		        System.out.println("Input Mismatched, Enter input again...");
		        System.out.print("Enter name: ");
		        scanner.next(); 
		    }
		}

		

		System.out.print("Enter Account Number :");
		while (true) {
			try {
				fixedDeposit.setAccountNumber(scanner.nextInt());
				break;
			} catch (InputMismatchException e) {
				System.out.println("Input Mismatched, Enter input again...");
				System.out.print("Enter Account Number :");
				scanner.next();
			}
		}

		

		System.out.print("Enter Principal amount Rs:");
		while (true) {
			try {
				fixedDeposit.setPrincipal(scanner.nextDouble());
				break;
			} catch (InputMismatchException e) {
				System.out.println("Input Mismatched, Enter input again...");
				System.out.print("Enter Principal amount Rs:");
				scanner.next();
			}
		}
		

		System.out.print("Enter Duration in yrs :");
		while (true) {
			try {
				fixedDeposit.setDuration(scanner.nextInt());
				break;
			} catch (InputMismatchException e) {
				System.out.println("Input Mismatched, Enter input again...");
				System.out.print("Enter Duration in yrs :");
				scanner.next();
			}
		}
		

		int choice = -1;
		while (true) {
			try {
				FestivalType.displayAllFestivalType();
				choice = scanner.nextInt();
				fixedDeposit.setFestivalType(FestivalType.getByIndex(choice));
				break;

			} catch (InputMismatchException e) {
				System.out.println("Input Mismatched, enter a valid number...");
				scanner.next();
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid choice, please choose a valid option...");
			}
		}

		list.add(fixedDeposit);
	}


}
