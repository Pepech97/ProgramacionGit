/*Escribe un programa que pida por teclado una frase y cambie cada ocurrencia de la
* palabra “si” por la palabra “no”. Después lo muestra por pantalla.
*/
package ess6;

import java.util.Scanner;

public class Ess7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		String frase=teclado.nextLine();
		String palabra="no";
		String resultado="";
		for (int i = 0; i < frase.length(); i++) {
			//Entra si el caracterer que mira es s y si el siguiente es i
			if(frase.charAt(i)=='s' && frase.charAt(i+1)=='i'){
					resultado=resultado + palabra;
					i++;
			}
			//si no es pues sigue rellenandose igual normal
			else{
				resultado=resultado+frase.charAt(i);
			}
			
			
		}
		System.out.println(resultado);
	}

}
