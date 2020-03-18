package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogical {
	public static void main(String[] args) {
		
		/*You are a salesman
		 *ask user how much his sales were
		 *based on the amount of sales we need to calculate commission
		 *if sales are between 1 - 100   --> commission 10%
		 *if sales are between 100 - 200 --> commission 20%
		 *if sales are between 200 - 500 --> commission 30%
		 *if sales are more than 500     --> commission 50%
		 */
		
		
		
		
		
		
		//1. declare all variables
		double sales;
		double commission;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your sales amount");
		sales=input.nextDouble();
		
		if (sales>=1 && sales<=100) {
			//give user 10% commission
			commission=sales*0.10;
		}else if(sales>100 && sales<=200) {
			commission=sales*.2;
		}else if(sales>200 && sales<=500) {
			// or do it like this System.out.println("You're commission is $" + (sales*.5));
			commission=sales*.3;
		}else {
			commission=sales*.5;
		}
		System.out.println("You're commision is $" + commission);
		
		System.out.println("Based on your commission...");
		
		if(commission>500) {
			System.out.println("You are a great salesman");
		}else {
			System.out.println("You can do better");
		}
	}
		
		//if commission is >100 --> You're a great salesman
}
