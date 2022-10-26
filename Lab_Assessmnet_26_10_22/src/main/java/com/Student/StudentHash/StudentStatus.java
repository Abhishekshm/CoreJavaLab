package com.Student.StudentHash;

/*
Program :- Creating a class of student status
@Author :- Abhishek Sharma
Date :-26/10/2022
*/

//importing classe
import java.util.HashMap;
import java.util.Scanner;

//decalring class
public class StudentStatus {

	// declaring main method
	public static void main(String[] args) {

		// creating Scanner class object
		Scanner sc = new Scanner(System.in);

		// ----Local variable----//
		// boolean fee status
		boolean feeStatus = false;
		int id;

		// Student object
		Student s = new Student();

		// creating Hash map object
		HashMap<Integer, Student> studentInfo = new HashMap<>();

		// adding Student in the list
		studentInfo.put(101, new Student(101, "Abhishek", "B.tech", 25000));
		studentInfo.put(102, new Student(102, "Shekhar", "BCA", 25000));
		studentInfo.put(103, new Student(103, "Subodh", "Diploma", 25000));
		studentInfo.put(104, new Student(104, "Karan", "Civil", 25000));
		studentInfo.put(105, new Student(105, "Raj", "Electrical", 0));

		// Asking input
		System.out.println("Enter Student id : ");
		// taking input
		id = sc.nextInt();
		// checking student present or not
		boolean status = studentInfo.containsKey(id);

		// if-else
		if (status) {
			s = studentInfo.get(id);
			System.out.println(s); // printing details

			// do while
			do {

				// checking Studnet gives fee or not
				feeStatus = s.getFee() == 0;
				if (feeStatus) {
					System.out.println("Fees is not paid"); // true if fee not paid
				} else {
					System.out.println("Fees is  paid"); // false if fee is paid
				} // end if if-esle

			} while (false); // end of while
		} else {
			System.out.println("Student Not Found"); // student not found
		} // end of outer if

	}// end of main
}// end of class
