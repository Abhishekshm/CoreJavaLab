package com.Student.StudentHash;

/*
Program :- Pojo Class of Student 
@Author :- Abhishek Sharma
Date :-26/10/2022
*/

//declaring class
public class Student {

	// insatance Variables
	private int id;
	private String name;
	private String Course;
	private double fee;

	// default constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	// paramaterized Constructor
	public Student(int id, String name, String course, double fee) {
		super();
		this.id = id;
		this.name = name;
		Course = course;
		this.fee = fee;
	}

	// setter and Getter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// setter and Getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// setter and Getter
	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	// setter and Getter
	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	// to string method
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Course=" + Course + ", fee=" + fee + "]";
	}

}// end of class
