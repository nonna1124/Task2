package by.htp.les04.main;

public class task9 {

	public static void main(String[] args) {
		int n=4;
		int[]mas=new int[n];
		int [][] massiv= new int [n][n];
		
		for (int i=0; i<mas.length; i++) {
			mas[i]=i+2;
			System.out.print(mas[i]+"  ");
		}
		System.out.println();
		System.out.println();
		
		for ( int i=0 ; i<massiv.length;i++) {
			 for (int j=0; j<massiv[0].length; j++) {
				 massiv[i][j]= (int)Math.pow((mas[0]+j),i+1);
				 System.out.printf("%8s",massiv[i][j]);
		     }
		System.out.println();	
		}
	}

}
 