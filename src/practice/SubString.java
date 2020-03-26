package practice;

import java.util.Scanner;

public class SubString {
	public static void main(String[] args){
	     Scanner input = new Scanner(System.in);
	     
	     String entry = input.nextLine();
	     String threeLetters = entry.substring(0,3);
	     System.out.println("The first 3 letters of " + entry + " is " + threeLetters);
	     
	     
	  }
	  
	}


