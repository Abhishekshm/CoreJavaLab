package com.question3;

/*
Program: MyAccount class to start thread
@author: Abhishek Sharma
@date: 13th oct 2022
*/

//declaring main class
public class MyAccount {

	static Account a = new Account(); // creating static account object

	// main method
	public static void main(String[] args) {

		User1 t1 = new User1(a, "Abhishek"); // creating user1 object
		User2 t2 = new User2(a, "Rahul"); // creating user1 object

		t1.start(); // starting thread 1

		t2.start(); // starting Thread 2

	}// end of main

}// end of class
