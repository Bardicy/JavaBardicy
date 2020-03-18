package com.syntax.class09;

public class MorePatterns {
	public static void main(String[] args) {
		
		
		for (int i=1; i<=5; i++) {  //outer loop is rows
			for (int j=1; j<=9; j++) { //inner loop in columns
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("---54321---");
		for (int x=1; x<=5; x++) {  //outer loop is rows
			for (int y=5; y>=1; y--) { //inner loop in columns
				System.out.print(y);
			}
			System.out.println();
	}
		
		System.out.println("---55555, 4444, etc---");
		for (int x=5; x>=1; x--) {  //outer loop is rows
			for (int y=5; y>=1; y--) { //inner loop in columns
				System.out.print(x);
			}
			System.out.println();
	}

}
}
