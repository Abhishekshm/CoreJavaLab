package com.EmployeeManagement.dao;
/*
Program :- Creating Dao of Employee 
@Author :- Abhishek Sharma
Date :-20/10/2022
*/

import com.EmployeeManagement.model.Employee;

//---declaring Interface----//
public interface EmployeeDao {

	// ----Abstract Method for Adding Employee in our System-----//
	public void addEmployee();

	// ----Abstract Method for Deleteting Employee in our System-----//
	public boolean deleteEmployee(int id);

	// ----Abstract Method for Updating Employee in our System-----//
	public boolean updateEmployee(int id);

	// ----Abstract Method for Finding Employee in our System-----//
	Employee findEmployee(int id);

	// ----Abstract Method for Display Employee in our System-----//
	public void displayAll();

}// end of interface
