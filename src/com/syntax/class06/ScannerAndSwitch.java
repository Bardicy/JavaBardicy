package com.syntax.class06;

import java.util.Scanner;

public class ScannerAndSwitch {

	public static void main(String[] args) {

		/*
		 * Ask a user to enter gender: M or F based on the gender will provide
		 * description
		 */

		Scanner input;
		char gender;
		String genderType;

		input = new Scanner(System.in);
		System.out.println("Please enter gender: M or F");
		gender = input.next().charAt(0);

		switch (gender) {

		case 'M':
			genderType = "Male";
			break;
		case 'F':
			genderType = "Female";
			break;
		default:
			genderType = "Unknown";

		}
		System.out.println("Your gender is " + genderType);
	}

}
