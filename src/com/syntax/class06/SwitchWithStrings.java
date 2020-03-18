package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithStrings {
	
	public static void main(String[] args) {
		
		/*Ask user where he or she is from
		 * based on Country, we will define favorite food
		 * Your favorite food is_____
		 */
		
		Scanner input;
		String country;
		String favoriteFood;
		
		input=new Scanner(System.in);
		System.out.println("Where are you from");
		country=input.nextLine();
		
		switch(country) {//can use .toLowercase but need to change case to lowercase as well
		
		case"Morocco":
			favoriteFood="couscous";
			break;
		case"Belarus":
			favoriteFood="Potato";
			break;
		case "Tajikistan":
			favoriteFood = "Osh";
			break;
		case "Afghanistan":
			favoriteFood="Mantu";
			break;
		case "Kazakhstan":
			favoriteFood="Beshparmak";
			break;
		case "Egypt":
			favoriteFood="Ma7shy";
			break;
		case "Palestine":;
			favoriteFood="Misa5an";
			break;
		default:
			favoriteFood="Unknown";
			
		}
		System.out.println("Your favorite food is " + favoriteFood);
		
	}

}
