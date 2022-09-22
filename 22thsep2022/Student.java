/*
Program: Student Class for creating name ,id and marks using getter and setter
POJO class: Plain Old Java Object
@author: Abhishek Sharma
@date: 22th sept 2022
*/

//declaring class Account//
class Student
{
	
	//declaring Instance Variables//
	
	private int studentId;
	private String studentName;
	private double marks;
	
	//declaring default constructor//
	
	Student()
	{
		
	}
	
	//method for inserting students//
	
	void inserStudent(int studentId,String studentName,double marks)
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		
	}
	
	//declaring getter(Accessor) and setter(Mutator)//
	
	//------1st getter setter for Student ID------------//
	public int getStudentId()
	{
		return this.studentId;
		
	}
	public void setStudentId(int studentId)
	{
		this.studentId = studentId;
		
	}
	
	//------2nd getter setter for Student Name------------//
	public String getStudentName()
	{
		return this.studentName;
		
	}
	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
		
	}
	//------3rd getter setter for Student Marks------------//
	public double getMarks()
	{
		return this.marks;
		
	}
	public void setMarks(double marks)
	{
		this.marks = marks;
		
	}
	
}//end of class student