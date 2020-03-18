package com.syntax.class03;

public class AdditionVsConcatenation {
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		String x="Hello";
		String y="Bye";
		
		//syso + ctrl+space -->autocomplete
		System.out.println(a+b+x+y);  //30HelloBye
		System.out.println(a+x+b+y);  //10HelloBye
		System.out.println(x+y+a+b); //HelloBye30(no) or HelloBye1020(yes)
		System.out.println(x+y+(a+b)); //HelloBye30
		
		//1020HelloBye
		System.out.println(a+""+b+x+y);
		
	}

}
