/*
Program: Duplicate Entries ,sorting ,and deleing duplicate entries
@author: Abhishek Sharma
@date: 22th sept 2022
*/

import java.util.Scanner; //importing Scanner class
import java.util.Arrays; //importing arrayays Class

//declaring class arrayayDemo
class arrayayDemo
{
	//method for taking input from the user
	static void inputarray()
	{
		Scanner sc= new Scanner(System.in); //creating Scanner class object
		System.out.println("Enter the size of the arrayay:"); //Asking user to give input
		int size= sc.nextInt(); //taking input
		int array[]= new int[size]; //declaring arrayay and givivng size
		System.out.println("Enter the elements:"); //Asking user to give input
	
		//for loop to enter elements in the arrayay
		for(int i=0;i<size;i++)
		{
	     	array[i]= sc.nextInt(); //taking input
		}
		System.out.println("Arrays elements are:"); //printing statement before output
        displayArray(array); //calling displayArray
		System.out.println(); //printing new line
		System.out.println(); //printing new line
		duplicate(array); //calling displayArray
		sorting(array); //calling sorting
		System.out.println(); //printing new line
		System.out.println("After removing duplicate entries Array become :"); //printing statement before output
          	deleteDuplicate(array); //calling deleteDuplicate
	}//end of method inputarray
	
	//method for finding duplicate Elements in Array
	static void duplicate(int dArray[])
   {
	   System.out.println("Duplicate elements in the Array are : ");
	   
	   //outer for loop for traversering
	   for(int i=0; i<dArray.length;i++)
	   {
		   //for loop for finding the duplicate value in the array
		   for(int j=i+1;j<dArray.length;j++)
		   {
			   if(dArray[i]==dArray[j])
				   System.out.print(dArray[i]+ "  ");
		   } //end of for

	   } //end of outer for
	   
   }// end of method duplicate
   
   //method for sorting array
	static void sorting(int sarray[])
	{
		  System.out.println(); //printing new line
		  System.out.println("After sorting arrayay elements are:");  //printing statement before output
      	 	  Arrays.sort(sarray); // method for sorting array elements	 
		  displayArray(sarray); //calling displayArray
		  System.out.println(); //printing new line
	}
	
	//method for display Array
	static void displayArray(int myArray[])
	{

	   System.out.println();
		
		//for loop for traversering
		for(int i:myArray)
		{
		 System.out.print(i+ "  "); //printing array elements

		} //end of for

	}//end of displayArray
	
	//method for deleting duplicate elemnets in the array
   static void deleteDuplicate(int myArray[])
   {
	   int size= myArray.length; //declare size and giving value
	   int newSize; //declare new size
	   if(size==0||size==1)
		newSize=size; //giving newSize to value

	   int temp[] = new int[size]; //declare temp array and giving size
	   int j=0; //declare integer variable j
	   for(int i=0;i<size-1;i++)
	   {
		   if(myArray[i]!=myArray[i+1])
		   {
			temp[j++]=myArray[i];
		   }
	   }
	   temp[j++]=myArray[size-1];

	   //updating the Array
	   for(int i=0; i<j;i++)
	   {
		myArray[i]= temp[i];
	   } //end of for
	   
	   //for loop for traversering
	   for(int i=0;i<j;i++)
	   {
		System.out.print(myArray[i]+"  "); //printing updated Array
	   }//end of for
   } //end of deleteDuplicate
	
	//declare main method
   public static void main(String ...args)
  {
    inputarray(); //calling inputarray

  } //end of main
}   //end of class 
