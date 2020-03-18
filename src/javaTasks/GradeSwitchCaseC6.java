package javaTasks;

import java.util.Scanner;

public class GradeSwitchCaseC6 {
	
	public static void main(String[] args) {
		
		/*Allow user to enter grade and then provide explanation: 
		 * A-Excellent, B-Good, C-Average, D-Bad, 
		 * any other grade --> Not Acceptable. 
		 * At the end your program should print which 
		 * grade was entered by a user with explanation.
		 */
		
		Scanner input;
		char grade;
		String desc;
		
		input=new Scanner(System.in);
		System.out.println("Please enter your grade");
		grade=input.next().charAt(0);
		
		switch (grade) {
		
		case 'A':
			desc="Excellent";
			break;
		case 'B':
			desc="Good";
			break;
		case 'C':
			desc="Average";
			break;
		case 'D':
			desc="Bad";
			break;
		default:
			desc="Not Acceptable";
		}
		
		System.out.println("Your grade is " + desc);
	}

}
