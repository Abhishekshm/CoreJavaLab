package com.question3;

/*
Program: Account for withdraw ammount
@author: Abhishek Sharma
@date: 13th oct 2022
*/
//declaring class
public class Account {

	// instance variable
	private int balance = 500;

	// getter for balance
	public double getBalance() {
		return balance;
	}

//method for calculating balance
	public void withdraw(int amount) {

		balance = balance - amount; // calculating balance
	}

	// sysnchronized method for make withdraw
	synchronized void makeWithdraw(int amt) {

		if (getBalance() >= amt) { // if statement
			System.out.println(Thread.currentThread().getName() + "  wants to withdraw :" + amt); // printing output

			withdraw(amt); // sending amount to withdarw method
			System.out.println(Thread.currentThread().getName() + " is withdrawing :" + amt); // printing output
		} else {
			System.out.println(Thread.currentThread().getName() + " , Insuffecient amount of Balance:" + amt); // printng
																												// low
																												// balance
																												// and
																												// cant
																												// be
																												// withdrawn
			System.out.println("The balance is low to withdraw :" + getBalance()); // prinitng low balnce
		} // end of if-else
	}// end of method

}// end of class
