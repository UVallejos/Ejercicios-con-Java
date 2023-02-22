
public class Strings3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String alumno1, alumno2;
		
		alumno1 = "David";
		alumno2 = "david";
		
		//Verificamos que dos cadenas de texto son iguales respetando mayusculos o minusculas
		System.out.println(alumno1.equals(alumno2));
		
		//Verificamos que dos cadenas de texto son iguales ignorando mayusculos o minusculas
		System.out.println(alumno1.equalsIgnoreCase(alumno2));

	}

}
