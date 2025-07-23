package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Movie;

public class MovieTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number of Movies to be stored : ");
		int numberOfMovie = scanner.nextInt();
        
		Movie[] movie = new Movie[numberOfMovie];
		scanner.nextLine();
		for (int i = 0; i < numberOfMovie; i++) {

			System.out.println("\nEnter Movie " + (i + 1) + " details : ");
            
			System.out.println("Enter the Movie Name : ");
			String movieName = scanner.nextLine();

			
			System.out.println("Enter the genre : ");
			String genre = scanner.nextLine();
	

			movie[i] = new Movie(movieName, genre);
		}
		
		System.out.println("\n\nMovies based on Action genre are as follow : ");
		System.out.println("--------------------------------");
		for(Movie movies : movie) {
			movies.display();
		}
		

	}

}
