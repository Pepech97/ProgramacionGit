package e38;

import java.util.Scanner;

public class E38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner teclado = new Scanner(System.in);
			int x=teclado.nextInt();
			int y=teclado.nextInt();
			int numero[][] = new int [x][y];
			
			for(int i=0; i>1 || i<5; i++){
				for(int j=0; j>1 || j<6;j++){
					numero[i][j]=teclado.nextInt();
					System.out.printf("%3s "+numero[i][j]);
				}
			}
		
					
				
				
			
	}

}
