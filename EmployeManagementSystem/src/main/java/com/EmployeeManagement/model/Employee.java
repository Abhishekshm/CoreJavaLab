package com.EmployeeManagement.model;
/*
Program :- Creating Model of Employee 
@Author :- Abhishek Sharma
Date :-20/10/2022
*/

//declaring class
public class Employee {

	// ---Instance Variable---//
	private int id;
	private String name;
	private double salary;

	// ---Default Constructor---//
	public Employee() {
		super();

	}

	// ---Paramaterized Constructor---//
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// ---Setter and getter for Id ----//
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// ---Setter and getter for Name ----//

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// ---Setter and getter for Salalry ----//

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// -----ToString Method----//
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}// end of too String Method

}// end of class Emplpyee
