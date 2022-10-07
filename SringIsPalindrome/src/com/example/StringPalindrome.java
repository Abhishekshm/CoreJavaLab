package com.example;

/*
Program: Checking wheter the String is palindrome or not
@author: Abhishek Sharma
@date: 6th oct 2022
*/
import java.util.Scanner;//importing Scanner class 

//declaring StringPalindrome
public class StringPalindrome {

	static void inputString() {
		// creating Scanner class object
		Scanner sc = new Scanner(System.in);

		System.out.println("Enetr a String"); // Asking user to enter string

		String str = sc.next(); // Taking input

		sc.close(); // closing Scanner class

		checkPalindrome(str); // calling method
	}

	// declaring static method for checking given string is palindrome or not
	static void checkPalindrome(String pStr) {

		char cStr[] = pStr.toCharArray(); // converting String into character

		String reverse = ""; // declaring empty string

		for (int i = cStr.length - 1; i >= 0; i--) { // traversing ooposite and storing character into reverse
			reverse += cStr[i];

		} // end of for

		int flag = pStr.compareTo(reverse); // comparing pstr to reverse and storing into boolean flag

		// if block
		if (flag == 0)
			System.out.println("The given String is palindrome"); // executes if given condition matched
		else
			System.out.println("The given String is not Palindrome"); // executes if given condition is not matched

	} // end of method

	// decalring main method
	public static void main(String[] args) {

		inputString();// calling method for input

	} // end of main method

} // end of class StringPalindeome
