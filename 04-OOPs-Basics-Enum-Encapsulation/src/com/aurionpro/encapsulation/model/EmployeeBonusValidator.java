package com.aurionpro.encapsulation.model;

public class EmployeeBonusValidator {
   
	 private String name;
	 private double salary;
	 private double bonus;
	 
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		if(bonus <= (salary * 0.2)) {
			this.bonus = bonus;
		}
	}
	
	public void displaySalary(){
		System.out.println("Salary : " + salary);
		if(bonus == 0.0) {
			System.out.println("Bonus is greater than 20% of salary which is not acceptable!!!!!!!!!");
		}
		System.out.println("Bonus : " + bonus);
		System.out.println("Total Salary : " + (salary + bonus));
		System.out.println("------------------------------------------------");
	}
	 
}
