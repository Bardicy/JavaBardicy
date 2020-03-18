package javaHomeworkTasks;

import java.util.Scanner;

public class DoubleLargerNumber {
	public static void main(String[] args) {

		/*
		 * Write a program to find largest of three double values using if-else..if and
		 * logical operators provided by a user (numbers must be distinct)
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter first number");
		double num1 = input.nextDouble();

		System.out.println("Please enter second number");
		double num2 = input.nextDouble();

		System.out.println("Please enter third number");
		double num3 = input.nextDouble();
		
		double largest;

		if (num1 > num2 && num1 > num3) {
			largest=num1;
		} else if (num2 > num1 && num2 > num3) {
			largest=num2;
		} else {
			largest=num3;
		}
		System.out.println("The largest number is " + largest);

	}

}
