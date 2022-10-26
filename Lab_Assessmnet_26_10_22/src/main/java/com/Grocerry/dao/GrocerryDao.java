package com.Grocerry.dao;

/*
Program :- Creating Dao of Grocerry
@Author :- Abhishek Sharma
Date :-26/10/2022
*/
//Decalring interface
public interface GrocerryDao {

	// ----Abstract Method for Adding Item in the Store-----//
	public void addItem();

	// ----Abstract Method for Deleteting Item in the Store-----//
	public boolean deleteItem(int id);

	// ----Abstract Method for Display Item in the Store-----//
	public void displayAll();

	// ----Abstract Method for sorting Item in the Store-----//
	public void sortPrice();

	// ----Abstract Method for sorting Item in the Store-----//
	public void sortQuantity();

}
