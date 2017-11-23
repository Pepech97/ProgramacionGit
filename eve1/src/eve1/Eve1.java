package eve1;

public class Eve1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[]=new int [20];
		double media;
		int suma=0;
		int masmedia=0;
		int menmedia=0;
		int igualmedia=0;
		for(int i=0;i<numeros.length;i++){
			numeros[i]=(int)((Math.random()*22)-11);
			System.out.printf("%3s ",numeros[i]);
			suma=suma+numeros[i];
		}
		media=suma/20;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]<media){
				menmedia++;
				
			}
			else if(numeros[i]==media){
				igualmedia++;
			}
			else{
				masmedia++;
			}
		}
		System.out.print("\nLa media es: "+media+"\n");
		System.out.print("Hay "+menmedia+" notas menor que la media\n");
		System.out.print("Hay "+masmedia+" notas mayor que la media\n");
		System.out.print("Hay "+igualmedia+" notas igual que la media");
	}

}
