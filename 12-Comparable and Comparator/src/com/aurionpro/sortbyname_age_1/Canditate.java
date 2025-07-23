package com.aurionpro.sortbyname_age_1;

public class Canditate {
    
	protected String name;
	protected Integer age;
	
	public Canditate(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "\nName : " + name + ", Age : " + age;
	}
	
	
}
