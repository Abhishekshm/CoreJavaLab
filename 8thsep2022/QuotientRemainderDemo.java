/*
Program: Find Quotient and Remainder
@author: Abhishek Sharma
@date: 8th sept 2022

*/

//  declaring class

class QuotientRemainderDemo
{
	//calling main method
	public static final void main(String args[])
	{
		
		int divisor= Integer.parseInt(args[0]);  //taking input from user
		int dividend= Integer.parseInt(args[1]);
		
		int quotient= dividend/divisor;   //Quoteient
		int remainder= dividend%divisor;   //Remainder
		
		System.out.println("The Quotient is: "+quotient); //Printing quotient
		System.out.println("The Remainder is: "+remainder);  //Printing Reamaider
		
	}
	//end of main
}//end of class QuotientRemainderDemo
