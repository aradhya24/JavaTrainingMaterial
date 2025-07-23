package com.aurionpro.test;

import java.util.Arrays;
import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String input = scanner.nextLine();
		System.out.println();
		int left = 0 ; 
		int right = input.length()-1;
		boolean isPalindrome = true;
		while(left < right){
			if(input.charAt(left) != input.charAt(right)) {
				System.out.println("String is not Palindrome");
				isPalindrome = false;
				break;
			}
			else {
				left++;
				right--;
			}
		}
		if(isPalindrome) {
			 System.out.println("String is Palindrome");
		}
       

	}

}
