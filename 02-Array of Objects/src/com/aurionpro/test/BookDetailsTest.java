package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.BookDetails;

public class BookDetailsTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number of books to be record : ");
		int numberOfBooks = scanner.nextInt();

		BookDetails[] bookDetails = new BookDetails[numberOfBooks];

		for (int i = 0; i < numberOfBooks; i++) {

			System.out.println("\nEnter book " + (i + 1) + " details : ");

			System.out.println("Enter Book Id : ");
			int bookId = scanner.nextInt();

			scanner.nextLine();
			System.out.println("Enter Book Title : ");
			String bookTitle = scanner.nextLine();

			bookDetails[i] = new BookDetails(bookId, bookTitle);
		}
        
		System.out.println("\n1)Print book id and title   2)Print book id   3)Print title");
		System.out.println("Enter Choice : ");
		int choice = scanner.nextInt();
        System.out.println("\n---------------------------------------------------");
		switch (choice) {
        
		case 1:
			for (BookDetails bookdetail : bookDetails) {
				bookdetail.display();
				System.out.println("---------------------------------------------------");
			}
			break;

		case 2:
			for (BookDetails bookdetail : bookDetails) {
				bookdetail.displayId();
				System.out.println("---------------------------------------------------");
			}
			break;

		case 3:
			for( BookDetails bookdetail : bookDetails ) {
				bookdetail.displayTitle();
				System.out.println("---------------------------------------------------");
			}
			
		default : 
			System.out.println("Entered wrong choice !!!!");
		}

		
	}
}
