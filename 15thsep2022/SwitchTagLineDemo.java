/*
Program: tagline of famous companies printing with enhanced Switch Case
@author: Abhishek Sharma
@date: 15th sept 2022

*/

import java.util.Scanner;  //importing Scanenr class
//  declaring class
class SwitchTagLineDemo
{
	//declaring tagLine method
	static void tagLine()
	{
		Scanner sc = new Scanner(System.in);  //craeting Scanner class object
		System.out.println(); //printing new line
		System.out.println("Eneter the Company name For tag line 'Nicky,'Uber','Apple','Audi','Amazon'"); //Asking user for the Tagline 
		String tagLine = sc.next().toLowerCase();  //taking input and converting it into in Lower case
		
		
		switch(tagLine)  //Enhanced Switch Case
		{
			case "nicky" -> System.out.println("--------Just do it---------");  	// printing Tag line of Nicky
			case "uber" -> System.out.println("------Move the way you want.---------");		// printing Tag line of Uber
			case "apple" -> System.out.println("---------Think Diferent-------------");		// printing Tag line of Apple
			case "audi" -> System.out.println("-----------Advancement Through Technology----------");		// printing Tag line of Audi
			case "amazon" -> System.out.println("----------Work Hard, Have Fun, Make History--------");		// printing Tag line of Amazon
			default -> System.out.println("----------Enter from the above list :----------- "); // if the input is wrong then default case will be printed
		} // end of Switch
	}// end of tagLine method
	
	
	//calling main method
	public static final void main(String args[])
	{
		tagLine(); //calling tagLine method
	}
	//end of main
}//end of class SwitchTagLineDemo