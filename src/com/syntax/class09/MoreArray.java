package com.syntax.class09;

public class MoreArray {
	public static void main(String[] args) {
		
		//arrays are fixed in size
		String[] students=new String[3];
		students[0]="Mohamad";
		students[1]="Reem";
		students[2]="Mahmoud";
		//students[3]="Omar";
		
		System.out.println(students[2]); //if i print [3] error below
		
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
		//at com.syntax.class09.MoreArray.main(MoreArray.java:11)
		
		String[] inClassStudents=new String[5];
		inClassStudents [1]="Hichem";
		inClassStudents [2]="Tetteh";
		inClassStudents [3]="Hichem";
		inClassStudents [4]="Tetteh";
		//inClassStudents [5]="Bardicy"; --> will get ArrayIndexOutOfBoundException
		System.out.println(inClassStudents[0]);
	}

}
