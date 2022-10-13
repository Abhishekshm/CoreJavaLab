package com.question3;

/*
Program: user1 class wants to withdraw amount
@author: Abhishek Sharma
@date: 13th oct 2022
*/
//declaring class

public class User1 extends Thread {

	Account a; // parent class refernce

	// parametrized constructor
	User1(Account a, String name) {
		super(name);
		this.a = a;
	}

	// run method for starting a thread
	@Override
	public void run() {

		a.makeWithdraw(400); // calling makeWithdraw method
		if (a.getBalance() < 0) { // if -else statement
			System.out.println("Ammount is Over Withdraw"); // id account get currupt then this will be displayed
		} // end of if

	} // end of run
}// end of class