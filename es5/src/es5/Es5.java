/*
 * Leer una frase por teclado (máximo 80 car) y 
 * construir otras dos cadenas de forma que una contenga
 * los caracteres en posición par y la otra los caracteres en posición impar.
 */
package es5;

import java.util.Scanner;

public class Es5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String par="";
		String impar="";
		System.out.println("Introduce una frase: ");
		String frase=teclado.nextLine();
		while(frase.length()>80){
			System.out.println("Introduce una frase de menos de 80 caracteres");
			frase=teclado.nextLine();
		}
		//Este for recorre la frase y mira si es par, y saldra como impar porque empieza en 0 
		//y el 1 es la segunda posicion que deberia ser par
		for(int i=0;i<frase.length();i++){
			if(i%2==0){
				impar=impar+frase.charAt(i);
			}
			else{
				par=par+frase.charAt(i);
			}
		}
		System.out.println("Frase introducida: "+frase);
		System.out.println("Caracteres pares: "+par);
		System.out.println("Caracteres impares: "+impar);
	}

}
