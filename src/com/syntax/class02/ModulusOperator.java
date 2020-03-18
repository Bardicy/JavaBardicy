package com.syntax.class02;

public class ModulusOperator {
	
	public static void main(String[] args) {
		
		float f=12.50f;
		float f1=2.7f;
		
		double d=12.50;
		double d1=2.7;
		
		 //float can hold up to 5-7 decimals
		float result=f/f1; //4.6296296
		
		//double can hold up 14-15 decimals
		double result5=d/d1; //4.62962962962963
		
		System.out.println(result);
		System.out.println(result5);
		
		int i=12;
		int y=7;
		
		//testing something
		double a=12;
		double b=7;
		
		int result1=i/y;
		double result2 = i/y;
		float result3 = i/y;
		double result4=a/b;
		
		
		System.out.println(result1); //wrong using int (will only store whole numbers)
		//everything after decimal is not shown
		
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		//modules
		
		int v=16;
		int w=7;
		
		int mod=v%w;
		System.out.println(mod);
		
		
		//I would like to divide 12/7
		//int num1=12.5; not possible to store decimals in int
		
		double num2=12; //we can store int into double
		double num3=7;
		
		System.out.println(num2);
		System.out.println(num2/num3);
		
		
		
		
		
		
		
	}

}
