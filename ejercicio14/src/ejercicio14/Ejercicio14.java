package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		int numero=0;
		int contador=1;
		int mayor=0;
		int menor=0;

		while(contador<5){
			
				
			System.out.println("introduce un numero");
			numero=teclado.nextInt();
			if(contador==1){
				mayor=numero;
				menor=numero;
			}
			if (numero>mayor){
				mayor=numero;
			}
			if (numero<menor){
				menor=numero;
			}		
			
			contador ++;

		}

		System.out.println(mayor);
		System.out.println(menor);
	}

}
