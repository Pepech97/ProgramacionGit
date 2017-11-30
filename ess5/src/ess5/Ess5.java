package ess5;

import java.util.Scanner;

public class Ess5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		System.out.print("Introduce una frase: ");
		String frase=teclado.nextLine();
		int contador=teclado.nextInt();
		if(contador==1){
		String resultado="";
		//Aqui coges resultado y guardas todas las letras menos el principio y el final
		//y luego lo imprimes poniendo esas letras a parte.
		resultado = frase.substring(1,frase.length()-1);
		System.out.println(frase.charAt(frase.length()-1)+resultado+frase.charAt(0));
		}
		if (contador==0){
			frase.replaceFirst(, replacement)
		}
	}
}
