package snippet;

public class Snippet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		int contador=0;
		String frase;
		
		int infinito=0;
		while (infinito==0){
			System.out.println("introduce una frase");
			frase=teclado.nextLine();
			if(!frase.equals("")){
				contador++;
				System.out.println(contador);
			}
			else{
				
				infinito++;
				
			}
		}
		System.out.println("hay "+contador+" frases");
	}
	}
}

