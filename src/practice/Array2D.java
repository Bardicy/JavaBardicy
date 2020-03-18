package practice;

public class Array2D {
	public static void main(String[] args) {
		double[][] a = {
			{1.4,2.0,3.3,2},
			{4,1.5,6.1,1},
			{1.2,3.1,4,1.6}
		};
		//prints array
		
		for (int r=0; r<a.length; r++) {
			for (int c=0; c<a[r].length; c++) {
			
			System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
  }
}


