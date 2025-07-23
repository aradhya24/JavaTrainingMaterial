package com.aurionpro.serialize.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDeserialize {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("student.txt"));
		Student student = (Student)input.readObject();
	    input.close();
	    System.out.println("Object Restored successfully...");
	    student.display();
	}
      
	
	
}
