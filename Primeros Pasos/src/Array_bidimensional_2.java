
public class Array_bidimensional_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matrix = {
				{10, 15, 18, 19, 21 },
	            {5, 25, 37, 41, 15},
	            {7, 19, 32, 14, 90},
	            {85, 2, 7, 40, 27}
		};
		/*
		for (int i = 0; i < 4; i++) {
			
			System.out.print((i+1)+" - Dimención - ");
			
			for (int j = 0; j < 5; j++) {
				System.out.print(matrix[i][j] + " ");
			} 
			
			System.out.println("");
		}*/
		
		for (int[]fila:matrix) {
			
			System.out.println();			
			
			for (int z: fila) {
				
				System.out.print(z + " ");
				
			}
		}

	}
}

