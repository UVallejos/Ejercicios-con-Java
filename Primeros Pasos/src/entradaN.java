import javax.swing.*;
public class entradaN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		double x = 10000.0;
		
		Formateo de decimales con printF y formateo de cadenas. El dos de 1.2 representa los decilames que queremos
		System.out.printf("%1.2f", x/3);
		*/
		
		String num1 = JOptionPane.showInputDialog("Introduceun número: ");
		
		double num2 = Double.parseDouble(num1);
		
		System.out.print("La raíz de " + num2 + " es " );
		System.out.printf("%1.2f", Math.sqrt(num2));
	}

}
