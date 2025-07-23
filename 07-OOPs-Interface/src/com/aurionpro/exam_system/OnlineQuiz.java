package com.aurionpro.exam_system;

public class OnlineQuiz implements IExamEvaluator {

	private Integer correctAnswers;
	private Integer totalQuestions;
	private Double percentage;
	private String grade;

	public OnlineQuiz(Integer correctAnswers, Integer totalQuestions) {
		this.correctAnswers = correctAnswers;
		this.totalQuestions = totalQuestions;
	}

	@Override
	public void evaluateMarks() {
		percentage = (correctAnswers * 100.0) / totalQuestions;

		if (percentage >= 90) {
			grade = "A";
		} else if (percentage >= 75) {
			grade = "B";
		} else if (percentage >= 60) {
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
