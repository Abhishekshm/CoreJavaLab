package com.question1;

/*
Program: Thread with/without lamada
@author: Abhishek Sharma
@date: 13th oct 2022
*/

//declaring class ThreadWithLAmda
public class ThreadWithLamda {

	// Main method
	public static void main(String[] args) {

		// ------------Thread without Lamda--------------//

		// creatiing Runnable interface object
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "  Thread is running");

			}

		}; // end of runnable

		Thread t1 = new Thread(r, "Abhishek"); // creating Thread and giving name
		t1.start(); // starting Thread

		// ------------With Lamda------------//

		// Lamda function
		Runnable r1 = () -> {

			System.out.println(Thread.currentThread().getName() + " Thread is running");
			System.out.println("with Lamda");
		}; // end runnable

		Thread t2 = new Thread(r1, "Chandan"); // creating Thread and giving name
		t2.start(); // starting Thread
	} // end of main
} // end of class
