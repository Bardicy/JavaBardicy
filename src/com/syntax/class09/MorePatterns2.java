package com.syntax.class09;

public class MorePatterns2 {
	public static void main(String[] args) {
		
		System.out.println("-----Triangle pattern-----");
		
		for (int r=1; r<=4; r++) {
			for (int c=1; c<=r; c++) {
				System.out.print(" *");
				
			}
			System.out.println();
		}
		
		System.out.println("---number pyramid-----");
		for (int r=1; r<=5; r++) {
			for (int c=1; c<=r; c++) {
				System.out.print(c +" ");
				
			}
			System.out.println();
		}
	}
}

