package com.aurionpro.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
       
		
		
		System.out.println("Odd number checker");
		Predicate<Integer> isOdd = num -> num%2==1;
		System.out.println("Is Odd 34 : " + isOdd.test(34));
		
		 System.out.println("\n\nNon Empty String");

	        List<String> list = Arrays.asList("", "Java", null, " ");

	        Predicate<List<String>> hasValidString = strings ->
	                strings.stream()
	                       .anyMatch(s -> s != null && !s.trim().isEmpty());

	        if (hasValidString.test(list)) {
	            System.out.println("List contains at least one valid string.");
	        } else {
	            System.out.println("No valid strings found.");
	        }  
		
		
		
		
		System.out.println("Odd number checker");
		
	}
}
