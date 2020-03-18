package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogicalOperators {
	public static void main(String[] args) {
		
		/*Take age input from a user and then based on age print output
		 * if age from 0-2 --> You are a baby
		 * if age from 3-5 --> you are a kid
		 * if age from 6-12 --> you are a child
		 * if age from 13-19 --> you are a teenager
		 * if age from 20-64 --> you are an adult
		 * if age is more or equal to 65 --> you are a senior citizen */
		
		Scanner input = new Scanner(System.in);
		
		int age;
		System.out.println("Please enter your age");
		age = input.nextInt();
		
		if(age>0) {
			if(age<3) {
			System.out.println("You are a baby");
			}else if(age>=3 && age<=5) {
			System.out.println("You ara a kid");
			}else if(age>=6 && age<=12) {
			System.out.println("You are a child");
			}else if(age>=13 && age<=19) {
			System.out.println("You are a teenager");
			}else if(age>=20 && age<=64) {
			System.out.println("You are an adult");
			}else {
			System.out.println("You are a senior citizen");
			}
		}else {
			System.out.println("Please enter a valid age");
		}
	}

}
