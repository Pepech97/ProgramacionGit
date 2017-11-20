package e24;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		System.out.println("Introduce un numero");
		int numero=teclado.nextInt();
		int a=2;
		int contador=0;
		
		while (numero<=0){
			System.out.println("Introduce un numero mayor que 0");
			numero=teclado.nextInt();
		}
		while (a!=numero){
			if ((numero%a)==0){
				contador++;
			}
			a++;
		}
		if(contador==0){
			System.out.println(numero+" es primo");
			
				
			}
		else{
			System.out.println(numero+" no es primo");
		}
		}
	}


