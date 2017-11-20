package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero=1;
		int sumapares=0;
		int sumaimpares=0;
		while(numero<=100){
			if ((numero % 2)==0) {
				sumapares=sumapares+numero;
				
			}
			else{
				sumaimpares=sumaimpares+numero;
		}
			System.out.println(numero);
			numero ++;
}
		System.out.println(sumapares);
		System.out.println(sumaimpares);
	}}

