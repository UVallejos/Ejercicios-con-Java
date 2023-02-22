
public class Ejemplo_Array_d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double acumulado;
		double interes = 0.10;
		
		/*Declaramos matriz de 2 dimensiones*/
		double [][] saldo = new double [6][5];
		
		/* Con esto vamos a rellenar automaticamente la array bidimensional */
		for (int i = 0; i<6; i++) {
			/*Le decimos que todas las posiciones [0] de la "columna" [i], va hacer siempre la misma 10,000 */
			saldo[i][0] = 10000;
			acumulado = 10000;
			
			/* Bucle anidado para ingresar datos en las dimenciones de la array*/ 
			for (int j = 1; j < 5; j++ ) {
				
				/* Aumentamos el interes de cada "Columna" */
				acumulado = acumulado + (acumulado * interes);
				
				/* agregamos el acumulado a correspondiente a la columna que se itere en el anterior bucle */
				saldo [i][j] = acumulado;
			}
			/* Aumentamos el interes de cada columna */
			interes = interes + 0.01; 
		}

		/* Recorresmos el array bidimensional */
		for (int z = 0; z < 6; z++) {
			
			System.out.println();
			
			System.out.println();
			for (int h = 0 ; h < 5; h++) {
				
				System.out.printf("%1.2f", saldo[z][h]);
				System.out.print(" - ");
			}
		}
	}

}
