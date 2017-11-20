package ejercicio21;


public class Ejercicio21 {

	public static void main(String[] args) {
		int contador = 1;
		int sumapares=0;
		int sumaimpares=0;
		int numimpares=0;
		int numpares=0;
        while (contador<=1000){
        switch (contador) {
        	case 1: 
        		numpares++;
        		sumapares = sumapares + contador;
        		break;
        	case 2:
        		numimpares++;
        		sumaimpares = sumaimpares + contador;
        		break;
	
	
	
        }
        System.out.println("la suma de los pares es "+sumapares);
        System.out.println("la suma de los impares es "+sumaimpares);
        }
	
	
	
	}
}
