package com.syntax.class01;

public class VariableDeclaration {
	public static void main(String[] args) {
		//create a variable and store value
		//1. declaring a variable and assigning the value
		boolean b=true;
		
		//2nd way: 1st step --> declare variable
		//         2nd step --> assign value
		
		int i;
		i=1000;
		
		//declare multiple variables and assign value later
		
		char x,y,z;
		x='A';
		y='&';
		z='3';
		
		//we cannot have variable with same in 1 program
		//double i=12.99; --> java will complain
		
		z='#';//reassigning the value
		
		double i1=12.99;
		System.out.println(z);
		
		int num=100;
		int num1=100;
		
		System.out.println(num);
		System.out.println(num1);
		
		
	}

}
