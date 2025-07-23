package com.aurionpro.encapsulation.model;

public class Book {
	private String title;
	private String author;
	private boolean isIssued;
	
	
	
	public Book(String title , String author , boolean isIssued){
		this.title = title;
		this.author = author;
		this.isIssued = isIssued;
	}
	
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public void setIssued(boolean isIssued) {
		this.isIssued = isIssued;
	}
	
	public String getStatus() {
		if(isIssued) {
			return "Issued";
		}
		return "Available";
	}
	


}
