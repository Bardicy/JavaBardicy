package com.syntax.class09;

public class Arrays {

	public static void main(String[] args) {

		int num = 10;

		int num1;
		num1 = 10;

		// declare an array and initialize it and then store values

		int[] array = new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		
		//access elements from an array
		
		System.out.println(array[1]);
		
		//second way
		//String carArray[]; that works too
		
		String[] carArray; //preferred way
		carArray=new String[3];
		
		//storing elements into array
		carArray[0]="BMW";
		carArray[1]="Mercedes";
		carArray[2]="Lexus";
		//I am driving a Lexus
		System.out.println("I am driving a "+ carArray[2]);
		
		System.out.println("****************");
		
		int[] numbers=new int[3];
		numbers [0]=100;
		numbers [1]=200;
		numbers [2]=300;
		//change value of numbers[1]
		numbers[1]=2000;
		System.out.println(numbers[1]);
		System.out.println();

	}

}
