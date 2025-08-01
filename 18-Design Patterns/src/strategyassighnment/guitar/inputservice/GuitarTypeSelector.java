package strategyassighnment.guitar.inputservice;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import strategyassighnment.guitar.model.AcousticGuitar;
import strategyassighnment.guitar.model.ElectricGuitar;
import strategyassighnment.guitar.model.Guitar;

public class GuitarTypeSelector {

	private static final Scanner scanner = new Scanner(System.in);
	private static final ArrayList<Guitar> list = new ArrayList<>();

	public static void selectGuitarType() {
		Guitar selectedGuitar;

		while (true) {
			try {
				System.out.println("\nChoose an option:");
				System.out.println("1. Add New Guitar");
				System.out.println("2. Use Existing Guitar");
				System.out.println("3. Show All Guitars");
				System.out.println("9. Exit");

				int mainChoice = getInput();

				switch (mainChoice) {
					case 1 -> {
						System.out.print("\nEnter unique name for your guitar: ");
						String name = scanner.nextLine();

						System.out.println("Select Guitar Type:");
						System.out.println("1. Acoustic Guitar");
						System.out.println("2. Electric Guitar");

						int guitarType = getInput();

						switch (guitarType) {
							case 1 -> selectedGuitar = new AcousticGuitar(name);
							case 2 -> selectedGuitar = new ElectricGuitar(name);
							default -> {
								System.out.println("Invalid guitar type.");
								continue;
							}
						}

						list.add(selectedGuitar);
						System.out.println("Guitar '" + name + "' added successfully!");
						GuitarMenuHandler.showMainMenu(selectedGuitar);
					}

					case 2 -> {
						if (list.isEmpty()) {
							System.out.println("No guitars available. Please add one first.");
							continue;
						}

						System.out.println("\nUse Existing Guitar:");
						for (int i = 0; i < list.size(); i++) {
							System.out.println((i + 1) + ". Guitar Name: " + list.get(i).getName());
						}

						System.out.print("Enter your choice: ");
						int index = getInput();

						if (index < 1 || index > list.size()) {
							System.out.println("Invalid selection.");
							continue;
						}

						selectedGuitar = list.get(index - 1);
						selectedGuitar.showGuitarInfo();
						GuitarMenuHandler.showMainMenu(selectedGuitar);
					}

					case 3 -> displayAllGuitars();

					case 9 -> {
						System.out.println("Goodbye!");
						return;
					}

					default -> System.out.println("Invalid choice. Please try again.");
				}

			} catch (Exception e) {
				System.out.println("Unexpected error: " + e.getMessage());
			}
		}
	}

	private static void displayAllGuitars() {
		System.out.println(  "\n\n-------------------------- All Ready-to-Play Guitars --------------------------------");
		if (list.isEmpty()) {
			System.out.println("No guitars found.");
			return;
		}
		for (Guitar guitar : list) {
			guitar.showGuitarInfo();
			System.out.println("\n-----------------------------------------------------------------------------------");
		}
	}

	private static int getInput() {
		int input = -1;
		try {
			input = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Input Mismatch. Please enter digits only.");
		} finally {
			scanner.nextLine(); // clear buffer
		}
		return input;
	}
}
