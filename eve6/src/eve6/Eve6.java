/*6.	Generar una matriz de 10x10, asignarles número  
 * reales aleatorios a cada elemento entre -5 y 5. Calcular e 
 * imprimir la suma de cada una de sus filas y de cada una de sus columnas junto con la matriz.
 */

package eve6;

public class Eve6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float vector[][]=new float[10][10];
		float sumacol[]=new float[10];
		float sumafila[]=new float[10];
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[0].length; j++) {
				vector[i][j]=(float) (Math.random()*10-5);
				System.out.printf("%6.2f ",vector[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Suma filas");
		//Como las filas se rellenan con esto aunque el numero de filas sean las i
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector.length; j++) {
				sumafila[i]=sumafila[i]+vector[i][j];
				sumacol[j]=sumacol[j]+vector[i][j];
			}
			System.out.printf("%6.2f ",sumafila[i]);
		}
		System.out.println();
		System.out.println("Suma columnas");
		//esto rellena las columnas ya que son las filas pero se ponen como columnas
		for (int i = 0; i < sumacol.length; i++) {
			System.out.printf("%6.2f ",sumacol[i]);
		}

	}
}

