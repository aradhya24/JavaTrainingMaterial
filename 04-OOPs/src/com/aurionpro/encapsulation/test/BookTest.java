package com.aurionpro.encapsulation.test;

import java.util.Scanner;

import com.aurionpro.encapsulation.model.Book;

public class BookTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number of books to be record : ");
		int numberOfBooks = scanner.nextInt();

		Book[] book = new Book[numberOfBooks];

		for (int i = 0; i < numberOfBooks; i++) {

			System.out.println("\nEnter book " + (i + 1) + " details : ");

			scanner.nextLine();
			System.out.print("Enter Book Title : ");
			String title = scanner.nextLine();
			System.out.print("Enter Author name : ");
			String author = scanner.nextLine();
			System.out.print("Enter 1 -> Available , 2 -> Issued : ");
			int choice = scanner.nextInt();
			if(choice == 1) {
				book[i] = new Book(title, author  , false );
			}else {
				book[i] = new Book(title, author  , true );
			}

			
		}
		
		System.out.println("\n------------------------------------");
		for(Book books : book) {
			System.out.println("Book Title : " + books.getTitle());
			System.out.println("Book Author : " + books.getAuthor());
			System.out.println("Book Issued Status : " + books.getStatus());
			System.out.println("------------------------------------");
		}
		
		    										
	}

}
