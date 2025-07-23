package com.aurionpro.stringprocessortestsuit;

public class StringProcessor {

	public static boolean isPalindrome(String str) {
		String reversed = new StringBuilder(str).reverse().toString();
		return str.equals(reversed);
	}

	public static String reverse(String str) {
		String reversed = new StringBuilder(str).reverse().toString();
		return reversed;
	}

}
