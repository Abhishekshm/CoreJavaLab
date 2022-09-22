/*
Program: creating Bank class object And display whose balnce is less than 1000
@author: Abhishek Sharma
@date: 22th sept 2022
*/

import java.util.Scanner; //importing Scanner class 
class BankDetails //declaring class BankDetails
{
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in); //creating Scanner class object
		Bank b1 [] =new Bank[4]; //decalring Bank b1 and giving size
		int b_name,entry=0; //declaring local variable
		double b_panNo;  //declaring local variable
		String b_balance;  //declaring local variable
		
		//while loop for creating Bank object
		while(entry<=4)
		{
			b1[entry] = new Bank(); //creating Bank object
			
			
			System.out.println("Enter the Bank Id: "); //Asking user to give input
			b_name = sc.nextInt(); //taking input
			
			System.out.println("Enter the Bank Marks: "); //Asking user to give input
			b_panNo = sc.next(); //taking input
			
			System.out.println("Enter the Bank Name: "); //Asking user to give input
			b_balance = sc.nextDouble(); //taking input
		
			b1[entry].insertBank( b_name, b_panNo,b_balance); //calling inserBank method
			
			entry+=1;
			//whose marks is more than 90%
			if (b_balance<=1000.0)
			{
				System.out.println(b_name+" balance is low  "+b_balance); //printing output balance<1000
			}//end of if
		} //end of while
		
		
	}//end of while
}//end of class
	
		//------------------Incomplete----------------------//