package com.aurionpro.sort_transcation_by_amount_id_5;

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
	
	public static Boolean negativeValueValidate(Double amount) {
		if(amount < 0) {
			System.out.println("Amount can't be negative ....");
			return true;
		}
		return false;
	}
	
	public static Boolean negativeValueValidate(Integer id) {
		if(id < 0) {
			System.out.println("Id can't be negative ....");
			return true;
		}
		return false;
	}
}
