package javaHomeworkTasks;

import java.util.Scanner;

public class BirthMonth {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your birth Month");
		String month = input.nextLine();
		String season = null; //what is null?

		if (month.equals("January") || month.equals("February") || month.equals("December")
				|| month.equals("November")) {
			season=("Winter");
		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season=("Spring");
		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season=("Summer");
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season=("Fall");
		} else {
			season=("Invalid");
			System.out.println("Invalid Month");
		}
		if(!(season.equals("Invalid"))); //WHY is it still printing this statement???
		System.out.println("You were born in "+ season);

	}

}
