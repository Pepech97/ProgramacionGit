package ejercicio5;

public class Ejercicio5 {
 

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int contador = 1;
				int impar = 2;
				int numeroimpares = 0;
				System.out.println(contador);
				while (contador <100){
					impar = impar - 1;
					contador = contador + 1;
					if (impar == 0){
						System.out.println(contador);
						impar = 2;
						numeroimpares = numeroimpares +1;
			}

		}
				System.out.println(numeroimpares);
				} 

	

}
