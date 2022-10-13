package com.question2;

/*
Program: Test class for creating Hourly and salaried employees 
@author: Abhishek Sharma
@date: 13th oct 2022
*/
import java.util.Scanner; //importing scanner class

//declaring class
public class Test {

	// static refermces
	static Employee e1;
	static HourlyEmployee h;

	// static method for enterting the details of Hourly employees
	static void inputHourlyEmployee() {

		e1 = new Employee(); // object of parent class
		HourlyEmployee h = new HourlyEmployee(); // object of hourly employee class

		Scanner scan = new Scanner(System.in); // creating an object of scanner class

		// Taking input from the user//
		System.out.println("enter the name: "); // asking user to give name
		e1.setName(scan.next());// taking input
		System.out.println("Enter the Id: "); // asking user to give id
		e1.setId(scan.next()); // taking input
		System.out.println("Enter how many hours you are working: "); // asking user to give hours
		int time = h.setTimrInHour(scan.nextInt()); // taking input
		System.out.println();// new line
		System.out.println();// new line
		System.out.println("Employee details are:---"); // printing output
		h.calculateSalary(time); // calling calculate method

		displayEmployee(); // caliing display method
		scan.close(); // clossing scan

	} // end of method

	// static method for enterting the details of salaried employees
	static void inputSalariedEmployee() {
		SalariedEmployee se1 = new SalariedEmployee(); // object of salaried employee class

		Scanner scan1 = new Scanner(System.in); // creating an object of scanner class

		// Taking input from the user//
		System.out.println("enter the name: "); // asking user to give name
		e1.setName(scan1.next()); // taking input
		System.out.println("Enter the Id: "); // asking user to give id
		e1.setId(scan1.next()); // taking input
		System.out.println("Eneter your project name in which you are working"); // asking user to give project name
		se1.setProjectName(scan1.next()); // taking input
		System.out.println("Enter how many months  you will be give to our company: "); // asking user to give months
		int mtime = se1.setTimeInMonths(scan1.nextInt()); // taking input
		System.out.println();// new line
		System.out.println();// new line
		System.out.println("Employee details are:---"); // printing output
		System.out.println("project name : " + se1.getProjectName()); // printing project name
		se1.calculateSalary(mtime); // calling calculate method

		displayEmployee(); // caliing display method
		scan1.close(); // clossing scan

	}// end of method

	// method for printing employee details
	static void displayEmployee() {
		System.out.println("Name : " + e1.getName()); // printing name
		System.out.println("ID : " + e1.getId()); // printing id

	}

	// main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // creating an object of scanner class

		// asking user to choose one option
		System.out.println("Enter 1 for hourly employee ");
		System.out.println("Enter 2 for hourly employee ");

		int choice = sc.nextInt(); // taking input from the user
		// declare switch case
		switch (choice) {

		case 1:
			inputHourlyEmployee(); // calling inputHourlyEmployee method
			break;
		case 2:
			inputSalariedEmployee(); // calling inputHourlyEmployee method
			break;

		default: // default case if user gives wrong input then prgramm will terminate
			System.exit(0);
		}
		sc.close();// clossing scanner
	}// end of main
}// end of class
