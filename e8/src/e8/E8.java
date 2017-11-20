package e8;

import java.util.Scanner;

public class E8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		System.out.println("Introduce una letra");
		String letra=teclado.nextLine();
		int contador=0;	
		while(contador==0){
			if(letra.equals("S") || letra.equals("N")){
				contador++;
			}
			else{
			System.out.println("Introduce otra letra");
			letra=teclado.nextLine();
			}
		}
}
}
