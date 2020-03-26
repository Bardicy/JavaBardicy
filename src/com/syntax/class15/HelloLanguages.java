package com.syntax.class15;

public class HelloLanguages {
	
	void sayHello(String country) {
		switch(country.toLowerCase()) {
		case  "russia":
			System.out.println("Privet");
			break;
		case "tajikistan":
			System.out.println("Salom");
			break;
		case "mexico":
			System.out.println("hola");
			break;
			default:
				System.out.println("Wrong language");
		}
	}
	
	public static void main(String[] args) {
		
		HelloLanguages Hello =  new HelloLanguages();
		Hello.sayHello("Russia");
		
	}

}
