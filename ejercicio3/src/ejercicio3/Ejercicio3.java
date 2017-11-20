package ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
		int par = 2;
		while (contador <=100){
			par = par - 1;
			contador = contador + 1;
			if (par == 0){
				System.out.println(contador);
				par = 2;
			}
			
			}
	

} }