package com.Piggybank;

/*
Program: piggy bank Add Amount 
@author: Abhishek Sharma
@date: 29th sept 2022
*/

//declare class AddAmount
public class AddAmount {

	// Instance Variable
	private String name;

	private int amount = 50;

	// default Constructor
	public AddAmount() {
	}

	// Paramaterized Constructor
	public AddAmount(int money, String name) {
		super();
		this.amount = money + amount;
		this.name = name;
	}

	@Override
	public String toString() {
		return "AddAmount [name=" + name + ", amount=" + amount + "]";
	}

	// ------------Getter and Setter for Amount----------------//
	public int getAmount() {
		return amount;
	}

	public void setAmount(int money) {
		this.amount = money + amount;
	}

	// ------------Getter and Setter for Name----------------//
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

} // end of class AddAmount
