package javaTasks;

import java.util.Scanner;

public class CountryLanguageC6 {
	
	public static void main(String[] args) {
		
		/*Ask user to enter their country and capture it. 
		 * Once values are captured print which language user speaks.
		 */
		
		Scanner input;
		String country;
		String language;
		
		input=new Scanner(System.in);
		System.out.println("Where are you from?");
		country=input.nextLine();
		
		switch(country) {
		
		case "Egypt":
			language="Arabic";
			break;
		case "America":
			language="English";
			break;
		case "Afghanistan":
			language="Farsi";
			break;
		case "Spain":
			language="Spanish";
			break;
		default:
			language="I don't know what language you speak";
				
		}
		System.out.println("Your language is, " + language);
		
	}

}
