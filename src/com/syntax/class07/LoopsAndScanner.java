package com.syntax.class07;

import java.util.Scanner;

public class LoopsAndScanner {
	public static void main(String[] args) {
		
		// we want to ask user's name5 times and print Good Afternoon ___ 5 times;
		Scanner input;
		String name;
		int num=1;
		
		input=new Scanner(System.in);
		
		while(num<=5) {
		System.out.println("What is your name?");
		name=input.nextLine();
		
		System.out.println("Good afternoon " + name);
		System.out.println();
		num++;
		}
		
		//we are playing a lottery and a lucky number is 17;
		//we want to keep asking user any number from 1-20 until he gets lucky number
		//output --> congrats
		
		int num2=0;  //not a good example (look at DoWhileLuckyNumber for better way 
		while(num2<=20) {
					System.out.println("Please enter number from 1-20?");
			num2=input.nextInt();
			
			if(num2==17) {
				System.out.println("Congrats!");
				break;
			}
		}num2++;
	}

}
