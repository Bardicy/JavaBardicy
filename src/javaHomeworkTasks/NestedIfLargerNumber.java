package javaHomeworkTasks;

import java.util.Scanner;

public class NestedIfLargerNumber {
public static void main(String[] args) {
		
		/*Program to find largest number among three numbers 
		 * using nested if provided by a user 
		 * (numbers must be distinct) */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter first number");
		int num1 = input.nextInt();
		
		System.out.println("Please enter second number");
		int num2 = input.nextInt();
		
		System.out.println("Please enter third number");
		int num3 = input.nextInt();
		
		if (!(num1==num2 && num1==num3)){
			if(num1>num2) {
				if(num1>num3) {
					System.out.println(num1 + " is the larger number");
				}else {
					System.out.println(num3 + " is the larger number");
				}
			}else if (num2>num3) {
				System.out.println(num2 + " is the larger number");
			}else {
				System.out.println(num3 + " is the larger number");
			}
				
			}else {
				System.out.println("All numbers are equal");
			}
		}
		
		
		
		
		}
		
		
	
	
	
	




