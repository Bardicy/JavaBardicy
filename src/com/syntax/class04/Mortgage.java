package com.syntax.class04;

public class Mortgage {
	public static void main(String[] args) {

		double mortgageRate = 4.5;
		int mortgagePrice = 100000;

		if (mortgageRate >= 4.5) {
			System.out.println("I will not buy a house");
		}else {
			System.out.println("I'm going to buy a house!");
			if(mortgagePrice>200000) {
				System.out.println("I will need to take out a loan");
			}else {
				System.out.println("I will pay cash");
			}
		}
		
	}
}
	
