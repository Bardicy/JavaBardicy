package javaTasks;

import java.util.Scanner;

public class CityTemp {
	public static void main(String[] args) {
		
		/* Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into Celsius and print 
		 * “The temperature is the city __ is __”
		 */
		
		double f;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please input your city");
		
		String city=input.next();
		
		System.out.println("Please input the temperature in fahrenheit");
		
		f=input.nextDouble();
		
		System.out.println("The temperature in the city of " + city + " is " + celsius(f)
				+ " celsius");
	}	
		static double celsius(double f)
	{
			return (f-32)*5/9;
}

}