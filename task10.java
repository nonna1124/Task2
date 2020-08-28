package by.htp.les04.main;
import java.util.Random;
public class task10 {
	

	public static void main(String[] args) {
        int n=4;
        int [][] mas;
		mas=matrix(n);
		diagonal(mas);
		}			
	public static int[][] matrix(int k) {
		int [][] mas = new int [k][k];
		Random rand= new Random();
		
		for ( int i=0 ; i<mas.length;i++) {
			 for (int j=0; j<mas[0].length; j++) {
               mas[i][j]=20-(rand.nextInt(40));
               System.out.printf("%5s",mas[i][j]);		 
			 }
		 System.out.println();
		 	
		}
		 System.out.println();
		 return mas;
	}		
 public static void diagonal(int [][]mas) {
	  for ( int i=0 ; i<mas.length;i++) {
		 for (int j=0; j<mas[0].length; j++) {
		 		 
			 if (i==j) {
				 if (mas[i][j]>0) {
					 System.out.printf("%5s",mas[i][j]);	
			     }
		     }
		 }
      }
 }
}