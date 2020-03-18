package javaHomeworkTasks;

import java.util.Scanner;

public class QuizGrades {
	public static void main(String[] args) {
		
		/*Write a program that will read three inputs of scores 
		  (quiz, mid term, and final scores) and determine the grade based 
		    on the following rules: 
			if the average score >=90 → grade=A
			if the average score >= 70 and <90 → grade=B
			if the average score>=50 and <70 → grade=C
			if the average score<50 → grade=F  */
		
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("What is your Quiz Score?");
		int quiz=input.nextInt();
		
		System.out.println("What is your midterm Score?");
		int midterm=input.nextInt();
		
		System.out.println("What is your final score?");
		int finalSc=input.nextInt();
		
		int average = (quiz+midterm+finalSc)/3;
		
		if(average>=90) {
			System.out.println("You average is " + average + " A");
		}else if(average>=70 && average<90) {
			System.out.println("You average is " + average + " B");
		}else if (average>=50 && average<70) {
			System.out.println("You average is " + average + " C");
		}else if (average<50) {
			System.out.println("You average is " + average + " F");
		}else {
			System.out.println("Invalid average");
		}
		
		
		
	}

}
