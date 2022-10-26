package com.Grocerry.MyStore;

/*
Program :- Creating class MyStore
@Author :- Abhishek Sharma
Date :-26/10/2022
*/

//Importing Classes
import java.util.Scanner;

//Importing Packages
import com.Grocerry.dao.GrocerryDao;
import com.Grocerry.daoImpl.GrocerrydaoImpl;

//declaring Final Classs
public class MyStore {

	// ---Method for showing menu to the Store owner----//
	static void menu() {
		// ------ priting menu to be done in our System---------//
		System.out.println("-----------Features-----------");
		System.out.println("1. Add Item ");
		System.out.println("2. Delete Item ");
		System.out.println("3. Display all the Item ");
		System.out.println("4. Sort on the basis of Price ");
		System.out.println("5. Sort on the basis of Quantity ");
		System.out.println("6. Exit ");
	} // end of method

	// ----Declaring main method ------//
	public static void main(String[] args) {

		// ----Creating Scanner class Object-------//
		Scanner scan = new Scanner(System.in);

		// --------Creating Reference of GrocerryDao -------//
		GrocerryDao store = new GrocerrydaoImpl();

		// ---Declaring local variable ---//
		int choice;
		int id;

		// ---do while loop---//
		do {
			// ---Calling method for showing menu----//
			menu();
			// ---Taking input from the User---//
			choice = scan.nextInt();

			// ----Declaring Switch case----//
			switch (choice) {

			// ----Case 1 for adding Item----//
			case 1:
				store.addItem(); // -------Calling method to add Item---//
				System.out.println("-------Item Added Successully---------"); // printing Statement
				break; // ----- out from the switch case-------//

			// -----Case 2 for Deleting Item-----//
			case 2:
				// ---Asking User to Enter id-----//
				System.out.println("Eneter the Item Id for the Deletion");
				id = scan.nextInt(); // -----Taking Input from the user-----//

				// -----Storing boolean value into the Flag---------//
				boolean flag = store.deleteItem(id);

				// ---declaring if -else statement-------//
				if (flag) {

					// -------Printing if flag is true-------//
					System.out.println("Item Records are Deleted from our System");
				} else {

					// -------Printing if flag is flase-------//
					System.out.println("Item Id is not Found in our System");
				}
				break; // ----- out from the switch case-------//

			// -----Case 3 for Display Item-----//
			case 3:
				store.displayAll();
				break; // ----- out from the switch case-------//

			// -----Case 4 for Sorting Item-----//
			case 4:
				store.sortPrice();
				break;

			// -----Case 5 for Sorting Item-----//
			case 5:
				store.sortQuantity();
				break;

			// -----Case 6 for Exit-----//
			case 6:
				System.exit(0);
				break;

			// ----If user Entered Wrong option-------//
			default:
				System.out.println("menu that you are looking is not found in our System");

			}// end of switch case
		} while (choice != 6); // -----End of do-While loop-----//

		scan.close();// clossing Scanner
	}
}