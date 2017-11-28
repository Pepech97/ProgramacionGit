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
		for (int i = 0; i < frase.length()-1; i++) {
		resultado=frase.substring(0,frase.length()-1);
		System.out.println((frase.charAt(frase.length()-1))+resultado);
		frase=(frase.charAt(frase.length()-1))+resultado;
		}
	}
}
