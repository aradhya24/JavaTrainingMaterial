package com.aurionpro.student_mp;

public class Validations {

	public static Boolean getStringValidateAllAlphabets(String name) {
		if (name.trim().matches("[a-zA-Z]+")) {
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
	
	
	public static Boolean negativeValueValidate(Integer number) {
		if(number < 0) {
			System.out.println("Value can't be negative ....");
			return true;
		}
		return false;
	}
	
	public static Boolean maxMarksValidate(Integer number) {
		if(number > 100) {
			System.out.println("Marks should be less than or equal to 100 .....");
			return true;
		}
		return false;
	}
}
