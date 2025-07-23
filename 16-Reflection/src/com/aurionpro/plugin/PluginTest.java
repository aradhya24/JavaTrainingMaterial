package com.aurionpro.plugin;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import com.aurionpro.student.Student;

public class PluginTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
       
		Class c = Plugin.class;
		Plugin plugin = new Plugin();
		
		Constructor<Plugin> privateConstructor = c.getDeclaredConstructor(double.class);
		privateConstructor.setAccessible(true);
		Plugin pluginPrivateConstrutor = privateConstructor.newInstance(3.4);
		
		
		
		Field version = c.getDeclaredField("version"); 
		version.setAccessible(true);
		double versionValue = (double) version.get(pluginPrivateConstrutor); 
        System.out.println("version : " + versionValue);
		
		plugin.execute();
	}

}
