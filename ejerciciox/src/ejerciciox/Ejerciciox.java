package ejerciciox;
import java.util.Scanner;

public class Ejerciciox {

	public static void main(String[] args) {
		// Hacer un pseudoc�digo que imprima los n�meros del 0 al 100, controlando las filas y las columnas.
		int d = 0;
		System.out.println("Introduce un n�mero de 3 cifras como m�ximo");
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		System.out.println("N�meros del 1 al "+numero);
		for (int i = 0; i <= numero; i++) {
			System.out.printf("%3d ",i);
			d++;
			if (d==11){ // Salto de l�nea
				System.out.println("");
				d=0;
			}
		}
	}

}
