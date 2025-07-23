package com.aurionpro.inheritance.student_professor_mgmt_system;

public class Person {

	private String name;
	Departments department;
	CourseTypes[] courseTypes;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Departments getDepartment() {
		return department;
	}

	public void setDepartment(Departments department) {
		this.department = department;
	}
	
	
	public CourseTypes[] getCourseTypes() {
		return courseTypes;
	}

	public void setCourseTypes(String[] courseTypesString) {
		CourseTypes[] courseTypes = new CourseTypes[courseTypesString.length];
		int i = 0;
		for (String courseType : courseTypesString) {
			courseTypes[i++] = CourseTypes.valueOf(courseType);
		}
		this.courseTypes = courseTypes;
	}
	

	public void displayDetails() {

		System.out.println("I am Person");
	}
}
