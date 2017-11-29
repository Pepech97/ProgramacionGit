/*
 * Escribe un programa que pida por teclado una cadena y una letra, de manera que
	elimine las 3 primeras ocurrencias de la letra que encuentre en la cadena y lo muestre
	por pantalla.
 */
package ess2;

import java.util.Scanner;

public class Ess2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		String frase=teclado.nextLine();
		int contador=3;
		String resultado="";
		char letra=teclado.nextLine().charAt(0);
		//Recorres la frase
		for(int i=0;i<frase.length();i++){
			//Como no se pueden restar strings, creas otro para meter lo que quieras
			//sin meter lo que no quieras haciendo una condicion para que no la escriba
			if(frase.charAt(i)==letra && contador>0){
				contador--;
			}
			else{
				resultado=resultado+frase.charAt(i);
			}
		}
		System.out.println(resultado);
	}

}
