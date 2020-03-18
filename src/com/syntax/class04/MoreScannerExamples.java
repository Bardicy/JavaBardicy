package com.syntax.class04;

import java.util.Scanner;

public class MoreScannerExamples {
	public static void main(String[] args) {
		/*Capture name from a user
		 * print in the format
		 * My name is
		 */
		
		//1. Bring Scanner class into a program
		//System.in --> identifies keyboard
		Scanner scan=new Scanner(System.in);
		
		//Instruct user of what program expects
		System.out.println("Please enter your name");
		
		//capture line of Strings from a user
		String name=scan.nextLine();
		System.out.println("Hello " + name);
		
		//Instruct user of what program expects
		System.out.println("How old are you?");
		
		//capture number from a user
		int age=scan.nextInt();
		
		System.out.println("Your name is " + name + " and you're " + age + " years old");
		
	}

}
