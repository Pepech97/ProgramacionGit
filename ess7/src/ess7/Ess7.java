/*Escribe un programa que pida por teclado una palabra y muestre por pantalla cuál es
la vocal que más veces contiene la palabra junto al número de veces que la tiene.
*/
package ess7;

import java.util.Scanner;

public class Ess7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		String palabra=teclado.nextLine();
		int contadorvocal=0;
		int vocales[]=new int [5];//a,e,i,o,u
		String vocalesS="aeiou";
		//Coges la posicion de las vocalesS para usarla en el vector vocales[]
		for (int i = 0; i < palabra.length(); i++) {
			//uso vocales para saber si en el String palabra hay una vocal con el frase.charAt()
			if(vocalesS.contains(String.valueOf(palabra.charAt(i) ) ) ){
				vocales[vocalesS.indexOf(String.valueOf(palabra.charAt(i)) )]++;//Esto es rellenar el vector con la posicion dependiendo de la
				//vocal que es
			}
		}
		for (int i = 0; i < vocales.length; i++) {
			System.out.println(vocalesS.charAt(i)+": "+vocales[i]);
		}
	
	}
}
