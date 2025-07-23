package com.aurionpro.test;

import java.util.Scanner;

public class CountNoOfWordsInSentence {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String input = scanner.nextLine().toLowerCase();
		System.out.println();
		

		int countNumberOfWords = 1 ;
		
		if(input.equals(" ") || input.equals("")) {
			countNumberOfWords = 0;
		}
		else {
			for(int i = 0 ; i < input.length() ; i++) {
				if(input.charAt(i) == ' ') {
				      countNumberOfWords++;
				}
			}
			System.out.println("Number of Words in Sentence : " + countNumberOfWords);
		}
		

	}

}
