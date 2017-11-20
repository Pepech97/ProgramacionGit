package e33;

import java.util.Scanner;

public class E33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String[] nombres=new String[20];
			for(int i=0; i<nombres.length; i++){
			nombres=teclado.next();
			System.out.println(nombres[i]);
			}
	}

}
