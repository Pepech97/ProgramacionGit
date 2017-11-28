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
		while(frase.length()>80){
			System.out.print("Introduce una frase de menos de 80 caracteres: ");
			frase=teclado.nextLine();
		}
			System.out.print("Introduce una palabra: ");
			palabra=teclado.nextLine();
		for(int i=0;i<frase.length();i++){
			numfrase=frase.indexOf(palabra);
			if(numfrase==-1);
				numfrase++;
		}
		System.out.println(numfrase);
	}
	}


