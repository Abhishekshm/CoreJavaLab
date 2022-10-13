package com.question2;

/*
Program: SalariedEmployee class inheritted the Employee class
@author: Abhishek Sharma
@date: 13th oct 2022
*/
//declare class and extend parent class
public class SalariedEmployee extends Employee {
	// static refrence of parent class
	static Employee e;
	// instance variable
	private String projectName;
	private int timeInMonths;

	// // default constructor
	public SalariedEmployee() {
		super();

	}

	// paramaterized constructor
	public SalariedEmployee(String name, String id, String projectName, int timeInMonths) {
		super(name, id);
		this.projectName = projectName;
		this.timeInMonths = timeInMonths;
	}

	// -----------Setter and getters--------------//
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getTimeInMonths() {
		return timeInMonths;
	}

	public int setTimeInMonths(int timeInMonths) {
		return this.timeInMonths = timeInMonths;
	}

	// method for calculating salary on the basis of month
	@Override
	public void calculateSalary(int month) {
		double amount = 25000; // intitalizing per month salary
		System.out.println("Per month salary is: " + amount); // printing amount
		amount = month * amount; // calculating salary on the basis of time
		System.out.println("Your salary after " + month + " month will be " + amount); // printing updated amount

	}// end of method

}// end of class
