package eve3;

public class Eve3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector[]=new int [20];
		int mayor=0;
		int menor=0;
		for (int i = 0; i < vector.length; i++) {
			vector[i]=(int)(Math.random()*10);
			System.out.printf("%3d",vector[i]);
		}
		System.out.println();
		
		for (int j = 0; j < vector.length-1; j++) {
			if(vector[j]>vector[j+1]){
				mayor=vector[j];
			}
			if(vector[j]<vector[j+1]){
				menor=vector[j];
			}
		}
		System.out.println(mayor);
		System.out.println(menor);
	}
}