package com.example;

/*
Program: class of area
@author: Abhishek Sharma
@date: 6th oct 2022
*/
public class Area extends Shape {

	@Override
	void rectangleArea(int length, int breadth) { // overridden method of rectangle
		int area = length * breadth; // calculating area
		System.out.println("The area of the rectangle: " + area); // printing area

	}

	@Override
	void squareArea(int side) { // overridden method of Square
		int area = side * side; // calculating area
		System.out.println("The area of the sqaure is : " + area); // printing area

	}

	@Override
	void circleArea(float radius) { // overridden method of Circle
		float area = ((radius * radius) * 3.14f); // calculating area
		System.out.println("The area of the sqaure is : " + area); // printing area

	}

}
