package ess1;

import java.util.Scanner;

public class Ess1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		System.out.print("Introduce una frase: ");
		String frase=teclado.nextLine();
		String resultado="";
		System.out.print("Introduce la letra que quiere transformar a mayuscula: ");
		char letra	= teclado.nextLine().charAt(0);
		for(int i=0;i<frase.length();i++){
			
			if(frase.charAt(i) == letra){
				resultado=resultado+String.valueOf(frase.charAt(i)).toUpperCase();
				
			}
			else{
				resultado=resultado+frase.charAt(i);
			}
		
		}
		System.out.println(resultado);
	}
}
