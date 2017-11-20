package es9;

import java.util.Scanner;

public class Es9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int bucle=0;
		int hombres1=0;
		int hombres2=0;
		int mujeres1=0;
		int mujeres2=0;
		int codigoval=0;
		int codigoinval=0;
		int i=0;
		System.out.print("Introduce el numero de alumnos: ");
		int numeroalumnos=teclado.nextInt();
		System.out.print("");
		String frase=teclado.nextLine();
		while(bucle<numeroalumnos){
			System.out.print("Introduce el año: ");
			frase=teclado.nextLine();
			int numaño = Integer.valueOf(frase.substring(0, 4));
			while(numaño<1989 || numaño>1996){
				System.out.print("Año incorrecto, vuelve a introducir el año: ");
				frase=teclado.nextLine();
			}
			System.out.print("Introduce el genero: ");
			String genletra= teclado.nextLine();
			int contador=0;	
			while(contador==0){
				if(genletra.equals("H") || genletra.equals("M")){
					contador++;
				}
				else{
					System.out.print("Genero incorrecto, vuelve a introducirlo: ");
					genletra= teclado.nextLine();
				}
			}
			frase=frase+genletra;
			System.out.print("Introduce el curso: ");
			int numcurso=teclado.nextInt();
			while(numcurso<=0 ||numcurso>2){
				System.out.print("Curso incorrecto, vuelva a introducir el curso: ");
				numcurso=teclado.nextInt();
			}
			frase=frase+numcurso;
			System.out.print("Introduce 2 caracteres: ");
			String letrasfin= teclado.nextLine();
			letrasfin= teclado.nextLine();
			while(letrasfin.length()>3){
				System.out.print("Valor introducido incorrecto, introduce 2 caracteres: ");
				letrasfin=teclado.nextLine();
			}
			frase=frase+letrasfin;
			String codigo="00000000";
			System.out.print("Codigo: ");
			String codigoint=teclado.nextLine();
			
			while(!codigoint.equals(codigo)){
				System.out.print("Codigo incorrecto, introduce otro codigo: ");
				codigoint=teclado.nextLine();
				codigoinval++;
			}

			if(frase.charAt(4)=='H' && frase.charAt(5)=='1'){
				hombres1++;
			}
			if(frase.charAt(4)=='H' && frase.charAt(5)=='2'){
				hombres2++;
			}
			if(frase.charAt(4)=='M' && frase.charAt(5)=='1'){
				mujeres1++;
			}
			if(frase.charAt(4)=='M' && frase.charAt(5)=='2'){
				mujeres2++;
			}
			if(codigoint.equals(codigo)){
				codigoval++;
			}
			bucle++;
		}	
		System.out.println("Primer curso");
		System.out.println("------------");
		System.out.print("Hombres: "+hombres1);
		System.out.println();
		System.out.print("Mujeres: "+mujeres1);
		System.out.println();
		System.out.println();
		System.out.println("Segundo curso");
		System.out.println("-------------");
		System.out.print("Hombres: "+hombres2);
		System.out.println();
		System.out.print("Mujeres: "+mujeres2);
		System.out.println();
		System.out.println("-------------");
		System.out.print("Codigos validos introducidos: "+codigoval);
		System.out.println();
		System.out.print("Codigos incorrectos introducidos: "+codigoinval);


	}

}
