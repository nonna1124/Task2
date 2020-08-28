package by.htp.les04.main;

import java.util.Random;

public class task2 {
	public static void main(String[] args) {
		
		int [][] arr= new int[4][6];
		Random rand=new Random();
		for (int i=0; i<arr.length; i++) {
			  for (int j=0; j<arr[i].length;j++){
				arr[i][j]=rand.nextInt(20);
				  System.out.print(arr[i][j]+"    ") ;
			  }
				  System.out.println();
		}			  
         int k= 2;
         int p=1;
         
        System.out.println("Строка k= "+k);
        
         for (int i=0; i<arr.length; i++) {
	     for (int j=0; j<arr[k].length;j++){
	    	 
	    
	     System.out.print( arr[k][j]+" "); 
	     
            }
         System.out.println();break;
	    
	       } 
	
	  System.out.println("Cтолбец р ="+p); 
	
	  for (int i=0; i<arr.length; i++) {
      for (int j=0; j<arr[i].length;j++) { 
	     
         	System.out.print( arr[i][p]+" ");
	
		     System.out.println();	break;
      }   } 
	 
	}
}