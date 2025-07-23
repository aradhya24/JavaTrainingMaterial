package com.aurionpro.exam_system;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExamInputService {

	public static IExamEvaluator getTheoryExamInput(Scanner scanner) {

		System.out.print("Enter Theory Marks (0 - 100): ");
		int marks = 0;
		while (true) {
			try {
				marks = scanner.nextInt();
				if (marks > 100 || marks < 0) {
					System.out.print("Theory Marks are out of range , Enter again : ");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				System.out.print("Input Mismatched, Enter Theory marks b/w 0 to 100 : ");
				scanner.next();
			}
		}
		return new TheoryExam(marks);
	}

	public static IExamEvaluator getPracticalExamInput(Scanner scanner) {

		System.out.print("Enter Practical Performance Marks (0 - 100): ");
		int performanceMarks = 0;
		while (true) {
			try {
				performanceMarks = scanner.nextInt();
				if (performanceMarks > 100 || performanceMarks < 0) {
					System.out.print("Practical Performance marks are out of range , Enter Again : ");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				System.out.print("Input Mismatched, Enter Practical Performance marks b/w 0 to 100 :");
				scanner.next();
			}
		}

		System.out.print("Enter Practical Viva Marks (0 - 100): ");
		int vivaMarks = 0;
		while (true) {
			try {
				vivaMarks = scanner.nextInt();
				if (vivaMarks > 100 || vivaMarks < 0) {
					System.out.print("Practical Viva marks are out of range : ");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				System.out.print("Input Mismatched, Enter Practical viva marks b/w 0 to 100 :");
				scanner.next();
			}
		}

		return new PracticalExam(performanceMarks, vivaMarks);
	}

	public static IExamEvaluator getOnlineQuizInput(Scanner scanner) {

		System.out.print("Enter Total Number of  Quiz Questions (1 - 100): ");
		int totalQuestions = 0;
		while (true) {
			try {
				totalQuestions = scanner.nextInt();
				if (totalQuestions <= 0 || totalQuestions > 100) {
					System.out.print("Total Quiz questions should be between 1 and 100 : ");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				System.out.print("Input Mismatched, Enter a valid number of Quiz questions : ");
				scanner.next();
			}
		}

		System.out.print("Enter Correct Quiz Answers (0 - " + totalQuestions + "): ");
		int correctAnswers = 0;
		while (true) {
			try {
				correctAnswers = scanner.nextInt();
				if (correctAnswers > totalQuestions || correctAnswers < 0) {
					System.out.print("Correct Quiz answers cannot be more than total or less than 0 : ");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				System.out.print("Input Mismatched, Enter correct Quiz answers as number : ");
				scanner.next();
			}
		}

		return new OnlineQuiz(correctAnswers, totalQuestions);
	}

}
