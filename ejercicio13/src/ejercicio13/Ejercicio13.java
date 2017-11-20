package ejercicio13;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int multiplosdos=0;
		int multiplostres=0;
		int numero=1;
		System.out.println(numero);
		while(numero <= 100){
			
			if ((numero % 3)==0){
				System.out.println(numero);
				multiplostres = multiplostres + 1;
			}
			if ((numero % 2)==0){
				System.out.println(numero);
				multiplosdos = multiplosdos + 1;
		}
			numero = numero + 1;
			System.out.println(multiplosdos);
			System.out.println(multiplostres);
	
	
	
	
	
	
	
	}

}}
