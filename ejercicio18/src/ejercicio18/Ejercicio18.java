package ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String frase = teclado.nextLine();
		char letra	= teclado.nextLine().charAt(0);
		int contador=0; 
		for (int i=0; i<frase.length(); i++ ){
			if( frase.charAt(i)==letra ){
				contador++;
			}
		}
		System.out.println("hay "+ contador+" "+letra+" en la frase");	
	}

}
