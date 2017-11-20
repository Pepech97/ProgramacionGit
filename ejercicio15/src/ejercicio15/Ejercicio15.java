package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		int numero1=0;
		int numero2=0;
		int mayor=0;
		int menor=0;
		int contadornum=0;
		int contadorpar=0;	
		int contador=0;
		int sumaimpar=0;
		
	
			
			System.out.println("introduce un numero");
			numero1=teclado.nextInt();
			System.out.println("introduce un numero");
			numero2=teclado.nextInt();
			if(numero1>numero2){
				mayor=numero1;
				menor=numero2;
			}
			if(numero2>numero1){
				mayor=numero2;
				menor=numero1;
			}
			contador=menor+1;
			contadornum=mayor-menor-1;
			while(contador<mayor){
				System.out.println(contador);
				if((contador % 2)==0){
					contadorpar++;
				}
				else{
					sumaimpar=sumaimpar+contador;
				}
				contador++;
				}
			System.out.println(contadorpar);
			System.out.println(sumaimpar);
			System.out.println(contadornum);
		}
		}


