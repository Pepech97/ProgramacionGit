package es4;

import java.util.Scanner;

public class Es4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner teclado = new Scanner(System.in);
			System.out.println("introduzca una frase");
			String frase=teclado.nextLine();
			String resultado="";
			while(frase.length()>80){
				System.out.println("Introduce una frase de menos de 80 caracteres");
				frase=teclado.nextLine();
			}
				for(int i=0;i<frase.length();i++){
					if(frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z'){
						
						resultado=resultado+String.valueOf(frase.charAt(i)).toLowerCase();
					}
					if(frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z'){
						
						resultado=resultado+String.valueOf(frase.charAt(i)).toUpperCase();
					
					}
					
					if(frase.charAt(i) == ' '){
						resultado=resultado+" ";
						
					}
				}
				System.out.println(resultado);
	}
	
	}