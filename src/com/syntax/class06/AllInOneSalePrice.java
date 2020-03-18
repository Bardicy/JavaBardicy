package com.syntax.class06;

import java.util.Scanner;

public class AllInOneSalePrice {

	public static void main(String[] args) {

		/*
		 * Write a program to ask user if there is a sale if no sale --> not going
		 * shopping if sale we will ask the price of the item based on the price we will
		 * apply discount and calculate final price
		 * 
		 * if price is less than 20 --> apply 10% if price is between 20 and 100 -->
		 * apply 20$ if price is between 100 and 500 --> apply 30% if price is more than
		 * 500 --> apply 50%
		 * 
		 * After discount ___ the price of the item reduced from ___ (original price) to
		 * ___(final price)
		 */

		Scanner input;
		String sale;
		double price;
		double discount;
		double finalPrice;

		input = new Scanner(System.in);

		System.out.println("Is there a sale?");
		sale = input.nextLine();

		if (sale.equalsIgnoreCase("yes")) {
			System.out.println("What is the price of the item?");
			price = input.nextDouble();

			if (price < 20) {
				discount = price * .10;
			} else if (price >= 20 && price < 100) {
				discount = price * .20;
			} else if (price >= 100 && price < 500) {
				discount = price * .30;
			} else {
				discount = price * .50;
			}
			finalPrice = price - discount;
			System.out.println("After $" + discount + " discount, the price of the item reduced from $" + price
					+ " to $" + finalPrice);

		} else {
			System.out.println("No shopping today");
		}

	}

}
