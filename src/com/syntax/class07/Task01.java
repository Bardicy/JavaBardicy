package com.syntax.class07;

public class Task01 {
	public static void main(String[] args) {
		System.out.println("***********Task 2*****************");
		// print odd numbers from 1 to 20
		
		//1st way
		int num = 1;

		while (num <=20) {
			System.out.println(num);
			num += 2;

		}
		//2nd way using mod and if condition
		System.out.println("___________________________");
		int num2=1;
		while (num2<=20) {
			if (num2%2 !=0) {
				System.out.println(num2);
			}
			num2++;
			
		}
					System.out.println("-------------------------");

		//3rd way
		
		int y=1;
		while(y<=20) {
			System.out.println(y++);
			y++;
		}
		
	}
}
