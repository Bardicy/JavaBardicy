package javaHomeworkTasks;

import java.util.Scanner;

public class CreditCard2 {
	public static void main(String[] args) {
		
	
	
	System.out.println("Do you own a credit card?");
	Scanner input=new Scanner(System.in);
	
	String creditCard = input.nextLine();
	
	
	if(creditCard.equals("yes")) {
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



