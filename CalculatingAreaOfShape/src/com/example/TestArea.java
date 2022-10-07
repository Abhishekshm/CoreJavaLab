package com.example;

/*
Program: Test class of area
@author: Abhishek Sharma
@date: 6th oct 2022
*/
//decalring main class
public class TestArea {
	// main method
	public static void main(String[] args) {

		Area a = new Area(); // creating object of Area
		a.rectangleArea(4, 8); // calling method rectangle
		a.squareArea(4);// calling method square
		a.circleArea(6); // calling method circle
	} // end of main
} // end of main class
