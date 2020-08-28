package by.htp.les04.main;

public class task7 {
	public static void main(String[] args) {
		
		int n=10;
		
		int [][] mas=matrix(n);
		}
			
	public static int [][] matrix(int k) {
		
		int [][] mas = new int [k][k];
	  	
		for ( int i=0 ; i<mas.length;i++) {
			 for (int j=0; j<mas[i].length; j++) {
        
				if (j<=k-i-1) {
					 mas[i][j]=i+1;
					  
				}
		 		else {
					mas[i][j]=0;
                }
				 System.out.print(mas[i][j] + "  ");		 
			 }
			 
		 System.out.println();	
		}
		return(mas);
	}
}
			 
		
