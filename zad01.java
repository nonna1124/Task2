package by.htp.les04.main;

public class zad01 {
  public static void main(String[] args) {
	 
	  int[][]mas=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
	   
	  
	  for (int i=0; i<mas.length; i++) {
		  for (int j=0; j<mas[i].length;j++){
			
			  System.out.print(mas[i][j]+" ") ;
		  }
			  System.out.println();
	  }	  
	  for (int i=0; i<mas.length; i++) {
		for (int j=0; j<mas[i].length;j++){
			  if (i==j) {
			  System.out.print(mas[i][j]) ; 
		  }
	  
	     }
	  }
  }
  

}
	  
