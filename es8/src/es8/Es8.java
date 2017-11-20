package es8;

import java.util.Scanner;

public class Es8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce una frase: ");
		String frase=teclado.nextLine();
		String resultado="";
		for(int i=0;i<frase.length();i++){
			if(frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z'){
				resultado=resultado+String.valueOf(frase.charAt(i)).toUpperCase();
			}
			else{
				resultado=resultado+frase.charAt(i);
			}
		}
		System.out.println("Frase introducida: "+frase);
		frase=resultado;
		System.out.println("Frase filtrada: "+frase);
		System.out.print("Escribe un numero: ");
		int numero=teclado.nextInt();
		char letra=0;
		String cifrado="";
		for(int i=0;i<frase.length();i++){
			letra = (char) (numero+frase.charAt(i));
			cifrado=cifrado+letra;
		}
		System.out.println("Frase cifrada: "+cifrado);
	
	}
	
		
		
		
		
	}
		
