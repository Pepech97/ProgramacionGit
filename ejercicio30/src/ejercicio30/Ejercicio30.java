package ejercicio30;

public class Ejercicio30 {

	public static void main(String[] args) throws InterruptedException {
		int caballos[] = new int [6];
		int corre;
		int ganador=0;
		int j = 0;
		int i = 0;
		int r = 0;
		String barra[]= new String [6];
		while (ganador==0){
			corre=(int)(Math.random()*8+1);
			caballos[i]=caballos[i]+corre;
			barra[i]="Caballo nº"+(i+1)+" [";

			for(int k=0;k<caballos[i];k++){
				if (caballos[i]<=100){
					barra[i]=barra[i]+"=";
				}
				else{
					caballos[i]=100;
					barra[i]=barra[i]+"=";
				}
			}
			for(int u=caballos[i];u<100;u++){
				barra[i]=barra[i]+" ";
			}
			barra[i]=barra[i]+"]";
			System.out.println(barra[i]);

			if(caballos[i]>=100){
				ganador++;

				j=i;
				r=i;
			}
			i++;
			if (i==6){
				System.out.println();
				i=0;
				Thread.sleep(250);
			}
		}	
		while (r<5){
			System.out.println(barra[r+1]);
			r++;
		}
		System.out.println("El ganador es el caballo "+ (j+1));
	
	}
}