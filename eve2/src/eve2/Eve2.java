package eve2;

public class Eve2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector1[]=new int [10];
		int vector2[]=new int [10];
		int vector3[]=new int [10];	
		//para rellenar los 2 vectores con numeros random y el tercero la suma de los dos primeros
		for (int j = 0; j < vector2.length; j++) {
			vector2[j]=(int) (Math.random()*10);	
			vector1[j]=(int) (Math.random()*10);
			vector3[j]=vector1[j]+vector2[j];
			System.out.printf("%3s ",vector3[j]);
		}
		System.out.println();
		int variableauxiliar=0;
		//Esto es lo de la burbuja, para ordenar el vector
		for (int l = 0; l < vector3.length; l++) {		
			for (int i = 0; i < vector3.length-1; i++) {
				if(vector3[i]<vector3[i+1]){
					variableauxiliar=vector3[i];
					vector3[i]=vector3[i+1];
					vector3[i+1]=variableauxiliar;
				}
			}
		}
		//para imprimir el vector ordenado
		for (int k = 0; k < vector3.length; k++) {
			System.out.printf("%3s ",vector3[k]);
		}	


	}	
}
	
