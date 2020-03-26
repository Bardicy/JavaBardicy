package com.syntax.class15;

public class OddEven {

	void even(int a) {
		if (a%2==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
	}
	
	
	public static void main(String[] args) {
		OddEven calc = new OddEven();
	
		calc.even(5);
		calc.even(10);
	
	
	
	}
	
	
	

}
