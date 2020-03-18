package javaTasks;

public class Mortgage {
	public static void main(String[] args) {
		
		/*1. You are a loan specialist and you need to ask user what 
		 * is the amount of loan is needed. If loan is less than 200,000 
		 * then you would lend the money otherwise you would reject the client.
		 *
		 * 3. Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into Celsius and print 
		 * “The temperature is the city __ is __”
		 * 
		 */
		double mortgageRate = 4.4;
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
	