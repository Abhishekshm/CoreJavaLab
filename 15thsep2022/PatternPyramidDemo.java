/*
Program:       *
              * *
			 * * *
			* * * *
@author: Abhishek Sharma
@date: 15th sept 2022
*/

import java.util.Scanner;  //importing Scanenr class

//  declaring class
class PatternPyramidDemo
{
	//declaring pattern method
	static void pattern(int numberOfRows)
	{
		for(int i =1 ; i<=numberOfRows ; i++)   //Nested loop
		{
			System.out.println(); //print new line
			for(int spaces =numberOfRows ; spaces>=i ; spaces--) // for loop for spaces
			{
				System.out.print(" "); //printing spaces
			}
			for(int j=1; j<=i;j++)
			{
			System.out.print("* "); //printing stars "*"
			}
		} // end of Nested loop
		
	} //  end of pattern method
	
	//calling main method
	public static final void main(String args[])
	{
		Scanner sc = new Scanner(System.in);  //craeting Scanner class object
		System.out.println("Enter the Number of rows of Stars you want to Print : ");  //Asking user to give input
		int number = sc.nextInt(); //taking input from user
		System.out.println();
		System.out.println("-------This is the Pyramid shaped Stars-----------"); //printing statement before output
		pattern(number); // caling pattern method
	}
	//end of main
}//end of class PatternPyramidDemo