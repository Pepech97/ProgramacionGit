package eve3;

public class Eve3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector[]=new int [20];
		int mayor=0;
		int menor=0;
		//rellenar vector
		for (int i = 0; i < vector.length; i++) {
			vector[i]=(int)((Math.random()*10)+1);
			System.out.printf("%3d",vector[i]);
		}
		System.out.println();
		//Con el j==0 hago que siempre la primera vez que haga el for entre a los
		//if ya que sino no se guarda ya un numero como mayor o menor, y ese puede ser el mayor o el menor
			for (int j = 0; j < vector.length-1; j++) {
				if(vector[j]>mayor || j==0){
					mayor=vector[j];
				}
				if(vector[j]<menor|| j==0){
					menor=vector[j];
				}
			}
		
		System.out.println(mayor);
		System.out.println(menor);
	}
}