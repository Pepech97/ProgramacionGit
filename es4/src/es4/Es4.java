/*
 * Leer una cadena de hasta 80 caracteres y 
 * pasarla en función de una variable de opción
 *  a mayúsculas ó a minúsculas e imprimir la cadena resultante
 */
package es4;

import java.util.Scanner;

public class Es4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner teclado = new Scanner(System.in);
			System.out.println("introduzca una frase");
			String frase=teclado.nextLine();
			String resultado="";
			while(frase.length()>80){
				System.out.println("Introduce una frase de menos de 80 caracteres");
				frase=teclado.nextLine();
			}
			//Esto cambia las mayusculas por las minusculas, depende de la letra que lea entra en un
			//if o en otro
				for(int i=0;i<frase.length();i++){
					if(frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z'){
						
						resultado=resultado+String.valueOf(frase.charAt(i)).toLowerCase();
					}
					if(frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z'){
						
						resultado=resultado+String.valueOf(frase.charAt(i)).toUpperCase();
					
					}
			//Esto es para imprimir los espacios, que sino no se imprimian
					if(frase.charAt(i) == ' '){
						resultado=resultado+" ";
						
					}
				}
				System.out.println(resultado);
	}
	
	}