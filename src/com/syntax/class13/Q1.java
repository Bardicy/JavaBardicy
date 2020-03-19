package com.syntax.class13;

public class Q1 {
	public static void main(String[] args) {

		/*
		 * Write a program to swap numbers without a temporary variable? Swap 2 Strings
		 * without a temporary variable?
		 */

		int a = 10;
		int b = 20;

		a = a + b; // 30

		b = a - b; // 30-20=10

		a = a - b;

		System.out.println("The value of a = " + a);
		System.out.println("The value of b = " + b);
		
		String str1 = "Syntax";
		String str2 = "Technologies";
		
		str1 = str1 + str2; //DayNight
		
		str2=str1.substring(0, str1.length()-str2.length()); //day
		str1=str1.substring(str2.length()); //Night
		
		System.out.println("The value of str1 = "+str1);
		System.out.println("The value of str2 = "+str2);
		
		//another way
		String s1 = "Hello";
		String s2 = "Bye";
		
		String shortstr1 = s1 + s2;
		s2 = shortstr1.replace(s2, "");
		s1 = shortstr1.replace(s2, "");
		
		System.out.println("The value of s1 "+s1);
		System.out.println("The value of s2 "+s2);


		


	}
}
