
public class Uso_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* int [] mi_matriz = new int [5];
		
		mi_matriz[0] = 5;
		mi_matriz[1] = 38;
		mi_matriz[2] = 15;
		mi_matriz[3] = 92;
		mi_matriz[4] = 71; #Una forma de declarar una matriz */
		
		
		int [] mi_matriz = {5, 38, -15, 92, 71, 52, 52, 69, 84, 75, 25, 58, 63, 14, 574, 5478, 22174, 8843};
		
		for (int i = 0; i < mi_matriz.length; i++) {
			System.out.println("Valor del índice " + i + " = " + mi_matriz[i]);
		}
		
		
	}

}
