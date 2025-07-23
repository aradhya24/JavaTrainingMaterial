package com.aurionpro.mathutil;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MathUtilTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class c = MathUtil.class;
		
		Method square = c.getDeclaredMethod("square", int.class);
		square.setAccessible(true);
		System.out.println("Square of 4 is : " + square.invoke(new MathUtil(), 4));
		

	}

}
