package com.syntax.class09;

public class PatternTask {
	public static void main(String[] args) {
		
		for (int r=5; r>=1; r--) {
			for (int c=1; c<=r; c++) {
				System.out.print(r);
			}
			System.out.println();
		}
		System.out.println("****TASK PART 2******");
		
		//print this pattern
		//		*
		//		**
		//		***
		//		****
		//		*****
		//		****
		//		***
		//		**
		//		*
		for (int x=1; x<=5; x++) { //rows
			for (int y=1; y<=x; y++) { //columns
				
				System.out.print("*");
				
			}
			System.out.println();
	}
		for (int i=4; i>=1; i--) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

}
}
