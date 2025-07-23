package com.aurionpro.model;

public class BookDetails {

	int bookId;
    String bookTitle;
	
	public BookDetails(int bookId , String bookTitle){
		this.bookId = bookId;
		this.bookTitle = bookTitle;
	}
	
	public void display() {
		System.out.println("Book Id : " + bookId + "\nBook Title : " + bookTitle);
	}
	public void displayId() {
		System.out.println("Book Id : " + bookId );
	}
	public void displayTitle() {
		System.out.println("Book Title : " + bookTitle);
	}
}
