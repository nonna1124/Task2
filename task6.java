package by.htp.les04.main;

public class task6 {

	public static void main(String[] args) {
		int n=10;
		int[][]mas=matrix(n);
		}
	public static int [][] matrix(int k) {
		int [][] mas = new int [k][k];
		for ( int i=0 ; i<mas.length;i++) {
			 for (int j=0; j<mas[i].length; j++) {
				 if (i==0 || i==k-1) {
					 mas[i][j]=1;
				 }
				 else if (j==0 || j==k-1) {
			 		 mas[i][j]=1;
				 }else {
					 mas[i][j]=0;
				 }						 
				 System.out.print(mas[i][j] + "  ");		 
			 }
			 System.out.println();	
		}
	    return(mas);
    }
} 