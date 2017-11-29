/*
 * Leer una frase filtrándola a que todos sus caracteres sean mayúsculas, 
 * una vez filtrada y dado un numero entre 1 y 10 haga un cifrado de la frase 
 * (denominado cifrado CESAR) del modo siguiente , si el numero por ejemplo es 3, 
 * transforme la frase de manera que cada carácter se transforme en 3 códigos ASCII mas es decir :
 * Frase inicial PROGRAMACION resultado SURJUDPDFLRQ.
 * Desarrollar los programas de codificar y descodificar mediante dos funciones.
 */
package es8;

import java.util.Scanner;

public class Es8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce una frase: ");
		String frase=teclado.nextLine();
		String resultado="";
		//Transformas la palabra en mayusculas
		for(int i=0;i<frase.length();i++){
			if(frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z'){
				resultado=resultado+String.valueOf(frase.charAt(i)).toUpperCase();
			}
			else{
				resultado=resultado+frase.charAt(i);
			}
		}
		System.out.println("Frase introducida: "+frase);
		//aqui pasas el resultado de las mayusculas a la frase primera
		frase=resultado;
		System.out.println("Frase en mayusculas: "+frase);
		System.out.print("Escribe un numero: ");
		//el numero que pones para sumar el numero ascii
		int numero=teclado.nextInt();
		char letra=0;
		String cifrado="";
		//Esto recorre la frase y le suma el numero que has escrito a todas las palabras de la frase,
		//sumandoles el numero ascii
		for(int i=0;i<frase.length();i++){
			letra = (char) (numero+frase.charAt(i));
			cifrado=cifrado+letra;
		}
		System.out.println("Frase cifrada: "+cifrado);
	}
	}	