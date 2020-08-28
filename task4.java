package by.htp.les04.main;

public class task4 {
	public static void main(String[] args) {
		int n=6;
		int[][] mas=array(n);
		}
	public static int [][] array(int k) {
				
		int [][]mas= new int[k][k];
		for ( int i=0; i<mas.length;i++) {
			if ((i % 2 == 0) || (i == 0)) {
				for (int j=0; j<mas[i].length; j++) {
					mas[i][j]=j+1;
                    System.out.print(mas[i][j] + "  ");
                }
                System.out.println(); 
		    }
			else {
				int c=k;
			    for (int j=0; j<mas[i].length; j++) {
					 mas[i][j]=c;
					 System.out.print(mas[i][j] + "  ");
   					 c--;
			    } 
			    System.out.println();
			}
		}
		return (mas); 
	}
}
