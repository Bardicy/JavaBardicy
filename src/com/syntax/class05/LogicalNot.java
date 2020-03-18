package com.syntax.class05;

public class LogicalNot {
	
	public static void main(String[] args) {
		
		//NOT(!) - reverse the condition
		boolean b=!true;
		boolean val=!false;
		
		System.out.println(b);
		System.out.println(val);
		
		boolean isCold=false;
		
		if(!isCold) {
			System.out.println("hello");
		}else {
			System.out.println("bye");
		}
		
		String day1="Tuesday";
		
		//If it is not Monday or Friday --> Find me at Syntax
	
		
		if(!day1.equals("Monday") && !day1.equals("Friday")){
			System.out.println("FInd me at Syntax");
		}
		if (!(day1.contentEquals("Monday") && day1.equals("Friday"))) {
			System.out.println("Find me at Syntax");
		}
		
		
	}

}
