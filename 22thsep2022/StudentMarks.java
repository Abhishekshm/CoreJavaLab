/*
Program: creating student object  and prnting marks >90
@author: Abhishek Sharma
@date: 22th sept 2022
*/
import java.util.Scanner; //importing Scanner class 
class StudentMarks //declaring class StudentMarks
{
	//declaring main method
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in); //creating Scanner class object
		Student s1 [] =new Student[4]; //decalring Student s1 and giving size
		int s_id,entry=0; //declaring local variable
		double s_marks;  //declaring local variable
		String s_name;  //declaring local variable
		
		//while loop for creating student object
		while(entry<=4)
		{
			s1[entry] = new Student(); //creating student object
			
			
			System.out.println("Enter the Student Id: "); //Asking user to give input
			s_id = sc.nextInt(); //taking input
			
			System.out.println("Enter the Student Name: "); //Asking user to give input
			s_name = sc.next(); //taking input
			
			System.out.println("Enter the Student Marks: "); //Asking user to give input
			s_marks = sc.nextDouble(); //taking input
			
			s1[entry].inserStudent( s_id, s_name,s_marks); //calling inserStudent method
			
			entry+=1;
			//whose marks is more than 90%
			if (s_marks>=90)
			{
				System.out.println(s_name+" marks is  "+s_marks); //printing output marks>=90
			}//end of if
		} //end of while
		
		
	}//end of while
}//end of class
