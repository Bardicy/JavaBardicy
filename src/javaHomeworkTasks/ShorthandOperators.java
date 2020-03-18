package javaHomeworkTasks;

public class ShorthandOperators {
	
	public static void main(String[] args) {
		
		/*1. Declare variable and increase by 100 using shorthand operator
		  2. Declare variable and decrease by 67 using shorthand operator
		  3. Declare variable cakePiece=11 and divide cakePiece between 4 
		     people using shorthand operator 

		     each person should get an equal piece of cake

          4. Declare variable cakePiece=25 and divide cakePiece between 7 people . 
             Using shorthand operator find out how many pieces of cake left after it 
             was distributed equally among 7 people
		 */
		
		int num = 300;
		num+=100;
		System.out.println(num); 
		
		int num2=167;
		num2-=67;
		System.out.println(num2);
		
		double cakePiece = 11;
		cakePiece/=4;
		System.out.println(cakePiece);
		
		cakePiece = 25;
		cakePiece/=7;
		System.out.println(cakePiece);
		
		cakePiece%=3.5714285714285716; //is this correct?
		System.out.println(cakePiece);
		
 
		
	}

}
