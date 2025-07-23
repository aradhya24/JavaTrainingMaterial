package com.aurionpro.exam_system;

public class TheoryExam implements IExamEvaluator {

	private Integer marks;
	private String grade;

	public TheoryExam(Integer marks) {
		this.marks = marks;
	}

	@Override
	public void evaluateMarks() {
		if (marks >= 90) {
			grade = "A";
		} else if (marks >= 75) {
			grade = "B";
		} else if (marks >= 60) {
			grade = "C";
		} else {
			grade = "Fail";
		}
	}

	@Override
	public String calculateGrade() {
		return grade;
	}
}
