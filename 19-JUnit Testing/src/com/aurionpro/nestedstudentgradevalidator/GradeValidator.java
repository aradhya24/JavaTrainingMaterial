package com.aurionpro.nestedstudentgradevalidator;

public class GradeValidator {
    
	boolean isGradeValid(int grade) {
		if(grade <= 100 && grade >= 0) {
			return true;
		}
		return false;
	}
	
	
	String getGradeCategory(int grade) {
		if(grade > 75) {
			return "Distinction";
		}
		else if(grade < 75 && grade > 34) {
			return "Pass";
		}
		else {
			return "Fail";
		}
	}
}
