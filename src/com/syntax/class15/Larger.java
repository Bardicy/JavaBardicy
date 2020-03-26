package com.syntax.class15;

public class Larger {
	
	void large (int a, int b){
		if(a>b) {
			System.out.println(a + " is the larger number");
		}else {
			System.out.println(b + " is the larger number");
		}
	}
	
	public static void main(String[] args) {
		Larger calc = new Larger();
		calc.large(10,3);
		calc.large(3, 100);
		
		
	}

}
