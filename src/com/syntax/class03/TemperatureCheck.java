package com.syntax.class03;

public class TemperatureCheck {

	public static void main(String[] args) {
		
		int temp=32;
		int realTemp=28;
		
		
		if(realTemp<temp) {
			System.out.println("Water will freeze with temperature "+ realTemp);
		}else
			System.out.println("Water will NOT freeze with temperature "+ temp);
		

	}

}
