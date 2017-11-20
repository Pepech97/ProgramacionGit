package ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		int factorial=1;
		System.out.println("Introduce un numero");
		int numero=teclado.nextInt();
		while(numero>0){
			factorial= numero*factorial;
			numero=numero-1;
		}
		System.out.println("el factorial del numero introducido es "+factorial);
		teclado.close();
	}
	
	

}
