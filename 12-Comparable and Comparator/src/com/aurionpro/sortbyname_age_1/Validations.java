package com.aurionpro.sortbyname_age_1;

public class Validations {
    
	
	public static Boolean getNameValidateAllAlphabets(String name) {
		if(name.trim().matches("[a-zA-Z]+")) {
			return true;
		}
		System.out.println("Name must contain only alphabets ....");
		return false;	
	}
	
	public static Boolean getNameValidateNotNull(String name) {
		if (!name.trim().isEmpty()) {
			return true;
		}
			System.out.println("Name cannot be empty ....");
	    return false;
	}
	
	public static Boolean negativeValueValidate(Integer number) {
		if(number < 0) {
			System.out.println("Age can't be negative ....");
			return true;
		}
		return false;
	}
	
	public static Boolean maxAgeValidate(Integer number) {
		if(number > 100) {
			System.out.println("Age should be less than 100 yrs.");
			return true;
		}
		return false;
	}
	
}
