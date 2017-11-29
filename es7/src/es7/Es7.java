/*
 * Leer una frase por teclado y escribir a continuación 
 * cuantas mayúsculas, minúsculas y números contiene.
 */
package es7;

import java.util.Scanner;

public class Es7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int Mayus=0;
		int Minus=0;
		int Numeros=0;
		int activador=0;
		String CMayus="";
		String CMinus="";
		String CNumeros="";
		System.out.println("Escribe una frase");
		String frase=teclado.nextLine();
		for(int i=0;i<frase.length();i++){
			//aqui mira las mayusculas
			if(frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z'){
				CMayus=CMayus+frase.charAt(i);
				Mayus++;
				
			}
			//aqui mira las minusculas
			if(frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z'){
				CMinus=CMinus+frase.charAt(i);
				Minus++;
				
			}	
			//aqui mira los numeros
			if(frase.charAt(i) >='0' && frase.charAt(i) <= '9'){
				CNumeros=CNumeros+frase.charAt(i);
				Numeros++;
			}
		}
		System.out.println("Frase introducida: "+frase);
		System.out.println("Hay "+Mayus+" Mayusculas en la frase: "+CMayus);
		System.out.println("Hay "+Minus+" Minusculas en la frase: "+CMinus);
		System.out.println("Hay "+Numeros+" Numeros en la frase: "+CNumeros);
	}
	}
