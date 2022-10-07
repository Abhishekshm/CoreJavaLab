package com.example;

/*
Program: Comparing String buffer and String builder
@author: Abhishek Sharma
@date: 6th oct 2022
*/

//declaring class CompBuffbuild
public class CompBuffbuild {

	// declaing main method
	public static void main(String[] args) {

		// taking time from system
		long initialTime = System.currentTimeMillis();
		StringBuilder str = new StringBuilder("Abhi"); // declaring stringBuilder object str

		for (int i = 0; i < 1000000; i++) { // appending "s" millions times
			str.append('s'); // appending
		} // end of for loop

		long finalTime = System.currentTimeMillis() - initialTime; // calculating time after executing StringBuilder
		System.out.println("Total time to append 's' in StringBuilder  :" + finalTime); // priting time taken by
																						// StringBuilder

		initialTime = System.currentTimeMillis(); // taking time from system
		StringBuffer str2 = new StringBuffer("Java"); // creating StringBuffer object str2

		for (int i = 0; i < 1000000; i++) { // appending "s" millions times
			str2.append('s'); // appending
		} // end of for loop

		finalTime = System.currentTimeMillis() - initialTime; // calculating time after executing StringBuilder
		System.out.println("Total time to append 's' in StringBuffer  :" + finalTime); // priting time taken by
																						// StringBuffer

	}// end of main
}// end of class
