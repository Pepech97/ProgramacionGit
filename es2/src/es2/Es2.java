package es2;

import java.util.Scanner;

public class Es2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		for(int i=0;i<frase.length();i++){
			if( frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z'){
				contadormayus++;
			}
			if(frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z'){
				contadorminus++;
			}
		}
		System.out.println(contadormayus);
		System.out.println(contadorminus);
	}

}
