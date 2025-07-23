package OCP.fd_intrest_calculator.test;

import java.util.InputMismatchException;
import java.util.Scanner;

import OCP.fd_intrest_calculator.service.FDInputService;
import OCP.fd_intrest_calculator.service.FDsDisplayService;

public class FestivalInterestTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int choice = -1;

		while (true) {
			
			System.out.print("\n\nChoose 1 -> Add New FD accounts,  2 -> View FD Accounts  3 -> Exit : ");
			while (true) {
				try {
					choice = scanner.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Input Mismatched, Enter input again...");
					System.out.print("\n\nChoose 1 -> Add New FD accounts,  2 -> View FD Accounts  3 -> Exit : ");
					scanner.next();
				}
			}

			switch (choice) {
			case 1:
				FDInputService.getFDInput(scanner);
				break;

			case 2:
				FDsDisplayService.getFDs();
				break;

			case 3:
				System.out.println("System Exited...");
				return;

			default:
				System.out.println("Wrong Choice Enter again...");
			}

		}

	}

}
