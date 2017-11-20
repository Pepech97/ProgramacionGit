package prueba;

import java.util.Scanner;
public class Prueba {
	public static void main(String[] parametro)
	{
		// definimos  un objeto teclado para lectura de datos
		Scanner teclado = new Scanner(System.in); 
	
		int entero;
		float decimales;
		String mitexto; // vamos a leer diferentes tipos de datos
		
		System.out.println("dame un entero:");
		entero=teclado.nextInt();
		System.out.println("dame un numero con decimales:");
		decimales=teclado.nextFloat();
		System.out.println("dame un texto:");
		mitexto=teclado.nextLine();
		System.out.println("el entero fue:"+entero);
		System.out.printf("el entero fue: % 5d",entero);
		System.out.println("el decimal fue:"+decimales);
		System.out.printf("el decimal fue: % 10.2f",decimales);
		System.out.println("el texto fue:"+mitexto);
}}