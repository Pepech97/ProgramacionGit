/**4.	Generar una matriz de 5x5  (numérica entera entre -100 y 100) e imprimir el valor mayor
 *  y el menor y los lugares donde se encuentran.
 */
package eve4;

public class Eve4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mayor=0;
		int menor=0;
		int posxmen=0;
		int posymen=0;
		int posxmay=0;
		int posymay=0;
		int vector[][]=new int [5][5];
		//Se rellena el vector
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[0].length; j++) {
				vector[i][j]=((int)(Math.random()*201)-100);
				System.out.printf("%4s ",vector[i][j]);
				//Esto es lo mismo, lo de j==0 i==0 es para que entre la primera vez
				//Al final se quedaran guardados los datos del menor y del mayor, cuando haya pasado por
				//todos los numeros
				if(vector[i][j]<menor || (j==0 && i==0)){
					menor=vector[i][j];
					posxmen=j+1;
					posymen=i+1;
				}
				if(vector[i][j]>mayor || (j==0 && i==0)){
					mayor=vector[i][j];
					posxmay=j+1;
					posymay=i+1;
				}	
			}
			System.out.println();
		}
		System.out.println(mayor);
		System.out.println(" col "+posxmay+" fila "+posymay);
		System.out.println(menor);
		System.out.println(" col "+posxmen+" fila "+posymen);
		
	}

}
