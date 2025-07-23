package com.aurionpro.test;

import java.util.Scanner;

public class ReplaceItoEInString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String input = scanner.nextLine();
		System.out.println();
		
		
		String result = input.replaceAll("e", "i");
		System.out.println("Replace String with e -> i : " + result);
		 
		
		
		

	}

}
