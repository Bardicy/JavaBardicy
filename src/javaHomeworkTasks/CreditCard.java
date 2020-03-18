package javaHomeworkTasks;

import java.util.Scanner;

public class CreditCard {
	public static void main(String[] args) {
		
		/*Create a Java program that will ask if user has a credit card or not. 
		 * If you user does not have a credit card then offer them. 
		 * If they do have one ask what is balance on the card? 
		 * If balance of the card is larger than 1000, tell them to pay off immediately, 
		 * otherwise you can tell them that they can spend more.
		 */
		
		System.out.println("Do you own a credit card?");
		Scanner input=new Scanner(System.in);
		
		boolean creditCard = input.nextLine().toLowerCase().startsWith("y");
		
		
		if(creditCard==true) {
			System.out.println("What is the balance on your card?");
			int balancein=input.nextInt();
			if(balancein>1000) {
				System.out.println("Please pay off card immediately!");
			}else {
				System.out.println("You may spend more money");
			}
			System.out.println();
		}else {
			System.out.println("Would you like to apply for a credit card?");
		}
		
		
	}

}
