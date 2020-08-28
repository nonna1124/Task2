package by.htp.les04.main;

public class task5 {

	public static void main(String[] args) {
		int n=10;
		int[][] mas=matrix(n);
		}			
	public static int[][] matrix(int k) {
		int [][] mas = new int [k][k];
		for ( int i=0; i<mas.length;i++) {
			 for (int j=0; j<mas[i].length; j++) {
				 if (k-1-i==j) {
					 mas[i][j]=i+1;
				 }
				 System.out.print(mas[i][j] + "  ");		 
			 }
			 System.out.println();
		}
		return (mas);
	}
}
