/*
 * 7.	Generar una matriz de 5x5 numérica entera entre -10 y 10, a continuación
 *  pedir dos números de fila, que se deben filtrar entre 1 y 5  e intercambiar ambas filas.
 *   Presentar las matrices antes y después del cambio.
 */
package eve7;

import java.util.Scanner;

public class Eve7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int matriz[][]=new int [5][5];
		int comodin[]=new int [5];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j]=(int)(Math.random()*20-10);
				System.out.printf("%2s ",matriz[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("Introduce los numeros de las filas que quieras cambiar: ");
		int numerofila1=teclado.nextInt()-1;
		int numerofila2=teclado.nextInt()-1;
		//Este bucle es para que si introduces numero de filas incorrecto te vuelva a pedir
		while(numerofila1>6 || numerofila1<0 || numerofila2>6 || numerofila2<0){
			System.out.println("Numero de filas incorrecto, introduce otro: ");
			numerofila1=teclado.nextInt()-1;
			numerofila2=teclado.nextInt()-1;
		}
		//Esto es para intercambiar las filas, con el comodin para no perder la fila
		for (int j = 0; j < matriz.length; j++) {
			comodin[j]=matriz[numerofila2][j];
			matriz[numerofila2][j]=matriz[numerofila1][j];
			matriz[numerofila1][j]=comodin[j];
		}
		//aqui se imprime la fila
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.printf("%2s ",matriz[i][j]);
			}
			System.out.println();
		}

	}
}
