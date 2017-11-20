package ejercicio32;

import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un numero");
		int numero = teclado.nextInt();
		int contador=0;
		int factorial=1;
		int tabla=0;
		int resultado=0;
		int numerog=numero;
		while (contador==0){
			if ((numero%2)==0){
				System.out.println(numero+" es un numero par");
			}
			else{
				System.out.println("este numero es impar");
			}
			
			while(numero>0){
				factorial= numero*factorial;
				numero=numero-1;
				
			}
			numero=numerog;
			System.out.println("el factorial de "+numero+" es "+factorial);
			while (tabla<=10){
				resultado=tabla*numero;
				tabla++;
				System.out.println(resultado);
			}
		contador++;
		}
		System.out.println();
	}

}
