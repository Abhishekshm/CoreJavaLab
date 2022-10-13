package com.question4;

public class CoustomException extends Exception {

	private String name;
	private int id;
	private int age;

	public CoustomException(String string) {
		super();
		// TODO Auto-generated constructor stub
	}

	public CoustomException(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public CoustomException() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}