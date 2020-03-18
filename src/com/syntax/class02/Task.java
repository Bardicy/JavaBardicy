package com.syntax.class02;

public class Task {
	
	public static void main(String[] args) {
		
		float num1= 0.99F;
		float num2= 1.99F;
		
		float div= num2/num1;
		float mult= num1*num2;
		float sum= num1+num2;
		float sub= num2-num1;
		
		
		System.out.println("The sum of 2 numbers " + num1 + " " + num2 + " is equal to " + sum);
		System.out.println("The subtraction of 2 numbers " + num2 + " " + num1 + " is equal to " + sub);
		System.out.println("The division of 2 numbers " + num2 + " " + num1 + " is equal to " + div);
		System.out.println("The multiplication of 2 numbers " + num1 + " " + num2 + " is equal to " + mult);

		double s=3.9;
		double s2=s*s;
		
		System.out.println("The square of " + s + " is " + s2);
		
		int width = 5;
		int height = 8;
		int area=  width*height;
		int perimeter= (width * 2 + height  * 2);
		
		
		System.out.println("The perimeter of a rectangle with width " + width + " and height " 
				+ height + " equals " + perimeter + " and area is " + area);
		
		
	}

}
