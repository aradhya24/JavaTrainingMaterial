package com.aurionpro.enumeration.emp_payroll;

public class Employee {
	private int employeeId;
	private String name;
	private Double salary;
	private JobRole jobRole;
	
	public Employee(int employeeId, String name, Double salary, JobRole jobRole) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.jobRole = jobRole;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public JobRole getJobRole() {
		return jobRole;
	}

	public void setJobRole(JobRole jobRole) {
		this.jobRole = jobRole;
	}
	
	
	public double calculateBonus(JobRole jobRole) {
		
		if(jobRole == JobRole.MANAGER) {
			return 0.2*salary;
		}
		if(jobRole == JobRole.DEVELOPER || jobRole == JobRole.DESIGNER) {
			return 0.15*salary;
		}
		
		return 0.1*salary;
	}
	
}
