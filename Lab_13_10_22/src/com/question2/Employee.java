package com.question2;

/*
Program: Employee class and it is inhertable
@author: Abhishek Sharma
@date: 13th oct 2022
*/
//declare class
public class Employee {

	// insatance variable
	private String name;
	private String id;

	// default constructor
	public Employee() {
		super();

	}

	// paramaterized constructor
	public Employee(String name, String id) {
		super();
		this.name = name;
		this.id = id;

	}

	// -----------Setter and getters--------------//
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// method for calculating salary on the basis of time
	public void calculateSalary(int time) {
		double amount = 500; // intitalizing double mount
		System.out.println("Per hour salary is : " + amount); // printing amount
		amount = time * amount; // calaculating amount
		System.out.println("your total salary after " + time + " hours is : " + amount); // printing updated amount
	}// end of method

}// end od class
