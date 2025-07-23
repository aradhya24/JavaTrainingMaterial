package com.aurionpro.serialize.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class StudentSerialization  {
    
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
	    Student student = new Student(30, "Aradhya");
	    
	    ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("student.txt"));
	    objectOutputStream.writeObject(student);
        objectOutputStream.close();
        System.out.println("object saved sucessfully");
	}
	
	
}
