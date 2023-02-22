
public class Calculos_Math {
	
	public static void main(String[] args) {
		
		/*Refundicion con Math.round()
		* Consiste en poner el tipo de dato al que queremos transformarlo entre
		*parentesis
		
		double a = 5.85;
		
		int raiz = (int)Math.round(a);
		System.out.println(raiz);
		*/
		
		//Elevar un número a una potencia
		double base = 5;
		double exponente = 3;
		
		//Otro ejemplo de refundción
		//Elevar número seleccionado a la potencia seleccionada 
		int resultado = (int)Math.pow(base, exponente);
		
		System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado);
	}
}
