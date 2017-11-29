/*5.	Generar  dos vectores de dimensión  10 (dar valores aleatorios entre 1 y 5 a cada elemento)
 *  y comprobar para cada uno de los elementos  del primer vector cuántas veces está en el segundo, 
 */
package eve5;

public class Eve5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector1[]=new int[10];
		int vector2[]=new int[10];
		int sumaigual=0;
		//Rellenamos el primer vector y lo imprimimos
		for (int i = 0; i < vector1.length; i++) {
			vector1[i]=(int)(Math.random()*5+1);
			System.out.printf("%3d",vector1[i]);
		}
		System.out.println();
		//Rellenamos el segundo vector y lo imprimimos
		for (int j = 0; j < vector2.length; j++) {
			vector2[j]=(int)(Math.random()*5+1);
			System.out.printf("%3d",vector2[j]);
		}
		System.out.println();
		//Aqui recorremos los dos vectores, el i recorre cada numero por el vector entero del otro
		//y si los numeros de las posiciones son iguales se suma el contador
		for (int i = 0; i < vector1.length; i++) {
			for (int j = 0; j < vector2.length; j++) {
				if(vector1[i]==vector2[j]){
					sumaigual++;
				}
			}
			System.out.println("Elemento "+(i+1)+": "+sumaigual+"veces");
			//se iguala a cero para hacerlo con cada elemento del vector
			sumaigual=0;
		}
	}

}
