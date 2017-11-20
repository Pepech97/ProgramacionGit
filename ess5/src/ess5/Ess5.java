package ess5;

import java.util.Scanner;

public class Ess5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		System.out.print("Introduce una frase: ");
		String frase=teclado.nextLine();
		String resultado="";
		resultado = frase.substring(1,frase.length()-1);
		System.out.println(frase.charAt(frase.length()-1)+resultado+frase.charAt(0));
	}
}
