package ess4;

import java.util.Scanner;

public class Ess4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		String frase=teclado.nextLine();
		String resultado="";
		String frase2=teclado.nextLine();
		String resultado2="";
		for(int i=0;i<frase.length();i++){
			if(frase.charAt(i)==' '){
				resultado=frase.substring(i+1);
			}
		}
		for(int j=0;j<frase2.length();j++){
			if(frase2.charAt(j)==' '){
				resultado2=frase2.substring(j+1);
				}
			}
		for(int l=0:l<frase1.length();l++){
			
		}
		System.out.println(resultado);
		System.out.println(resultado2);
	}
}
