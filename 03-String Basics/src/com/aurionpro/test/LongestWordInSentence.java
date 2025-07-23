package com.aurionpro.test;

import java.util.Scanner;

public class LongestWordInSentence {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String input = scanner.nextLine().toLowerCase();
		System.out.println();
		
		int startIndex = 0;
		int lastIndex = 0;
		int countWordLength = 0 , maxCount = 0;
		for(int i = 0 ; i < input.length() ; i++) {
			if(input.charAt(i) != ' ') {
				countWordLength++;
			}
			else {
				if(countWordLength > maxCount) {
					maxCount = countWordLength;
					startIndex = i - countWordLength;
					lastIndex = i;
				}
				countWordLength = 0;
			}
		}
		System.out.println("Longest word in Sentence : " + input.substring(startIndex, lastIndex) + " -> Length :" + maxCount);

	}

}
