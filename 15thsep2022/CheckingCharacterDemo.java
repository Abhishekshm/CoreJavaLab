/*
Program: Check wheher the character is "Vowel","Consonent","Number","Specaial character"
@author: Abhishek Sharma
@date: 15th sept 2022

*/

import java.util.Scanner;  //importing Scanenr class

//declaring CheckingCharacterDemo class
class CheckingCharacterDemo
{
	//declaring charInput method
	static void charInput()
	{
		Scanner sc = new Scanner(System.in);  //craeting Scanner class object
		System.out.println("Enter the Character you want to check: ");  //Asking user to give input
		char value = sc.next().charAt(0); //taking input from user
		characterCheck(value); //calling characterCheck method
	}
	// end of charInput method
	
	// declaring method characterCheck
	static void characterCheck(char characterValue)
	{
		int  asciiValue = characterValue; // calculating Ascii Value for Uppercase and Lowercase
		
		//staring of if esle ladder
		if((asciiValue>=65) && (asciiValue<=90)) //Checking if charcater is in uppercase
		{
			if((characterValue=='A') ||(characterValue=='E') ||(characterValue=='I') ||(characterValue=='O') ||(characterValue=='U')) //checking vowel
			{
				System.out.println(" ---------The cahracter is Vowel----------"); //printing Vowel
			}
			else
			{
				System.out.println(" ---------The cahracter is Consonenet----------"); //printing Consonent
			}
		}
		else if((asciiValue>=97) && (asciiValue<=122)) //Checking if charcater is in lowercase
		{
			if((characterValue=='a') ||(characterValue=='e') ||(characterValue=='i') ||(characterValue=='o') ||(characterValue=='u')) //checking consonenet
			{
				System.out.println("---------The cahracter is Vowel----------"); //printing Vowel
			}
			else
			{
				System.out.println("---------The cahracter is Consonenet----------"); //printing Consonent
			}
		}
		else if((asciiValue>=48) && (asciiValue<=57)) // checking if the input is number
		{
			System.out.println(" ---------The given input is Number----------"); //prining Numbers
		}
		else
		{
			System.out.println(" ---------The given input is Special Character----------"); //printing Special Character
		} // ending of if else ladder
	} // end of characterCheck method
	
	
	//calling main method
	public static final void main(String args[])
	{ 
		charInput(); // calling charInput method
	}
	//end of main
}//end of class CheckingCharacterDemo