package com.syntax.class11;

public class Task01 {
	public static void main(String[] args) {
		
		//Create an array of cars: american, german, korean, italian.
		//Then retrieve all values from that array using 2 different loops
		
		String[][] cars = {
				{"Ford", "Dodge", "Chrysler", "Chevy"},
				{"BMW", "Mercedes"},
				{"Hyundai"},
				{"Fiat", "Maserati"}
			};	
				for(int r=0; r<cars.length; r++) {
					for (int c=0; c<cars[r].length; c++) {
						System.out.println(cars[r][c]+" ");
					}
					System.out.println();
				}
				
		
	}

}
