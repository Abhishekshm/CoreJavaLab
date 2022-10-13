package com.question4;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) throws CoustomException {
		Scanner sc = new Scanner(System.in);
		CoustomException e = new CoustomException();
		System.out.println("enter name :");
//		e.setName(sc.next());
		System.out.println("Enter id : ");
		e.setId(sc.nextInt());
		System.out.println("Enter age : ");
		e.setAge(sc.nextInt());
		if (e.getName() == null) {
			try {
				throw new CoustomException("Name cant be blanked");
			} catch (CoustomException c) {
				System.out.println("Name cant be blanked  " + c);
			} finally {
				sc.close();
			}

		}
	}
}
