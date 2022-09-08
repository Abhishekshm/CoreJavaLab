/*
Program: Simple Interest 
@author: Abhishek Sharma
@date: 8th sept 2022

*/
//  declaring class

class SimpleInterest
{
	//calling main method
	public static final void main(String args[])
	{
		
		int principle= Integer.parseInt(args[0]);  //taking input from user
		int rateOfInterest= Integer.parseInt(args[1]);
		
		int time=5; // declaring a integer "time" variable and assinging 5 to it
		
		int interest= (principle*rateOfInterest*time)/100; //formula of Simple Interest
		
		System.out.println("The Simple Interest is: "+interest); // Printing simple Interest
	}
	//end of main
}//end of class SimpleInterest