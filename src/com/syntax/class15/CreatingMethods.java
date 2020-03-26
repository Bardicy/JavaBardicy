package com.syntax.class15;

public class CreatingMethods {
	
	//we want to create a method that will accept marks(90,80)
	//based on the marks it will return grade (A, B, C)
	//if grade >90 --> A, if 90<grade>80 --> B, if 80<grade>70 --> C
	
	void gradeIs(int a) {
		if (a>90) {
			System.out.println("A");
		}else if(a<=90 && a>=80) {
			System.out.println("B");
		}else if(a<80 && a>=70) {
			System.out.println("C");
		}else if (a<70 && a>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
	public static void main(String[] args) {
		
		CreatingMethods grade = new CreatingMethods();
		grade.gradeIs(70);
	}

}
