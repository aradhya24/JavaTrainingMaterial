package com.aurionpro.sortmoviesby_year_title_3;

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
	
	public static Boolean getYearLengthValidate(Integer year) {
		String yearStr = year.toString();
		if(yearStr.length() != 4) {
			System.out.println("Year should be in 4 digits only....");
			return true;
		}
		return false;
	}
	
	public static Boolean getYearValidate(Integer year) {
		if(year >= 1888 && year < 2026) {
			return false;
		}
		System.out.println("Movie is not released in the year " + year + " ....");
		return true;
	}
}
