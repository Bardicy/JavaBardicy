package javaHomeworkTasks;

import java.util.Scanner;

public class Bonus {
	
	public static void main(String[] args) {
		
		/*Write a program to ask user to enter numbers of worked years and annual salary. 
		 * If user worked for more or equals to 5 years than user is eligible for the bonus, 
		 * otherwise he is not. Once user is eligible and salary is larger than 
		 * 50000 than bonus = 5000, otherwise bonus=3000
		 */
		
		System.out.println("Please enter the number of years you worked at your company?");
		
		Scanner input = new Scanner (System.in);
		int year = input.nextInt();
		
		
		
		if (year>=5) {
			System.out.println("What is your annual salary?");
			double salary = input.nextDouble();
			
			if (salary>50000) {
				System.out.println("You are eligible for a bonus of $5000.00");
			}else {
				System.out.println("You are eligible for a bonus of $3000.00");
			}
			
		}else {
			System.out.println("You are not eligible for the bonus");
		}

	}

}
