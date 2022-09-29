package com.demo;

/*
Program: Author details
@author: Abhishek Sharma
@date: 29th sept 2022
*/

//decalring Class Author
public class Author {

	// Instance variable
	private String authorName;
	private int age;

	// default Constructor
	public Author() {
		super();
	}

	// Paramaterized Constructor
	public Author(String authorName, int age) {
		super();
		this.authorName = authorName;
		this.setAge(age);
	}

	// ------------Getter and Setter ----------------//
	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	// ------------Getter and Setter ----------------//
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// ------------to string ----------------//
	public String toString() {
		return authorName + "  Age: " + age;
	}

}
