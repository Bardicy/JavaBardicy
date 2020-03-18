package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.println(i + " " + j);
			}
		}
		System.out.println("---------------------");
		// using nested loop, print from 10 to 99

		for (int i = 1; i <= 9; i++) {
			for (int y = 0; y <= 9; y++) {
				System.out.println(i + "" + y);
			}
		}

		System.out.println("--------------------");
		// using nested loop, 24 hour clock

		for (int h = 0; h <= 23; h++) {
			for (int m = 0; m <= 59; m++) {
				if (m < 10) {
					System.out.println(h + ":0" + m);
				} else {
					System.out.println(h + ":" + m);
				}
			}
		}

		System.out.println("-----------------------");

		for (int a = 0; a <= 9; a++) {
			for (int b = 0; b <= 9; b++) {
				for (int c = 0; c <= 9; c++) {
					for (int d = 0; d <= 9; d++) {
						System.out.println(a + "" + b + "" + c + "" + d);
					}
				}
			}
		}

	}

}
