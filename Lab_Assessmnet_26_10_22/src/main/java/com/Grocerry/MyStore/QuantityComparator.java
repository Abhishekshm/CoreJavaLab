package com.Grocerry.MyStore;
/*
Program :- Creating class Quantity Comparator
@Author :- Abhishek Sharma
Date :-26/10/2022
*/

//importing class
import java.util.Comparator;

//importing Packages
import com.Grocerry.model.Grocerry;

//declaring class implementing compartator
public class QuantityComparator implements Comparator<Grocerry> {

	// method for Sorting according to Quantity
	@Override
	public int compare(Grocerry g1, Grocerry g2) {
		if (g1.getItemQuantity() == g2.getItemQuantity())
			return 0;
		else if (g1.getItemQuantity() > g2.getItemQuantity())
			return 1;
		else
			return -1;
	}// end of if else ladder
		// end of method

}// end of class
