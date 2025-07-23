package com.aurionpro.exam_system;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExamSystemTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		IExamEvaluator evaluator;
		int choice = 0;

		while (true) {
			System.out.print(
					"\nChoose Exam type : \n1 -> Theory Exam, 2 -> Practical Exam, 3 -> Online Quiz,  4 -> Review All , 5 -> EXIT : ");
			while (true) {
				try {
					choice = scanner.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Input Mismatched, Enter exam type again...");
					System.out.print(
							"\nChoose Exam type : \n1 -> Theory Exam, 2 -> Practical Exam, 3 -> Online Quiz, 4 -> Review All , 5 -> EXIT : ");
					scanner.next();
				}
			}

			switch (choice) {
			case 1:
				evaluator = ExamInputService.getTheoryExamInput(scanner);
				evaluator.evaluateMarks();
				System.out.println("\n\nTheory Exam grade : " + evaluator.calculateGrade());
				break;

			case 2:
				evaluator = ExamInputService.getPracticalExamInput(scanner);
				evaluator.evaluateMarks();
				System.out.println("Practical Exam grade : " + evaluator.calculateGrade());
				break;

			case 3:
				evaluator = ExamInputService.getOnlineQuizInput(scanner);
				evaluator.evaluateMarks();
				System.out.println("Online Quiz Exam grade : " + evaluator.calculateGrade());
				break;

			case 4:
				evaluator = ExamInputService.getTheoryExamInput(scanner);
				evaluator.evaluateMarks();
				String theoryGrade = evaluator.calculateGrade();

				evaluator = ExamInputService.getPracticalExamInput(scanner);
				evaluator.evaluateMarks();
				String practicalGrade = evaluator.calculateGrade();

				evaluator = ExamInputService.getOnlineQuizInput(scanner);
				evaluator.evaluateMarks();
				String quizGrade = evaluator.calculateGrade();

				System.out.println("Theory marks grade : " + theoryGrade + "\nPractical marks grade : " + practicalGrade
						+ "\nQuiz marks grade : " + quizGrade);
				break;

			case 5:

				System.out.println("Exiting...");
				return;

			default:
				System.out.println("Invalid input choice.");
			}
		}

	}

}