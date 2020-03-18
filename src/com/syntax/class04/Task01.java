package com.syntax.class04;

public class Task01 {
	public static void main(String[] args) {
		
		System.out.println("---------Part 1 of Task----------");
		//Part 1 of task
		boolean diploma=true;
		double gpa=3.70;
		
		
		if(diploma) {
			System.out.println("Congratulation!");
			if(gpa>=3.5) {
				System.out.println("You are eligible for a scholarship");
			}else {
				System.out.println("You should have studied harder");
			}
		}else {
			System.out.println("Please get a degree");
		}
		
		
		
		
	}

}
