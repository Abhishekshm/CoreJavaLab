package com.EmployeManagementSystem;
/*
Program :- Creating Dao of Employee 
@Author :- Abhishek Sharma
Date :-20/10/2022
*/

//----Importing Scanner Class----//
import java.util.Scanner;

//---------Importing Packages------//
import com.EmployeeManagement.dao.EmployeeDao;
import com.EmployeeManagement.daoImpl.EmployeeDaoImpl;
import com.EmployeeManagement.model.Employee;

//----Declaring main class-----//
public class App {

	// ---Method for showing menu to the user----//
	static void features() {
		// ------ priting features to be done in our System---------//
		System.out.println("-----------Features-----------");
		System.out.println("1. Add Employee ");
		System.out.println("2. Delete Employee ");
		System.out.println("3. Update Employee ");
		System.out.println("4. Search Employee ");
		System.out.println("5. Display all the Employee ");
		System.out.println("6. Exit ");
	} // end of method

	// ----Declaring main method ------//
	public static void main(String[] args) {

		// ----Creating Scanner class Object-------//
		Scanner scan = new Scanner(System.in);

		// --------Creating Reference of EmployeeDao -------//
		EmployeeDao company = new EmployeeDaoImpl();

		// ---Declaring local variable ---//
		int choice;
		int id;

		// ---do while loop---//
		do {
			// ---Calling method for showing Featers----//
			features();
			// ---Taking input from the User---//
			choice = scan.nextInt();

			// ----Declaring Switch case----//
			switch (choice) {

			// ----Case 1 for adding Employee----//
			case 1:
				company.addEmployee(); // -------Calling method to add Employee---//
				System.out.println("-------Employee Added Successully---------"); // printing Statement
				break; // ----- out from the switch case-------//

			// -----Case 2 for Deleting Employee-----//
			case 2:
				// ---Asking User to Enter id-----//
				System.out.println("Eneter the Employee Id for the Deletion");
				id = scan.nextInt(); // -----Taking Input from the user-----//

				// -----Storing boolean value into the Flag---------//
				boolean flag = company.deleteEmployee(id);

				// ---declaring if -else statement-------//
				if (flag) {

					// -------Printing if flag is true-------//
					System.out.println("Employee Records are Deleted from our System");
				} else {

					// -------Printing if flag is flase-------//
					System.out.println("Employee Id is not Found in our System");
				}
				break; // ----- out from the switch case-------//

			// ---Case 3 for Updating the Wrongly Entered employee details---//
			case 3:
				// ----Asking user to give the id for udating------//
				System.out.println("Enter the Id of the Employee that need correction");
				id = scan.nextInt(); // -----Taking Input--------//
				flag = company.updateEmployee(id); // ---- Storing boolean value to flag----//
				// ----If-Else statement----//
				if (flag) {
					System.out.println("Employee Details are Updated"); // -------if flag is True --------//
				} else {
					System.out.println("Entered Id is not Found!............"); // -------if flag is flase --------//
				} // end of if Else statement
				break; // ----- out from the switch case-------//

			// -----Case 4 for searching Employee in the list---------//
			case 4:
				// ----Creating Instance of Employee------//
				Employee eSearch = null;
				System.out.println("Enter the employee Id for Seraching the Details: ");
				id = scan.nextInt(); // -------Taking input for searching Employee ------//
				// ---Storing employee adress present in the list----//
				eSearch = company.findEmployee(id);
				// ---if else----//
				if (eSearch == null) {
					System.out.println("The Employee is not Present in our system"); // Id not found
				} else {
					// ---Printing Employee Details---//
					System.out.println(" Id : " + eSearch.getId() + " , Name : " + eSearch.getName() + " , Salary : "
							+ eSearch.getSalary());
				} // end of if-else statement
				break; // ----- out from the switch case-------//

			// ----Case 5 For Display all the Employee in the List--------//
			case 5:
				company.displayAll();
				break; // ----- out from the switch case-------//

			// ----Case 6 for Exit from the Programm immediatley-----//
			case 6:
				System.exit(0); // exit from the programm
				break; // ----- out from the switch case-------//

			// ----If user Entered Wrong option-------//
			default:
				System.out.println("Features that you are looking is not found in our System");
			}// end of switch case

		} while (choice != 6); // -----End of do-While loop-----//
		scan.close();
	}// end of main method
}// end of main class
