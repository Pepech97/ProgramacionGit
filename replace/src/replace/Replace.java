package replace;

import java.util.Scanner;

public class Replace {
//.contais() es mirar en un string si esta o no, te devuelve un booleano(true o false) 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		int ejercicio=teclado.nextInt();
		teclado.nextLine();
		switch (ejercicio) {
		case 1:
			String frase=teclado.nextLine();
			frase=" "+frase+" ";
			frase=frase.replace(" ", "  ");
			frase=frase.replace(" si ", " no ");
			frase=frase.replace("  ", " ");
			frase=frase.trim();
			System.out.println(frase);
			break;
		case 2:
			frase="";
			frase=teclado.nextLine();
			String letra=teclado.nextLine();
			letra=String.valueOf(letra.charAt(0));
			for (int i = 0; i < 3; i++) {
				frase=frase.replaceFirst(letra, "");
			}
			System.out.println(frase);
			break;
		case 3:
			frase="";
			int numero=teclado.nextInt();
			teclado.nextLine();
			for (int i = 0; i < numero; i++) {
				frase=frase+" ";
			}
			int k=numero-1;
			char frasevec[]=frase.toCharArray();
			for (int i = 0; i < frasevec.length; i++){
				for (int j = 0; j < frasevec.length; j++) {
					frasevec[k]='*';
					System.out.print(frasevec[j]);
				}
				k--;
				System.out.println();
			}
			break;
		case 4:
			frase="";
			numero=teclado.nextInt();
			for (int i = 0; i <numero-1; i++) {
				frase=" "+frase;
			}
			frase=frase+"*";
			for (int i = 0; i <numero; i++) {
				System.out.println(frase);
				frase=frase.replace(" *","**");
			}
			break;
		}
	}
}