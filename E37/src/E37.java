import java.util.Random;

public class E37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int matriz[][] = new int [4][5];
		int fila, col;
		for (fila=0;fila<4;fila++){
			for(col=0;col<5;col++){
				matriz[fila][col]=rnd.nextInt(100)+1;
				System.out.print(matriz[fila][col]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for (col=0;col<5;col++){
			for(fila=0;fila<4;fila++){
				
				System.out.print(matriz[fila][col]+" ");
			}
			System.out.println();
		}
	}

}
