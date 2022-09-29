package com.demo;
/*
Program: Book details
@author: Abhishek Sharma
@date: 29th sept 2022
*/

//decalring class BookDetails
public class BookDetails {

	// method for displaying book details
	static void display(Book b) {
		System.out.println("Book name : " + b.getBookName());
		System.out.println("Book Author name : " + b.getAur());
		System.out.println("Book price : " + b.getPrice());
		System.out.println("Year of publictaion of Book: " + b.getYearOfPublication());

	}// end of method

	// decalring main method
	public static void main(String[] args) {
		// creating book object and instance of author in book and giving values and
		// also giving vlaue to the Author
		Book b1 = new Book("StoryBooks", 2022, 99.50, new Author("Abhishek", 22));
		display(b1); // calling display method

	} // end of main method
}// end of main class BookDetails
