import java.util.Scanner;

public class Ejercicio172 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		int numero1;
		int numero2;
		int contar=0;
		int sumar=0;
		System.out.println("introduce un numero");
		numero1=teclado.nextInt();
		System.out.println("introduce un numero mayor al anterior");
		numero2=teclado.nextInt();
		while(numero1>numero2){
			System.out.println("el primer numero es mayor que el segundo, vuelva a introducir numeros");
			numero1=teclado.nextInt();
			
			numero2=teclado.nextInt();
		}
	
		while(numero1<numero2){
			if((numero1%2)==0){
				contar++;
				sumar=sumar+numero1;
				System.out.println(numero1+" es multiplo de 2");
			}
			numero1++;
		}
		System.out.println("hay "+contar+" multiplos de 2");
		System.out.println("la suma de los multiplos es "+sumar);
		teclado.close();
	}
	

}
