import javax.swing.*;
public class bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "Ulises";
		
		String pass = "";
		
		//equals se utiliza para comparar si dos cadenas de texto son iguales
		while (clave.equals(pass)==false) {
			
			pass = JOptionPane.showInputDialog("Introduce la contraseña, por favor: ");
			
			if (clave.equals(pass)==false) {
				System.out.println("Contraseña incorrecta.");
			}
			
		}
		
		System.out.println("Contraseña correcta, acceso permitido");

	}

}
