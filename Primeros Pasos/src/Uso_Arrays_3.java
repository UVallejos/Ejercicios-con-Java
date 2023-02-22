import javax.swing.JOptionPane;
public class Uso_Arrays_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] aleatorios = new int [150];
		
		/*Rellenamos la latriz creada, le introducimos números aleatorios*/
		for (int i = 0; i < aleatorios.length; i++) {
			
			aleatorios[i] = (int) Math.round(Math.random()*100);	
					
		}
		
		/*Recorremos e imprimimos en pantalla lo que almacena el array*/
		for (int numeros:aleatorios) {
			System.out.print(numeros + ", ");
		}
		
	}

}
