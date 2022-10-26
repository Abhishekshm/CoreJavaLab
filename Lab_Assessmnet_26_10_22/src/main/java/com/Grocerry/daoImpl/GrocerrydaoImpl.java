package com.Grocerry.daoImpl;

/*
Program :- Creating class of GrocerryDaoImpl that Implements GrocerryDao 
@Author :- Abhishek Sharma
Date :-26/10/2022
*/

//Importing classes
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.Grocerry.MyStore.PriceComparator;
import com.Grocerry.MyStore.QuantityComparator;
//Importing packages
import com.Grocerry.dao.GrocerryDao;
import com.Grocerry.model.Grocerry;

//---Declaring a class That implements GrocerryDao interFace
public class GrocerrydaoImpl implements GrocerryDao {

	// ------Creating Scanner class Object------//
	Scanner sc = new Scanner(System.in);

	// -------Creating object of Arraylist of Grocerry type---------//
	ArrayList<Grocerry> GrocerryList = new ArrayList<Grocerry>();

	// Method for Adding Item in the store
	@Override
	public void addItem() {

		// --------Creating object Grocerry class-------//
		Grocerry Grocerry1 = new Grocerry();

		// ---Asking user to give following details---//
		System.out.println("Enter the id: ");
		Grocerry1.setItemId(sc.nextInt()); // -----Taking input from the user------//
		System.out.println("Enter the Item name: ");
		Grocerry1.setItemName(sc.next()); // -----Taking input from the user------//
		System.out.println("Enter the Item Brand : ");
		Grocerry1.setItemBrand(sc.next()); // -----Taking input from the user------//
		System.out.println("Enter the Item Quantity: ");
		Grocerry1.setItemQuantity(sc.nextInt()); // -----Taking input from the user------//
		System.out.println("Enter the Item Price: ");
		Grocerry1.setItemPrice(sc.nextDouble()); // -----Taking input from the user------//

		// adding items in the list
		GrocerryList.add(Grocerry1);

	}// end of add method

	// Method for deleting item in the store
	@Override
	public boolean deleteItem(int id) {

		// -----Local variable-------//
		boolean status = false;
		// ------Creating Instance of Grocerry------//
		Grocerry delGrocerry = null;
		// ----Searching id in the Grocerry list-----//
		for (Grocerry g : GrocerryList) {

			// -----Single block if Statement----//
			if (g.getItemId() == id)
				delGrocerry = g;
		} // end of Enhanced for loop

		// ------If -Else Statement-----//
		if (delGrocerry == null) {
			status = false; // -----Grocerry not found
		} else {
			GrocerryList.remove(delGrocerry); // Grocerry deleted
			status = true; // setting status true
		}
		return status;// returning status
	} // end of delete Method

	// Method Printing All item in the Store
	@Override
	public void displayAll() {
		// -----Printing All Grocerry present in the List------//
		for (Grocerry g : GrocerryList) {
			System.out.println(g);// printing output
		} // end of Enhanced for loop
	}// end of method

	// method for sorting
	@Override
	public void sortPrice() {

		System.out.println("-------Sorting on the Basis of Price----------");
		Collections.sort(GrocerryList, new PriceComparator());
		for (Grocerry g : GrocerryList) {
			System.out.println(g);
		}

	}// end of method

	// method for sorting
	@Override
	public void sortQuantity() {
		System.out.println("-------Sorting on the Basis of Quantity----------");
		Collections.sort(GrocerryList, new QuantityComparator());
		for (Grocerry g : GrocerryList) {
			System.out.println(g);
		}

	}// end of method

} // end of class
