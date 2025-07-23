package com.aurionpro.inheritance.student_professor_mgmt_system;

public class Professor extends Person {

	private long professorID;
	private String[] assignedSubjects;

	public long getProfessorID() {
		return professorID;
	}

	public void setProfessorID(long professorID) {
		this.professorID = professorID;
	}

	public String[] getAssignedSubjects() {
		return assignedSubjects;
	}

	public void setAssignedSubjects(String[] assignedSubjects) {
		this.assignedSubjects = assignedSubjects;
	}

	public void getDetails(Professor[] professors) {
		for (Professor professor : professors) {
			System.out.println("Professor name : " + professor.getName());
			System.out.println("ID : " + professor.getProfessorID());
			System.out.println("Department : " + professor.getDepartment());
			System.out.print("Assigned Subjects : \n");
			for (int i = 0; i < professor.getAssignedSubjects().length; i++) {
				System.out.println("Subject" + (i + 1) + " : " + professor.getAssignedSubjects()[i] + "    Subject Type : "
						+ professor.getCourseTypes()[i]);
			}
			System.out.println("\n-------------------------------------------");
		}
	}

}
