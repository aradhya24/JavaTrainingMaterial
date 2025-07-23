package com.aurionpro.exam_system;

public class PracticalExam implements IExamEvaluator {

	private Integer performanceMarks;
	private Integer vivaMarks;
	private Double finalScore;
	private String grade;

	public PracticalExam(Integer performanceMarks, Integer vivaMarks) {
		this.performanceMarks = performanceMarks;
		this.vivaMarks = vivaMarks;
	}

	@Override
	public void evaluateMarks() {
		finalScore = (performanceMarks * 0.7) + (vivaMarks * 0.3);
		if (finalScore >= 85) {
			grade = "A";
		}
		else if (finalScore >= 70) {
			grade = "B";
		}
		else if (finalScore >= 50) {
			grade = "C";
		}
		else {
			grade = "Fail";
		}

	}

	@Override
	public String calculateGrade() {
		return grade;
	}

}
