import java.util.Scanner;
public class Examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		do{	
			System.out.println("Examen Cutre v1.0");
			System.out.println();
			System.out.println("1. Ejercicio de los asteriscos");
			System.out.println("2. Ejercicio del DNI");
			System.out.println("4. Ejercicio del e-mail");
			System.out.println("5. Salir");
			System.out.println("- - - - - - - - -");
			opcion = teclado.nextInt();
			teclado.nextLine(); // Limpio buffer
			switch (opcion) {
			case 1:
				int numero;
				String espacios="",asterisco="",resultado="";
				System.out.print("Introduzca un número entero positivo: "); // Mensaje
				numero = teclado.nextInt(); // Se introduce el número de asteriscos por pantalla
				teclado.nextLine(); // Limpio buffer
				for (int i = 0; i < numero-1; i++) { // Hago tantos espacios como asteriscos haya
					espacios = espacios+" "; // Va sumando espacio a espacio
				}
				for (int i = 0; i < numero; i++) { // Lo hace una vez más de la introducida
					asterisco=asterisco+"*"; // Tantos asteriscos como numero introducido 
					resultado=espacios+asterisco; // Resultado = "numero de espacios|numero de asteriscos" LOS ESPACIOS SON SIEMPRE LOS MISMOS, los asteriscos se van sumando
					System.out.println(resultado.substring(i,resultado.length())); // Con esto quito un espacio por cada reiteración del for
				}
				break;
			case 2:
				int error = 0;
				String tabla[] = {"t","r","w","a","g","m","y","f","p","d","x","b","n","j","z","s","q","v","h","l","c","k","e"}; // Vector para comprobar la ultima letra con el resto
				System.out.print("Introduzca un DNI: "); // Mensaje 
				String dni = teclado.nextLine(); // Se introduce el DNI por el teclado
				dni = dni.toLowerCase(); // Se convierte en minúsculas
				if (dni.length() == 9) { // Cuando sea de longitud 9 
					for (int i = 0; i < dni.length()-1; i++) { // Comprobar que los 8 primeros son números
						if ( (dni.charAt(i) < '0' || dni.charAt(i) > '9') && dni.length()==9) {
							error=1;
						}
					}
					if (error==0 && ( dni.charAt(dni.length()-1) >'a' && dni.charAt(dni.length()-1) <'z')  ) { // Si los 8 primeros son números y el últimos es una letra
						if ( String.valueOf(dni.charAt(dni.length()-1)).equals(tabla[Integer.valueOf(dni.substring(0,8))%23]) ){ // Si coincide la letra con la tabla
							System.out.println("El DNI es correcto");
						}
						else { // Si no coincide la letra con la tabla
							System.out.println("El DNI es incorrecto");
						}
					}
					else { // Si el último dígito no es una letra 
						System.out.println("El DNI es incorrecto");
					}
				} // Si tiene longitud diferente a 9
				else {
					System.out.println("El DNI es incorrecto");
				}
				System.out.println();
				break;
			case 3:

				break;
			case 4:
				int at=0,puntos=0;
				error = 0; 
				String partelocal,dominio,aceptadas="zxcvbnmasdfghjklqwertyuiopZXCVBNMASDFGHJKLQWERTYUIOP1234567890.-_";
				System.out.print("Introduce un correo electrónico: ");
				String correo = teclado.nextLine();
				for (int i = 0; i < correo.length(); i++) { // Recorremos todo el string para comprobar existe un sólo '@'
					if (correo.charAt(i)=='@') {
						at++;
					}
				}
				if (at!=1 ||correo.indexOf("@")==0 || correo.indexOf("@")==correo.length()-1 ) {
					error=1;
				}
				else { // Cuando solo hay un '@'
					partelocal=correo.substring(0,correo.indexOf("@"));
					dominio=correo.substring(correo.indexOf("@")+1);
					for (int i = 0; i < partelocal.length(); i++) {
						if( aceptadas.indexOf(partelocal.charAt(i)) == -1) { // Si contiene puntos seguidos o carácteres no válidos
							error=1;
						}
					}
					if (partelocal.contains("..") || dominio.contains("_") || dominio.contains("..")) {
						error=1;
					}
					for (int i = 0; i < partelocal.length(); i++) {
						if( aceptadas.indexOf(partelocal.charAt(i)) == -1 || partelocal.charAt(0)=='.' || correo.charAt(correo.indexOf("@")-1)=='.'){ // Verificamos errores
							error=1;
						}
					}
					for (int i = 0; i < dominio.length(); i++) {
						if( aceptadas.indexOf(dominio.charAt(i)) == -1 || dominio.charAt(0)=='.' || dominio.charAt(dominio.length()-1)=='.'){ // Verificamos errores
							error=1;
						}
					}
				}
				if (error==1) {
					System.out.println("Formato incorrecto");
				}
				else {
					System.out.println("Formato correcto");
				}
				System.out.println();
				break;
				}
		}while(opcion!=5);
	}
}