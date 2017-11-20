package ejercicio29;

public class Ejercicio29 {

	public static void main(String[] args) {
		int dado1;
		int dado2;
		int contador=0;
		int sumadados=0;
		while(contador<100){
			dado1=(int)(Math.random()*6+1);
			dado2=(int)(Math.random()*6+1);
			if(dado1+dado2==10){
				sumadados++;
			}
			contador++;
		}
		System.out.println("Ha sumado 10 "+sumadados+" veces"); 
	
	}

}
