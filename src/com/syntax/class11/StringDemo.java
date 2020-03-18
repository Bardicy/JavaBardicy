package com.syntax.class11;

public class StringDemo {
	public static void main(String[] args) {
		
		String school = "Syntax";
		
		String str = new String("HELLO");
		
		String str1 = "This is a String &*W 8989 (Anything";
		
	//how many characters String has
		System.out.println("----Length() Function-------");
		System.out.println(school.length());
		
		int size =str.length();
		System.out.println("String length is " + size);
		
		//convert String to lowercase or uppercase
		System.out.println("----To Uppercase/To Lowercase------");
		System.out.println(school.toUpperCase());
		System.out.println(str.toLowerCase());
		
		//concatinate 2 String
		System.out.println("------Conactinate Function-------");
		String newString= str + school;
		System.out.println(newString);
		
		String day = "Saturday";
		String date =" 14";
		
		String newDate = day.concat(date);
		System.out.println(newDate);
		
		char grade = 'A';
		String str2="Student";
		//below code will give CE,
		//since concat() method is used to attach 1 String to another 
		//str2.concat(grade);
		
		System.out.println("-----isEmpty Function------");
		//tells true if there is no characters inside the String
		//tells falls if any characters are inside the String
		String str3="";
		boolean empty = str3.isEmpty();
		System.out.println(empty);
		
		System.out.println("-----trim() Function------");
		
		String str4 = "    Welcome to Syntax!   ";
		//removes empty/white space at the beginning and end of the String
		str4 = str4.trim();
		System.out.println("String with no leading of trailing spaces: " +str4);
		
	
	
	
	
	}

}
