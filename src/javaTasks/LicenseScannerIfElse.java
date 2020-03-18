package javaTasks;

import java.util.Scanner;

public class LicenseScannerIfElse {
	public static void main(String[] args) {
		
				/*You are DMV representative and you need to ask customer their age. 
				 *If they are 18 and older you will issue a driver license to them, otherwise 
				 *you will offer them to get a learners permit.
				 */
		
				
				Scanner yourAge=new Scanner(System.in);
				
				System.out.println("Please indicate your age");
				int age=yourAge.nextInt();
				
				if(age>18) {
					System.out.println("We can issue you a drivers license");
				}else {
					System.out.println("You are not old enough, you can get a learners permit");
				}
				
		
				
			}

		}
		

