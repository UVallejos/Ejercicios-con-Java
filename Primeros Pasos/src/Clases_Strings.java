
public class Clases_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*En Java los string no son un tipo primitivo de dato, son objetos
		 * que se pueden modificar con los metodos del objeto padre string
		 * las variables string que declaramos son instancias del objeto
		 * string y por lo tanto podemos usar los atributos y métodos de la clase
		 * string en la variables que declaremos de este tipo.
		 */
		
		String miNombre = "Ulises";
		System.out.println("Mi nombre es: "+miNombre);
		
		System.out.println("Mi nombre tiene " + miNombre.length() + " letras.");
		
		System.out.println("La primera letra de " + miNombre+ " es la " + miNombre.charAt(0) + ".");
		
		int ultima_letra;
		
		ultima_letra = miNombre.length();
		
		System.out.println("Y la última letra es la " + miNombre.charAt(ultima_letra - 1));
	}

}
