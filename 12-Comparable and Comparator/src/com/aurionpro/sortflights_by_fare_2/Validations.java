package com.aurionpro.sortflights_by_fare_2;

public class Validations {
	public static Boolean getStringValidateAllAlphabets(String name) {
		if(name.trim().matches("[a-zA-Z]+")) {
			return true;
		}
		System.out.println("Must contain only alphabets ....");
		return false;	
	}
	
	public static Boolean getStringValidateNotNull(String name) {
		if (!name.trim().isEmpty()) {
			return true;
		}
			System.out.println("Input cannot be empty ....");
	    return false;
}
}