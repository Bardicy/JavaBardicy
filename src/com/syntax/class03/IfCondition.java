package com.syntax.class03;

public class IfCondition {

	public static void main(String[] args) {
		
		//Declare a number and compare if number is larger than 100
		//If number is larger than 100 --> my number is large
		
		System.out.println("Starting coding");
		
		int num=178;
		if(num>100) {
			System.out.println("My number is large"); //if this is true then it will print
			//if not true then it will not allow me in this block and not print (door will stay
			//closed) --change value of num to test out different numbers
		}
		
		System.out.println("End of the program");
		
		System.out.println("------------------------");
		
		int expectedHours=15;
		int actualHours=15;
		//if actual is more than expected --> you will love java
		
		if(actualHours>=expectedHours) {//if true go inside if block
			System.out.println("You will love Java"); //change actual hours to see dif result
		}
		else {//otherwise (if false) --> go inside else block
			System.out.println("You will not like Java");
		}
		
		System.out.println("------------------------");
		
		double budget=100000;
		double carPrice=12000;
		//using if, we are doing verification and selective execution
		
		if(budget>carPrice) {
			System.out.println("I'm buying a car today!");
		}else {
			System.out.println("I will not buy this car today. " + "I will go learn Java");
		}
		
		System.out.println("I am a code, after if condition");
	
	}
 
}
