package com.EmployeeManagement.daoImpl;
/*
Program :- Creating class of EmployeeDaoImpl that Implements EmployeeDao 
@Author :- Abhishek Sharma
Date :-20/10/2022
*/

//---Importing ArrayList class-------/
import java.util.ArrayList;
//------Importing Scanner class-------//
import java.util.Scanner;

//---Importing Packages----//
import com.EmployeeManagement.dao.EmployeeDao;
import com.EmployeeManagement.model.Employee;

//---Declaring a class That implements EmployeeDao interFace
public class EmployeeDaoImpl implements EmployeeDao {

	// ------Creating Scanner class Object------//
	Scanner scan = new Scanner(System.in);

	// -------Creating object of Arraylist of Employee type---------//
	ArrayList<Employee> employeeList = new ArrayList<Employee>();

	// Method for Adding Employee in the list
	public void addEmployee() {

		// --------Creating object employee class-------//
		Employee employee1 = new Employee();

		// ---Asking user to give following details---//
		System.out.println("Enter the id: ");
		employee1.setId(scan.nextInt()); // -----Taking input from the user------//
		System.out.println("Enter the name: ");
		employee1.setName(scan.next()); // -----Taking input from the user------//
		System.out.println("Enter the Salary : ");
		employee1.setSalary(scan.nextDouble()); // -----Taking input from the user------//

		// --------Adding Employee to the List------//
		employeeList.add(employee1);

		// ---Printing Statement-----//
		System.out.println("Employee Details are----");
		System.out.println(); // -----New Line------//
		System.out.println(employeeList); // --------Printing List--------//
	}// end of method addEmployee

	// Method for Deleteting Employee From the list
	public boolean deleteEmployee(int id) {

		// -----Local variable-------//
		boolean status = false;
		// ------Creating Instance of Employee------//
		Employee delEmployee = null;
		// ----Searching id in the employee list-----//
		for (Employee e : employeeList) {

			// -----Single block if Statement----//
			if (e.getId() == id)
				delEmployee = e;
		} // end of Enhanced for loop

		// ------If -Else Statement-----//
		if (delEmployee == null) {
			status = false; // -----Employee not found
		} else {
			employeeList.remove(delEmployee); // Employee deleted
			status = true; // setting status true
		}
		return status;// returning status

	}// end of deleteEmployee

	// Method for updating Employee from the list
	public boolean updateEmployee(int id) {

		// -----Local variable-------//
		boolean status = false;
		// ---Creating Instance of Employee----//
		Employee eSearch = null;

		// ----Searching employee from the list
		for (Employee e : employeeList) {
			if (e.getId() == id)
				eSearch = e;
		} // end of Enhanced for loop

		// -------If else Statement-----//
		if (eSearch == null) {
			status = false; // ---if employee not found in the list---//
		} else {
			int choice; // ----Local Variable----//

			// ----Asking User to Choose given Options------//
			System.out.println("1: Update The Employee Name");
			System.out.println("2: Update the salary of Employee");
			choice = scan.nextInt(); // ----Taking input----//

			// ----Declare Switch case----//
			switch (choice) {

			// -----Case 1 for Updating the name-----//
			case 1:

				// ------Asking user to Enter the New Name-------//
				System.out.println("Enter the New name of the Employee");
				eSearch.setName(scan.next()); // ----Taking input----//
				System.out.println("Name Updated Successfully........."); // -----Printing Statement-------//
				status = true; // setting status true
				break; // ----- out from the switch case-------//
			case 2:

				// ------Asking user to Enter the New Name-------//
				System.out.println("Enter the New Salary of the Employee");
				eSearch.setSalary(scan.nextDouble()); // ----Taking input----//
				System.out.println("Salary Updated Successfully.........");
				status = true; // setting status true
				break; // ----- out from the switch case-------//

			// ----If user Enetred Worng input-------//
			default:
				System.out.println("Oops! You Enetred Wrong option....");
			} // end of Switch Case
		} // end of if Else
		return status; // return status

	}// end of Update Methdod

	// Method for finding Employee From the list
	public Employee findEmployee(int id) {

		// ---Creating Instance of Employee----//
		Employee eFind = null;

		// ----Searching employee from the list
		for (Employee e : employeeList) {
			// --if-else Statement--//
			if (e.getId() == id)
				eFind = e;
		} // end of Enhanced for loop
		return eFind; // return eFind
	} // end of Method findEmployee

	// Method for Display all the Employee in the list
	public void displayAll() {

		// -----Printing All employee present in the List------//
		for (Employee e : employeeList) {
			System.out.println(e);// printing output
		} // end of Enhanced for loop
	}// end of method displayAll

}// end of class
