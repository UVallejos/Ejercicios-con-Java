import javax.swing.*;
public class pesoIdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String genero = "";
		
		do {
			genero = JOptionPane.showInputDialog("Introduce tu género (H/M)");
			
				//equalsIgnoreCase compara que dos cadenas sean iguales ignorando mayusculas y minusculas 
		//Lo que decimos es que mientras lo que se introduce en genero sea diferente de H O M el bucle siga 
			
		} while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm: "));
		
		int pesoideal = 0;
		
		if (genero.equalsIgnoreCase("H")) {
			
			pesoideal = altura - 110;
		}
		else if (genero.equalsIgnoreCase("M")) {
			
			pesoideal = altura - 120;
		}
		
		System.out.println("Tu peso ideal es " + pesoideal + " Kg.");
	}

}
