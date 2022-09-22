/*
Program: creating Bank class object And display whose balnce is less than 1000
@author: Abhishek Sharma
@date: 22th sept 2022
*/

class BankDetails //declaring class BankDetails
{
	//Instsnace variable//
	private Bank[] account;
	private int entry;
	
	//no-arguement constuctor//
	BankDetails()
	{
		account = new Bank[5]; //declaring account arrray of Bank type
	}
	
	//method for checking Balance  
	public void checkBalance (Bank input)
	{
		if(entry<account.length) 
		{
			account[entry]=input; 
			entry++;  //entry+1
			
			//checking if balance less than 1000
			if(input.getBalance()<(999))
			System.out.println("Low Balance Account is : --"+  input.getName() + ": " + input.getBalance()); //printing output
		} //end 
	}
	
	//declaring main method
	public static void main(String... args)
	{
		Bank b1 = new Bank("Abhishek",1111,6547);  //creating Bank object and passing values
		Bank b2 = new Bank("Rohan",2222,6984); //creating Bank object and passing values
		Bank b3 = new Bank("Kalyan",3333,489.36); //creating Bank object and passing values
		Bank b4 = new Bank("Susmita",4444,4458); //creating Bank object and passing values
		Bank b5 = new Bank("Arjun",5555,125.99); //creating Bank object and passing values
		
		
		//System.out.println(b1.getBalance()+" ");
		
		BankDetails myBank = new BankDetails(); //creating myBank object of BankDetails
		
		myBank.checkBalance(b1); //caliing checkBalance method
		myBank.checkBalance(b2); //caliing checkBalance method
		myBank.checkBalance(b3); //caliing checkBalance method
		myBank.checkBalance(b4); //caliing checkBalance method
		myBank.checkBalance(b5); //caliing checkBalance method
		
		
	}//end of while
}//end of class
