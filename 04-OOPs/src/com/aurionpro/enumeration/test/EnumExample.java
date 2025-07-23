package com.aurionpro.enumeration.test;

//enum Status{
//	RUNNING , FAILED , PENDING , SUCCESS;
//}

public class EnumExample {

	public static void main(String[] args) {

		Status[] s = Status.values();
		for (Status status : s) {
			System.out.println(status + " : " + status.ordinal());
		}

	}

}
