
public class Clase_String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Buscar en un objeto string por el indice del mismo
		String frase = "Hoy es un estupendo día para aprender a programar en Java";
		String frase_resumen = frase.substring(0,29) + "irnos a la playa, olvidarnos de todo..."+" y "+
		frase.substring(29, 57);
		
		System.out.println(frase_resumen);

	}

}
