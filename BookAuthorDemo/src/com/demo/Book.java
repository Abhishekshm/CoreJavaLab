package com.demo;

/*
Program: Book details
@author: Abhishek Sharma
@date: 29th sept 2022
*/

//decalring class Book
public class Book {
	// Instance variable
	private String bookName;
	private int yearOfPublication;
	private double price;
	private Author aur; // creating ref of Author
	// default Constructor

	public Book() {
		super();
	}

	// Paramaterized Constructor
	public Book(String bookName, int yearOfPublication, double price, Author aur) {
		super();
		this.bookName = bookName;
		this.yearOfPublication = yearOfPublication;
		this.price = price;
		this.setAur(aur);
	}

	// ------------Getter and Setter ----------------//
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	// ------------Getter and Setter ----------------//
	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	// ------------Getter and Setter ----------------//
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// ------------Getter and Setter ----------------//
	public Author getAur() {
		return aur;
	}

	public void setAur(Author aur) {
		this.aur = aur;
	}

}// end of class Book
