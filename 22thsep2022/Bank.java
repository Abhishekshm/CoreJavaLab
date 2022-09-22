
/*
Program: Bank class for creatng bank Account    
@author: Abhishek Sharma
@date: 22th sept 2022
*/

//----------------------------Incomplete--------------------------//
class Bank 
{
	//declaring Instance Variables//
	private String name;
	private String pan_No;
	private double balance;
	//declaring default constructor//
	Bank()
	{
	
	}
	//declaring parameterized constructor//
	void insertBank(String name,String pan_No,double balance)
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
	
	public String getPan_No() {
		return pan_No;
	}
	public void setPan_No(String pan_No)
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