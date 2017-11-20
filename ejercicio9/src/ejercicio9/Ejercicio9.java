package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		int contador = 0;
		int numero;
		System.out.println("introduce un numero");
		numero=teclado.nextInt();
			if (contador<numero){
				
				System.out.println("El numero es positivo");
			}
			else{
				System.out.println("El numero negativo");
			}

}}
