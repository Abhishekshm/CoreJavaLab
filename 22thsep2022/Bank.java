
/*
Program: Bank class for creatng bank Account    
@author: Abhishek Sharma
@date: 22th sept 2022
*/
//declaring class Bank
class Bank 
{
	//declaring Instance Variables//
	private String name;
	private int pan_No;
	private double balance;
	
	
	//declaring default constructor//
	Bank()
	{
	
	}
	
	
	//declaring parameterized constructor//
	Bank(String name,int pan_No,double balance)
	{
		this.name = name;
		this.pan_No = pan_No;
		this.balance = balance;
		
	}
	
	
	//declaring getter(Accessor) and setter(Mutator)//
	
	//------1st getter setter for Student ID------------//
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	
	
	//------2nd getter setter for Student Name------------//
	
	public int getPan_No() {
		return pan_No;
	}
	public void setPan_No(int pan_No)
	{
		this.pan_No = pan_No;
	}
	
	
	//------3rd getter setter for Student Marks------------//
	
	public double getBalance() 
	{
		return balance;
	}
	public void setBalance(double balance)

	{
		this.balance = balance;
	}

}//end of class
