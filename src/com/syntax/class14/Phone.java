package com.syntax.class14;

public class Phone {
	
	//Create a Class “Phone”. Create 3 Objects of it:  
	//iPhone, Android, Nokia with specific  attributes and behaviors.
	
	String make;
	String model;
	int year;
	
	void fast() {
		System.out.println(make + " " + model + " is fast");
	}
	void userFriendly() {
		System.out.println(make + " " + model + " is user friendly");

	}
	
	public static void main(String[] args) {
		
		Phone phone1 = new Phone();
		phone1.make="iPhone";
		phone1.model = "11";
		phone1.year = 2019;
	}

}
