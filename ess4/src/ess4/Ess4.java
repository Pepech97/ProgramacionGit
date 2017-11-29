/*
 * Escribe un programa que pida por teclado dos nombres con su apellido y que intercambie los apellidos
 */
package ess4;

import java.util.Scanner;

public class Ess4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		String frase=teclado.nextLine();
		String apellido="";
		int activador=0;
		String nombre="";
		String nombre2="";
		String frase2=teclado.nextLine();
		String apellido2="";
		//en este for guardamos lo que queremos en las variables que hemos puesto
		//por ejemplo en apellido guardamos lo que hay despues del espacio, que sera 
		//el apellido y si no es el apellido sera el nombre, y por eso el else
		//i=frase.length(); esto es porque primero va a escribir el nombre y el apellido va a ser 
		//escrito de una vez, sin pasar mas veces por el for, asi que cuando lo escriba ya no tendra
		//que entrar mas al for
		for(int i=0;i<frase.length();i++){
			if(frase.charAt(i)==' '){
				apellido=frase.substring(i+1);
				i=frase.length();
			}
			else{
				nombre=nombre+frase.charAt(i);
			}
		}
		
		for(int j=0;j<frase2.length();j++){
			if(frase2.charAt(j)==' '){
				apellido2=frase2.substring(j+1);
				j=frase.length();
				}
			else{
				nombre2=nombre2+frase2.charAt(j);
			}
			}
		System.out.println(nombre+" "+apellido2);
		System.out.println(nombre2+" "+apellido);
	}
}