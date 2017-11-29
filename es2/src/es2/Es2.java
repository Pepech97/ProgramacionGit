/*Dada una frase de no más de 80 caracteres hacer 
 * un programa que busque cuántas mayúsculas
 *  y minúsculas tiene y lo imprima
 */
package es2;

import java.util.Scanner;

public class Es2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Iniciamos teclado
		Scanner teclado = new Scanner(System.in);
		String frase;
		int contadormayus=0;
		int contadorminus=0;
		System.out.println("Escribe una frase");
		frase=teclado.nextLine();
		while(frase.length()>80){
			System.out.println("Introduce una frase de menos de 80 caracteres");
			frase=teclado.nextLine();
		}
		//Entra en este for para recorrer la frase y mirar cada letra
		for(int i=0;i<frase.length();i++){
			//Aqui entra si es mayuscula, porque pongo que va de la A a la Z mayuscula y cuenta con el contador
			if( frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z'){
				contadormayus++;
			}
			//Aqui entra si es minuscula, porque pongo que va de la a a la z minuscula y cuenta con el contador
			if(frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z'){
				contadorminus++;
			}
		}
		System.out.println(contadormayus);
		System.out.println(contadorminus);
	}

}
