package com.syntax.class11;

public class Task02 {
	public static void main(String[] args) {
		
		//Create an array of countries: North America countries,
		//South American Countries, European Countries, Asian countries, 
		//African countries. 
		//Then print all values from that array using 2 different loops 
		//and calculate how many total countries been stored.
		
		String[][] countries = {
				{"USA", "Mexico", "Canada"},
				{"Brazil", "Argentina", "Chile", "Uruguay"},
				{"Italy", "Spain", "England"},
				{"China", "Japan", "N Korea"},
				{"Egypt", "Tunisia", "Morrocco", "Sudan"}
		};
		int total=0;
		for(int r=0; r<countries.length; r++) {
			for (int c=0; c<countries[r].length; c++) {
				System.out.println(countries[r][c]+ " ");
				total++;
			}
			System.out.println();
		}
		System.out.println("Total = "+ total);
		System.out.println();
		System.out.println("----Using Advanced For Loop------");
		int count=0;
		for (String[] world : countries) {
			for (String c : world) {
				System.out.println(c + " ");
				count++;
			}
			System.out.println();
		}
		System.out.println("Total=" + count);
	}

}
