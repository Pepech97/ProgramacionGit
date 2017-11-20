package e34;

import java.util.Scanner;

public class E34 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int notas[] = new int [10];
		int suma=0;
		int i;
		float media=0;
			for (i=0 ; i<notas.length; i++){
				notas[i]=teclado.nextInt();
				suma=suma+notas[i];
				
			}
		media=suma/i;
		System.out.println(media);
	}

}