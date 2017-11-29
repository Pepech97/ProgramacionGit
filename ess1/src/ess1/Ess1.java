/*
 * Escribir un programa que pida por teclado una cadena y una letra, de manera que
 * ponga en mayúsculas cada ocurrencia de la letra que haya en la cadena y lo
 * muestre por pantalla.
 */
package ess1;

import java.util.Scanner;

public class Ess1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		System.out.print("Introduce una frase: ");
		String frase=teclado.nextLine();
		String resultado="";
		System.out.print("Introduce la letra que quiere transformar a mayuscula: ");
		char letra	= teclado.nextLine().charAt(0);
		for(int i=0;i<frase.length();i++){
			//Esto hace que cuando la letra de la frase sea igual a la letra que hemos introducido
			//La cambie a mayuscula
			//
			//La variable resultado es para guardarlo en otra variable distinta
			if(frase.charAt(i) == letra){
				resultado=resultado+String.valueOf(frase.charAt(i)).toUpperCase();
				
			}
			//Esto es para meter todas las demas y que no quieras poner en mayusculas
			else{
				resultado=resultado+frase.charAt(i);
			}
		
		}
		System.out.println(resultado);
	}
}
