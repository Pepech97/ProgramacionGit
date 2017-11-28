package eve5;

public class Eve5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector1[]=new int[10];
		int vector2[]=new int[10];
		int posicion=0;
		int sumaigual=0;
		for (int i = 0; i < vector1.length; i++) {
			vector1[i]=(int)(Math.random()*5+1);
			System.out.printf("%3d",vector1[i]);
		}
		System.out.println();
		for (int j = 0; j < vector2.length; j++) {
			vector2[j]=(int)(Math.random()*5+1);
			System.out.printf("%3d",vector2[j]);
		}
		System.out.println();
		for (int i = 0; i < vector1.length; i++) {
			for (int j = 0; j < vector2.length; j++) {
				if(vector1[i]==vector2[j]){
					sumaigual++;
				}
			}
			System.out.println("Elemento "+(i+1)+": "+sumaigual+"veces");
			sumaigual=0;
		}
	}

}
