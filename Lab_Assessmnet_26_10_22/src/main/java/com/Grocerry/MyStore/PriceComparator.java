package com.Grocerry.MyStore;
/*
Program :- Creating class price Comparator
@Author :- Abhishek Sharma
Date :-26/10/2022
*/

//importing class
import java.util.Comparator;

//importing Packages
import com.Grocerry.model.Grocerry;

//declaring class implementing compartator
public class PriceComparator implements Comparator<Grocerry> {

	// method for Sorting according to price
	@Override
	public int compare(Grocerry g1, Grocerry g2) {
		if (g1.getItemPrice() == g2.getItemPrice())
			return 0;
		else if (g1.getItemPrice() > g2.getItemPrice())
			return 1;
		else
			return -1;
	}// end of if else ladder
		// end of method

}// end of class
