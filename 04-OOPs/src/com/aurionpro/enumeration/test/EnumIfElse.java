package com.aurionpro.enumeration.test;

enum Status {
	RUNNING, FAILED, PENDING, SUCCESS;
}

public class EnumIfElse {

	public static void main(String[] args) {

		Status s = Status.SUCCESS;
     
		if (s == Status.RUNNING) {
			System.out.println("All Good");
		} else if (s == Status.FAILED) {
			System.out.println("Try Again");
		} else if (s == Status.PENDING) {
			System.out.println("Please Wait");
		} else {
			System.out.println("Done");
		}

	}

}
