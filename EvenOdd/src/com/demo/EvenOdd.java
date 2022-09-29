package com.demo;
/*
Program: sum of Even Odd 
@author: Abhishek Sharma
@date: 29th sept 2022
*/

//decalre class EvenOdd
public class EvenOdd {

	// method for checking Even Or odd
	public static void checkEvenOdd(int... array) { // varrags Arrays

		int sumOfEven = 0, sumOfOdd = 0; // decraing local variable and giving values
		// traversing varrags array
		for (int number : array) {

			// checking number is even or not
			if (number % 2 == 0) { // if else

				sumOfEven = sumOfEven + number; // Adding Even sums

			} else {
				sumOfOdd = sumOfOdd + number; // Adding odd Sums

			} // end of if else
		} // end of for
		System.out.println(sumOfEven + " is the sum of Even numbers  "); // printing sum of Even number
		System.out.println(sumOfOdd + " is the sum of Odd numbers   "); // prining sum of Odd Number
	} // end of method

	// main method
	public static void main(String[] args) {
		checkEvenOdd(5, 9, 2, 3, 4, 56, 98); // calling main method
	}// end of main
} // end of class EvenOdd
