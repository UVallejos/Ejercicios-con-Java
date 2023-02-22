package IlernaPracticas;

public class UF5_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 // declara un array de enteros.
		int [] arr;
		
	    // asignando memoria para 5 enteros.
		arr = new int[5];
		
	    // inicializa el primer elemento del array
		arr[0] = 10;
		
		// inicializa el segundo elemento del array
		arr[1] = 20;
		
		arr[2] = 30;
		
		arr[3] = 40;
		
		arr[4] = 50;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Elemento en el indice "+ i + " : " + arr[i] );
		}
		
		int [] array = new int[100];
		
		System.out.println(array.length);
		*/
		
		String [][][] array3d = new String[3][3][3];
		
		for(int a=0; a<3;a++) {
			for(int f=0; f<3;f++) {
				for(int c=0; c<3;c++) {
					array3d[a][f][c] = ""+(a+1)+""+(f+1)+""+(c+1);
					System.out.print(array3d[a][f][c] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.print(array3d[1][1][1] + " ");
	}

}
