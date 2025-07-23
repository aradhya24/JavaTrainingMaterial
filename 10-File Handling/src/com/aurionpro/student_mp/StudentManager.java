package com.aurionpro.student_mp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StudentManager {

	static void addStudent(Student student) throws IOException {
		try (FileWriter writer = new FileWriter("D:\\Aradhya\\10-File Handling\\student.txt", true)) {
			writer.write(student.toString() + "\n");
		}
	}

	static void viewAllStudent() throws IOException {
		System.out.println("\n------- List of All Students -------\n");
		try (BufferedReader reader = new BufferedReader(new FileReader("D:\\Aradhya\\10-File Handling\\student.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}
	}

	static void searchStudentByRollNo(Integer rollNo) throws IOException {
		boolean found = false;
		try (BufferedReader reader = new BufferedReader(new FileReader("D:\\Aradhya\\10-File Handling\\student.txt"))) {
			String line;
			System.out.println("\n");
			while ((line = reader.readLine()) != null) {
				if (line.toLowerCase().contains(("roll no : " + rollNo + ",").toLowerCase())) {
					System.out.println("\nRecord found ......");
					System.out.println(line);
					found = true;
					break;
				}
			}
		}
		if (!found) {
			System.out.println("Student with roll no " + rollNo + " not found");
		}
	}

	static void deleteStudentByRollNo(Integer rollNo) throws IOException, NumberFormatException {
		File originalfile = new File("D:\\Aradhya\\10-File Handling\\student.txt");
		File tempFile = new File("D:\\Aradhya\\10-File Handling\\studentTemp.txt");

		boolean deleted = false;

		try (BufferedReader reader = new BufferedReader(new FileReader(originalfile));
				BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
			String line;
			while ((line = reader.readLine()) != null) {
				if (line.toLowerCase().contains(("roll no : " + rollNo + ",").toLowerCase())) {
					deleted = true;
					continue;
				}
				writer.write(line);
				writer.newLine();
			}
		}

		if (!deleted) {
			System.out.println("Student with roll no " + rollNo + " not found");
			tempFile.delete();
			return;
		}

		boolean deleteSuccess = originalfile.delete();
		if (!deleteSuccess) {
			System.out.println("Could not delete original file. Make sure it's not open in Notepad or other apps.");
			return;
		}

		boolean renameSuccess = tempFile.renameTo(originalfile);
		if (renameSuccess) {
			System.out.println("Student with roll no : " + rollNo + " , Deleted Successfully....");
		} else {
			System.out.println("Could not rename temp file. Check permissions or if file is locked.");
		}
	}

}
