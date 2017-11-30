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
		char vocales[]={'a','e','i','o','u'};
		int vocrepes=0;
		for (int i = 0; i < palabra.length(); i++) {
			for (int j = 0; j < vocales.length; j++) {
				if(palabra.charAt(i)==vocales[j]){
					vocrepes++;
				}
			}
			System.out.println("La vocal "+palabra.charAt(i)+" esta : "+vocrepes+" vez en la palabra");
			vocrepes=0;
		}
	}

}
