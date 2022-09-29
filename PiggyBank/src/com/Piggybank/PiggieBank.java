package com.Piggybank;

/*
Program: piggy bank Add Amount 
@author: Abhishek Sharma
@date: 29th sept 2022
*/

//importing Scanner class
import java.util.Scanner;

//decraling class piggieBank
public class PiggieBank {

	// method for creating account and adding ammount
	static void addMoney(AddAmount p) {
		Scanner sc = new Scanner(System.in); // creating Scanner class object
		int choice; // declaring variable for choosing options
		// Asking for input
		System.out.println("\npress 1 for regural Account" + "press 0 for manual acount");
		choice = sc.nextInt(); // Taking input

		// if else statement
		if (choice == 1) {
			System.out.println("Enetr your name : "); // asaking for input name
			p.setName(sc.next()); // taking input name
			// printing Regural account
			System.out.println("Your name is " + p.getName() + "  and Avl Bal is : " + p.getAmount());

			// else statement
		} // end of if
		else {
			System.out.println("Enetr your name :"); // asking for input name
			p.setName(sc.next()); // taking name

			System.out.println("Enetr your amount you  want to deposit "); // Asking to enter Amount

			p.setAmount(sc.nextInt()); // Taking input Amount

			// printing manual Generatted Account
			System.out.println("Your name is " + p.getName() + "  and Avl Bal is : " + p.getAmount());

			// Asking user if he want to deposit more amount
			System.out.println("are you want to add more money into the account (y/n)");

			char cho = sc.next().toLowerCase().charAt(0); // taking choice
			System.out.println("Enetr amount : "); // asking to ente to amount
			p.setAmount(sc.nextInt()); // taking input

			// while loop adding ammount
			while (cho == 'y') {
				int a = 0; // decalring a as 0
				a = a + p.getAmount(); // adding ammount
				break; // braeak satement
			} // end of while
				// printing manual Generatted Account with Updated balance
			System.out.println("Your name is " + p.getName() + "  and updated Avl Bal is : " + p.getAmount());
		} // end of else
		sc.close(); // clossing scanner
	} // end of method addmoney

	// declaring main method
	public static void main(String[] args) {

		// creating object of AddAmount classs
		AddAmount add = new AddAmount();
		addMoney(add); // calling method and passing Addamount object

	} // end of main method
} // end of class
