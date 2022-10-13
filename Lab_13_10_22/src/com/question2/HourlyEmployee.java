package com.question2;

/*
Program: HourlyEmployee class inheritted the Employee class
@author: Abhishek Sharma
@date: 13th oct 2022
*/
//declare class and extend parent class
public class HourlyEmployee extends Employee {

	// instance variable
	private int timrInHour;

	// // default constructor
	public HourlyEmployee() {
		super();

	}

	// paramaterized constructor
	public HourlyEmployee(String name, String id, int timrInHour) {
		super(name, id);
		this.timrInHour = timrInHour;
	}

	// -----------Setter and getters--------------//
	public int getTimrInHour() {
		return timrInHour;
	}

	public int setTimrInHour(int timrInHour) {
		return this.timrInHour = timrInHour;
	}

	// too string method
	@Override
	public String toString() {
		return "HourlyEmployee [timrInHour=" + timrInHour + "]";
	}// end of too string

}// end of class
