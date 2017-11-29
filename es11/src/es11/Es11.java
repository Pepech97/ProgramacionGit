/*Hacer un programa para que pida una palabra de no más de 20 caracteres 
 * y efectúe todas las rotaciones posibles de dicha palabra de forma que
 *  el último carácter pase al primero y los demás corran un espacio
 */
package es11;

import java.util.Scanner;

public class Es11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		System.out.print("Introduce una frase: ");
		String frase=teclado.nextLine();
		String resultado="";
		System.out.println(frase);
		//Aqui recorre toda la frase
		for (int i = 0; i < frase.length()-1; i++) {
			//Aqui quitas la ultima letra a frase y la guardas en otro String
			resultado=frase.substring(0,frase.length()-1);
			//Aqui lo imprimes con esa ultima letra al principio
			System.out.println((frase.charAt(frase.length()-1))+resultado);
			//Aqui guardas lo que has impreso en la frase para que la proxima vez que lo haga
			//lo haga con la frase ya cambiada
			frase=(frase.charAt(frase.length()-1))+resultado;
		}
	}
}
