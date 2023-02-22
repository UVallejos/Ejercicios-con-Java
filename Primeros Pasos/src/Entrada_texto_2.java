import javax.swing.*;
public class Entrada_texto_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombreUsuario = JOptionPane.showInputDialog("Introduce tú nombre, por favor: ");
		
		String edad = JOptionPane.showInputDialog("Introduce tú edad, por favor: ");
		
		int edadInt = Integer.parseInt(edad);
		
		edadInt++;
		
		System.out.println("Hola " + nombreUsuario + ". El año que viene tendrás " + edadInt + " años.");

	}

}
