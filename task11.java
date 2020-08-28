package by.htp.les04.main;
import java.util.Random;
public class task11 {

	public static void main(String[] args) {
		int [][] array= new int [10][20];
	
		 matrix(array);
	}
	public static int [][] matrix(int [][]array){
		
		Random rand=new Random();
		for (int i=0; i<array.length; i++) {
			for (int j=0; j< array[0].length; j++) {
				array[i][j] =rand.nextInt(15);
				 System.out.printf("%5s",array[i][j]);
			}
			System.out.println();
		}	
		System.out.println();
		
			for (int i=0; i<array.length; i++) {
				int n=0;	
				for (int j=0; j< array[0].length; j++) {
					if (array [i][j]==5) {
					    n++;}
				    }
		 			if (n>=3) {
						System.out.print(i+"  ");
					}
				}	
			return array;
			}
	
		}
	   

		

