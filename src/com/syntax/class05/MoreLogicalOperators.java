package com.syntax.class05;

public class MoreLogicalOperators {
	public static void main(String[] args) {
		
		/*We have 7 days in a week
		 * if day is 2 or 3 --> we have SDLC class
		 * if day is 6,7 --> Java class
		 * if day is 1,5--> off day
		 * if day is 4--> review class
		 */
		
		int day = 5;
		
		if(day==2 || day==3) {
			System.out.println("We have SDLC Class");
		}else if(day==6 || day==7) {
			System.out.println("We hava Java Class today");
		}else if(day==1 || day==5){
			System.out.println("No class today");
		}else if(day ==4) {
			System.out.println("Review day");
		}else {
			System.out.println("Invalid day");
		}
		
		System.out.println();
		
		String day1 = "Saturday";
		
		if(day1.equals("Tuesday") || day1.equals("Wednesday")) {
			System.out.println("We have SDLC Class");
		}else if(day1.equals("Saturday") || day1.equals("Sunday")) {
			System.out.println("We hava Java Class today");
		}else if(day1.equals("Monday") || day1.equals("Friday")){
			System.out.println("No class today");
		}else if(day1.equals("Thursday")) {
			System.out.println("Review day");
		}else {
			System.out.println("Invalid day");
		}
	}

}
