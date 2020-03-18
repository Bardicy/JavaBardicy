package com.syntax.class07;

import java.util.Scanner;

public class DoWhileLuckyNumber {
	public static void main(String[] args) {
		
		Scanner input;
		int number;
		int luckyNumber=17;
		
		input=new Scanner(System.in);
		
		do {
			System.out.println("Please enter any number from 1 to 20");
			number=input.nextInt();
			
		}while(number!=luckyNumber);
		System.out.println("You got it!!!");
	}

}
