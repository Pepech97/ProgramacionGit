package e36;

public class E36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[][] = new int [4][5];
		for(int i=0; i <4 ; i++){
			for (int j = 0; j < 5; j++) {
				numeros[i][j] = (int)(Math.random()*100+1);
				System.out.printf("%3s ",numeros[i][j]);
			}	
			System.out.println();
		}

}
}