import java.util.*;
public class Adivina_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Refunción, convertir un tipo de dato a otro
		 *Muy importante los parentesis 
		 *Multiplicamos x 100 porque muestra números aleatorios entre 0 y 1
		*/
		int aleatorio = (int) (Math.random()*100);
		
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		
		int intent = 0;
		
		do{
			
			intent++;
			
			System.out.println("Introduce un número por favor: ");
			
			num = entrada.nextInt();
			
			if (aleatorio < num) {
				
				System.out.println("Mas bajo");
			}
			else if (aleatorio > num) {
				
				System.out.println("Mas alto");
			}
			
		}while (num != aleatorio);
		System.out.println("Correcto. Lo conseguiste en " + intent + " intentos.");

		
	}

}
