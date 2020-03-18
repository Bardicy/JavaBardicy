package com.syntax.class12;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your Mom's first name?");
		String name1 = input.nextLine();
		
		System.out.println("What is your Dad's first name?");
		String name2 = input.nextLine();
		
		System.out.println("Boy or Girl?");
		String babyName = input.nextLine();
		
		String SuggestedBName = null;
		
		int half1 = name1.length() /2;
		int half2 = name2.length()/2;
		
		if (babyName.equalsIgnoreCase("Girl")) {
			SuggestedBName = name1.substring(0, half1) + name2.substring(half2);
			System.out.println(SuggestedBName);
			
		}else if (babyName.equalsIgnoreCase("Boy")) {
			SuggestedBName=name2.substring(0,half2)+name1.substring(half1);
			 System.out.println(SuggestedBName);
		 }
		
		
		
	}

}
