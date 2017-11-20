package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		int numero;
		System.out.println("introduce un numero");
		numero=teclado.nextInt();
			if ((numero % 2)==0) {
				
				System.out.println("El numero es par");
			}
			else{
				System.out.println("El numero es impar");
	}

}}
