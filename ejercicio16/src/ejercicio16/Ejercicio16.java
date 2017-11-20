package ejercicio16;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador=1;
		int x=0;
		while (x<=10){
			System.out.printf("%2d ",contador);
			if(contador>=10){
				x++;
				System.out.println();
				contador=0;
			}
			contador++;
		}
	}

}
