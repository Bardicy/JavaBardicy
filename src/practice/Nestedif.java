package practice;

public class Nestedif {
	public static void main(String[] args) {
		
		int kids=1;
		
		if (kids >= 4) { 
			System.out.println("Slow down, that's enough");
		}else {
			System.out.println("Keep going");
			if (kids < 2) {
				System.out.println("That's not enough");
				
				System.out.println();
				System.out.println("------------class example-----------");//below
			
			}
		}
		
		boolean classToday=true;
		boolean flag=true;
		
		if (flag) {
			System.out.println("Hello");
			
			if (classToday) {
				System.out.println("Hello Friends");
			}else {
				System.out.println("Hello family");
			}
		}else {
			System.out.println("Bye");
		}
		
		System.out.println("I am outside of if condition");
		
		System.out.println();
		System.out.println("------------class example2-----------");//below
		
		//declare date and a day
		//if day is Friday --> if date is 13 --> watch a scary movie
		//                     if date is not 13 we will watch a comedy
		
		boolean isFriday= false;
		int date=13;
		
		if(isFriday) {
			System.out.println("Today is Friday, I am going to the movies");
			if(date==13) {
				System.out.println("and I'll watch a scary movie!");
			}else {
				System.out.println("and I'll watch a comedy");
			}
		}else {
			System.out.println("Today is not Friday, I am staying home");
		}
		
		System.out.println();
		System.out.println("------------class example3-----------");//below
		
		//check if patient has any allergies
		//if no allergies --> you are healthy
		//otherwise check if patient has:
		        //orange allergy --> do not eat oranges
		        //apple allergy --> do not eat apples
		        //kiwi allergy --> do not eat kiwis
		
		boolean allergy=true;
		boolean appleAllergy=true;
		boolean orangeAllergy=true;
		boolean kiwiAllergy=false;
		
		if(allergy) {
			System.out.println("Please indicate allergy below");
			
			if(orangeAllergy) {
				System.out.println("You are allergic to Oranges, do not eat oranges");
				if(appleAllergy) {
					System.out.println("You are allergic to Apples, do not eat Apples");
					if(kiwiAllergy) {
						System.out.println("You are allergic to Kiwis, do not eat Kiwis");
					}
				}
			}
		}else {
			System.out.println("You are healthy");
		}
		}
		
	

}
