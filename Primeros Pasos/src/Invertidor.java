import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Invertidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Escribe una rutina para un programa que invierta las palabras de una frase dada como parametro. Por ejemplo,
		 * si la entrada es "hoy es martes cinco", tú rutina debe devolver la frase "cinco martes es hoy"
		 * 
		 * */
		
		invertidor("hoy es martes cinco");
		
	}
	
	public static void invertidor(String entrada){
		String[] entradaList = entrada.split(" ");
		List<String> invertidaLista = new ArrayList<>();
		List<String> salida = new ArrayList<>();
		
		//Convierte el caracter de entrada en una Array que agrega a una ArrayList
		for (int i = 0; i < entradaList.length; i++) {
			invertidaLista.add(i, entradaList[i]);
		}
			
		//Bulce para agregar el último elemento de la ArrayList invertidaLista a la ArrayList salida. 
		//Le decimos que si el tamaño de invertidaLista es mayor o igual que uno, ejecute el código
		// Declaramos un index que es la longitud de la lista menos 1 para ocuparlo de index.
		// Luego declaramos una variable string que almacena la ultima palabra de la lista
		//Luego de agregar la palabra, eliminamos la palabra de la lista y volvemos a realizar la misma operación
		//Hasta tener todos los elementos
			
		boolean comp = true;
		while(comp) {
			if(invertidaLista.size() >= 1) {
				int index = invertidaLista.size() - 1;
				String ultimaPalabra = invertidaLista.get(index);
				salida.add(ultimaPalabra);
				invertidaLista.remove(index);
			}
			else {
				break;
			}	
		}
		
		String deSalida = "";
		int aument = 0;
		//Recorremos los elementos de la ArrayList salida para agregarlo a una variable string 
		// y devolverlo en el mismo dormato que ha entrado
		for(String e: salida){
			deSalida += salida.get(aument) + " ";
			aument++;
		}
		
		System.out.println("Entrada: " + entrada);
		System.out.println("Salida: " + deSalida);
	}
}
