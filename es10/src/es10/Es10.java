package es10;

import java.util.Scanner;

public class Es10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		System.out.print("Introduce una frase: ");
		String frase=teclado.nextLine();
		String repetido="";
		String resultado="";
		while(frase.length()>60){
			System.out.println("Introduce una frase de menos de 60 caracteres");
			frase=teclado.nextLine();
		}
		for(int i=0;i<frase.length();i++){
			if(frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z'){
				resultado=resultado+String.valueOf(frase.charAt(i)).toUpperCase();
			}
			else{
				resultado=resultado+frase.charAt(i);
				
			}
		}
		frase=resultado;
		for(int letra=0;letra<frase.length();letra++){
			for(int i=1;i<frase.length();i++){
				if(frase.charAt(letra)==frase.indexOf(frase.charAt(letra)-1)){
					
				}
			}
		}
			
		System.out.println(repetido);
}
}