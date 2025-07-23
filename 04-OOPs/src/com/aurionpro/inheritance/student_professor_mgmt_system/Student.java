package com.aurionpro.inheritance.student_professor_mgmt_system;

public class Student extends Person {

	private int rollNo;
	private String[] enrolledCourses;

	public static int countStudents;
	public static int countSubjects;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String[] getEnrolledCourses() {
		return enrolledCourses;
	}

	public void setEnrolledCourses(String[] enrolledCourses) {
		this.enrolledCourses = enrolledCourses;
	}

	public static int getCountStudents() {
		return countStudents;
	}

	public static void setCountStudents(int countStudents) {
		Student.countStudents = countStudents;
	}

	public static int getCountSubjects() {
		return countSubjects;
	}

	public static void setCountSubjects(int countSubjects) {
		Student.countSubjects = countSubjects;
	}

	public void getDetails(Student[] students) {
		for (Student student : students) {
			System.out.println("Name : " + student.getName());
			System.out.println("Roll No : " + student.getRollNo());
			System.out.println("Department : " + student.getDepartment());
			for (int i = 0; i < student.getEnrolledCourses().length; i++) {
				System.out.println("Course" + i + 1 + " : " + student.getEnrolledCourses()[i] + "    Course Type : "
						+ student.getCourseTypes()[i]);
			}
			System.out.println("\n-------------------------------------------");
		}
	}

}
