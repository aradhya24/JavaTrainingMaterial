package com.aurionpro.strreverse;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HiddenOpsTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class c = HiddenOps.class;
		
		Method secretCode = c.getDeclaredMethod("secretCode", String.class);
		
		secretCode.setAccessible(true);
		
		System.out.println("Secrect Code reverse : " + secretCode.invoke(new HiddenOps(), "Aradhya"));
	}

}
