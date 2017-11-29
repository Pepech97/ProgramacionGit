/*
 * Programa que lea una frase y una palabra y que nos diga la
 *  posición de dicha palabra en la frase y si no la encuentra devuelva un cero.
 */
package es3;

import java.util.Scanner;

public class Es3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String frase="";
		String palabra="";
		int numfrase=0;
		System.out.print("Introduce una frase: ");
		frase=teclado.nextLine();
		//Este bucle es para que no se pueda introducir una frase de mas de 80 caracteres
		while(frase.length()>80){
			System.out.print("Introduce una frase de menos de 80 caracteres: ");
			frase=teclado.nextLine();
		}
			System.out.print("Introduce una palabra: ");
			palabra=teclado.nextLine();
		//este for es para recorrer la frase entera letra por letra
		for(int i=0;i<frase.length();i++){
			//esto iguala la posicion de la palabra que he introducido por teclado a la variable numfrase
			//que es la que uso para guardar la posicion, que eso es lo que hace el IndexOf
			//devuelve la posicion de la palabra cuando se encuentra y si no te devuelve -1
			numfrase=frase.indexOf(palabra);
			//Este if vale para sumarle 1 al valor que te devuelve el indexof para que cuando 
			//no haya ninguno sea 0
			if(numfrase==-1){
				numfrase++;
		}
		System.out.println(numfrase);
	}
	}
}

