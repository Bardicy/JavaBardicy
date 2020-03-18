package practice;

public class Modulus {
	public static void main(String[] args) {
	    int num1 = 5;
	    int num2 = 4;
	    int num3 = 3;
	    
	    int num4 = 7; 
	    int num5 = 10;
	    int num6 = 5;
	    
	    //start coding here
	    int sum=num1+num2-num3; //why not in 2 steps? sum=num+num2 then div=sum-num3 Ask Asel
	    int mult=num4*num5/num6;
	    
	    int result1=sum;
	    int result2=mult;
	        
	    int mod=result2%result1; //calculate right to left?
	    
	    System.out.println(result2 + " modded by " + result1 + " is "
	    + mod);
	    
	    System.out.println("--------double to long example-----------");
	    
	    double x=500.444;
	    long y=(long)x;
	    
	    System.out.println(y);
	    
	    
	    System.out.println("--------double to int example-----------");
	    
	    double a=100.50;
	    int b=(int)a;
	    
	    System.out.println(b);
	    
	  }

}
