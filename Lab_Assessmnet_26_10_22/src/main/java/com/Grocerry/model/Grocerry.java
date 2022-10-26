package com.Grocerry.model;

/*
Program :-Pojo class of grocerry
@Author :- Abhishek Sharma
Date :-26/10/2022
*/
//decalring class
public class Grocerry {

	// Instance Variable
	private int itemId;
	private String itemName;
	private String itemBrand;
	private int itemQuantity;
	private double itemPrice;

	// Default Constructor
	public Grocerry() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Paramaterized Constructor
	public Grocerry(int itemId, String itemName, String itemBrand, int itemQuantity, double itemPrice) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemBrand = itemBrand;
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
	}

	// Setter and Getter//
	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	// Setter and Getter//
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	// Setter and Getter//
	public String getItemBrand() {
		return itemBrand;
	}

	public void setItemBrand(String itemBrand) {
		this.itemBrand = itemBrand;
	}

	// Setter and Getter//
	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	// Setter and Getter//
	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	// To String Method
	@Override
	public String toString() {
		return "Grocerry [itemId=" + itemId + ", itemName=" + itemName + ", itemBrand=" + itemBrand + ", itemQuantity="
				+ itemQuantity + ", itemPrice=" + itemPrice + "]";
	}

}// end of class
