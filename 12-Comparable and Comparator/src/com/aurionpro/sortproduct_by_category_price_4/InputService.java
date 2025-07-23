package com.aurionpro.sortproduct_by_category_price_4;

import java.util.ArrayList;
import java.util.Scanner;


public class InputService {
     
	public static void getProductInput(Scanner scanner, ArrayList<Product> productList) {

		String productName = "";
		String productCategory = "";
		Double price = 0.0;
		
		while (true) {
			System.out.print("\nEnter Product category : ");
			productCategory = scanner.nextLine();
			
			if(Validations.getStringValidateAllAlphabets(productCategory) && Validations.getStringValidateNotNull(productCategory)) {
				break;
			}
		}

		while (true) {
			System.out.print("Enter Product name : ");
			productName = scanner.nextLine();
			
			if(Validations.getStringValidateAllAlphabets(productName) && Validations.getStringValidateNotNull(productName)) {
				break;
			}
		}
		
		

		while (true) {
			System.out.print("Enter price : ");
			try {
				price = Double.parseDouble(scanner.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Input Mismatched .... Enter price in digits only.");
			}
		}

		productList.add(new Product(productCategory , productName , price));
		System.out.println("Added Sucessfully ....");
	}
}
