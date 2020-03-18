package javaHomeworkTasks;

import java.util.Scanner;

public class NestedIfLarger2 {

	public static void main(String[] args) {

		/*
		 * Program to find largest number among three numbers using nested if provided
		 * by a user (numbers must be distinct)
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter first number");
		int num1 = input.nextInt();

		System.out.println("Please enter second number");
		int num2 = input.nextInt();

		System.out.println("Please enter third number");
		int num3 = input.nextInt();
		int largest;

		if (num1 > num2) {

			if (num1 > num3) {
				largest = num1;
			} else {// num1>2 BUT num1<num3
				largest = num3;
			}
		} else { // num2>num1
			if (num2 > num3) {// num2 is larger than num1 AND num2 is >num3
				largest = num2;
			} else {// num2>num1 but num2<num3
				largest = num3;
			}

		}

		System.out.println("Largest number is " + largest);
	}

}
