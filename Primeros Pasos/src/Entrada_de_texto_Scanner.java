import java.util.*;

public class Entrada_de_texto_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciamos objeto para que podamos gestionar entrada de datos por consola
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor: ");
		//Usamos el objeto instanciado para gestionar el tipo de dato que almacenamos
		String nombreUsuario = entrada.nextLine();
		
		System.out.println("Introduce edad, por favor: ");
		int edad = entrada.nextInt();
		
		System.out.println("Hola "+nombreUsuario+". El año que viene tendras "+ (edad+1) +" años.");
	}

}
 