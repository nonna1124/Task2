package by.htp.les04.main;
public class task12 {
    
	public static void main(String[] args) {
		int n=(int)( Math.random()*10);
		int m=(int) (Math.random()*10);
		if (m>=n) {
		  int [][] array= new int [m][n];
     	   int[][] massiv= array( m,n);
   	    }else {
   	    	System.out.println("ћатрицу невозможно заполнить единицами!!");
   	    }
		
	}
	public static int[][] array(int a, int b){
		int [][] mas= new int [a][b];
		for (int i=0; i< mas.length;i++) {
			for (int j=0; j<mas[0].length;j++) {
				if(i>=j) {
				   mas[i][j]=0;
				}else {
					mas[i][j]=1;
				}
			System.out.print(mas[i][j]+"   ");
			}
			System.out.println();
		}
		return (mas);
	}

}
