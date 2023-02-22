import java.util.*;
public class control_de_flujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce tú edad, por favor: ");
		
		//Formatear la entrada para que se convierta en un int, por defecto es un string
		int edad = entrada.nextInt();
		
		/*
		if (edad >= 18) {
		
		System.out.println("Eres mayor de edad!!");
			
		}
		else {
			
			System.out.println("Eres menor de edad.");
			
		}
		*/
		
		if (edad < 18) {
			System.out.println("Eres un adolecente.");
		}
		else if (edad < 40) {
			System.out.println("Eres joven");
		}
		else if (edad < 65) {
			System.out.println("Eres maduro");
		}
		else{
			System.out.println("Cuídate");
		}
	}

}
