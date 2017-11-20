import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		int numero;
		int contador=1;
		System.out.println("introduce un numero");
		numero=teclado.nextInt();
		while(numero<0){
			System.out.println("introduce un numero");
			numero=teclado.nextInt();
		}
		while (contador<=numero){
			if ((contador % 3)==0) {
				
				System.out.println(contador);
			}
		contador=contador+1;	
		}

}}
