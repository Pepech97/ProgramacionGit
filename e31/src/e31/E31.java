package e31;

import java.util.Scanner;

public class E31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		System.out.println("introducir numeros");
		int numero1=teclado.nextInt();
		int numero2=teclado.nextInt();
		int contador=0;
		float resultado=0;
		String operacion;
		System.out.println("Introduce operacion");
		while(contador==0){
			
			operacion=teclado.nextLine();
			if(operacion.equals("suma")){
				resultado=numero1+numero2;
				System.out.println(resultado);
				contador++;
			}
			if(operacion.equals("resta")){
				resultado=numero1-numero2;
				System.out.println(resultado);
				contador++;
			}
			if(operacion.equals("multiplicacion")){
				resultado=numero1*numero2;
				System.out.println(resultado);
				contador++;
			}
			if(operacion.equals("division")){
				resultado=numero1/numero2;
				System.out.println(resultado);
				contador++;
			}	
		}
}
}