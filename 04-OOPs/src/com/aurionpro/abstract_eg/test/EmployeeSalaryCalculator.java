package com.aurionpro.abstract_eg.test;

import java.util.Scanner;

import com.aurionpro.abstract_eg.model.Developer;
import com.aurionpro.abstract_eg.model.Intern;

public class EmployeeSalaryCalculator {

	public static void main(String[] args) {

		Developer[] developer = new Developer[2];
		Intern[] intern = new Intern[2];
		Scanner scanner = new Scanner(System.in);

		developer[0] = new Developer("Aradhya", "1", 10000.0, 2000.0);
		developer[1] = new Developer("Om", "2", 102200.0, 2000.0);

		intern[0] = new Intern("Srushti", "3", 5300.0);
		intern[1] = new Intern("Sahil", "4", 6300.0);

		for (int i = 0; i < 2; i++) {
			developer[i].printDeveloper();
		}
		for (int i = 0; i < 2; i++) {
			intern[i].printInterns();
		}
	}

}
