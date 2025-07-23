package com.aurionpro.sortmoviesby_year_title_3;

public class Movies {
    
	protected String title;
	protected Integer year;
	
	public Movies(String title, Integer year) {
		this.title = title;
		this.year = year;
	}

	@Override
	public String toString() {
		return "\nMovie title : " + title + ", Year : " + year;
	}
	
	
}
