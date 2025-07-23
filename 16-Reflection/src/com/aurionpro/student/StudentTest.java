package com.aurionpro.student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class StudentTest {


	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
         
		Student student = new Student();
	    
		Class c = Student.class;
		System.out.println(c.getName());
		
		System.out.println("\nFields are :");
		for(Field field : c.getDeclaredFields()) {
			System.out.println(field.getName());
		}
		
		System.out.println("\nMethods are :");
		for(Method method : c.getDeclaredMethods()) {
			System.out.println(method.getName() + " type : " + method.getReturnType() + " modifier : " + Modifier.toString(method.getModifiers()));
		}
		
		System.out.println("\nConstructor are :");
		for(Constructor method : c.getConstructors()) {
			System.out.println(method.getName()  + " modifier : " + Modifier.toString(method.getModifiers()));
		}
		
		
		//private access
		
		//field
		Field cgpaField = c.getDeclaredField("cgpa");
        cgpaField.setAccessible(true);              
        double cgpaValue = (double) cgpaField.get(new Student()); 
        System.out.println("CGPA: " + cgpaValue);
        
        
        Field age = c.getDeclaredField("age");
        age.setAccessible(true);
        age.set(student, 14);
        System.out.println("Age : " + age.get(student));
        
        
	}

}
 