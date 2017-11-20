package ejerciciox;
import java.util.Scanner;

public class Ejerciciox {

	public static void main(String[] args) {
		// Hacer un pseudocódigo que imprima los números del 0 al 100, controlando las filas y las columnas.
		int d = 0;
		System.out.println("Introduce un número de 3 cifras como máximo");
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		System.out.println("Números del 1 al "+numero);
		for (int i = 0; i <= numero; i++) {
			System.out.printf("%3d ",i);
			d++;
			if (d==11){ // Salto de línea
				System.out.println("");
				d=0;
			}
		}
	}

}
