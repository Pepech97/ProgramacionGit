package e27;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero entre el 0 y el 10");
		int numero=teclado.nextInt();
		int tabla=0;
		int resultado=0;
		while (numero<0 || numero>10){
			System.out.println(numero+ " es incorrecto, vuelve a introducir numero");
			numero=teclado.nextInt();
		}
		while (numero>0 && numero<10){
			if(tabla<=10){
			resultado=tabla*numero;
			tabla++;
			System.out.println(resultado);
			}
		}
}
}