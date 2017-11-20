package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		int numero1;
		int numero2;
		int contar=0;
		int sumar=0;
		int contador=0;
		System.out.println("introduce un numero");
		numero1=teclado.nextInt();
		System.out.println("introduce un numero");
		numero2=teclado.nextInt();
		while(numero2>=numero1){
			contador=numero1;
			while(contador<numero2){	
				
				if ((contador%2)==0){
					contar++;
					sumar=sumar+contador;
					System.out.println(contador);
						
				}
				contador++;
			}
		}
		while(numero2<numero1){
			System.out.println("el primer numero es mayor que el segundo, vuelva a introducir numeros");
			numero1=teclado.nextInt();
			
			numero2=teclado.nextInt();
		}
		System.out.println(contar);
		System.out.println(sumar);
		}

}
