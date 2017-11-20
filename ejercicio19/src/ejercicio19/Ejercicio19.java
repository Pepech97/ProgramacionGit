package ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		int contadormin=0;
		int contadorhoras=0;
		int activador=1;
		System.out.println("Introduce segundos");
		int segundos=teclado.nextInt();
		
		while(segundos<0 || segundos>=60){
			segundos=teclado.nextInt();
			
		}
		System.out.println("Introduce minutos");
		int minutos=teclado.nextInt();
		while(minutos<0 || minutos>=60){
			minutos=teclado.nextInt();
		}
		System.out.println("Introduce horas");
		int horas=teclado.nextInt();
		while(horas<0 || horas>=24){
			horas=teclado.nextInt();
	}
		while(activador==1){
		segundos++;
		if(segundos==60){
			segundos=0;
			minutos++;
		}
		if(minutos==60){
			minutos=0;
			horas++;
		}
		if(horas==24){
			horas=0;
		}
		Thread.sleep(1000);
	System.out.println(horas+":"+minutos+":"+segundos);
	}
	}
}
