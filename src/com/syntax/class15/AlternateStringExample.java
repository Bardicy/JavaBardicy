package com.syntax.class15;

import java.util.Scanner;

public class AlternateStringExample {
public static void main(String Args[]){
		
		Scanner in = new Scanner(System.in);
 
		String s = in.nextLine(); //read string
		int len = s.length();  //for storing length of string
		
		String newWord = "";  //for printing out
		
		for(int j = 0; j < len; j+=2){   
		    
		    newWord = newWord + s.charAt(j);
		    
		}
 
		//loop would execute for (len / 2) times 
		//printing out the alternate characters of the string
		
		System.out.println(newWord);
 
	}
 
}


