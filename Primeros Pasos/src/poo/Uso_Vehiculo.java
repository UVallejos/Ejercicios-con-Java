package poo;

//import javax.swing.JOptionPane;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Instanciamos una clase | Ejemplarizar una clase */
		Coche micoche = new Coche();
		/*
		micoche.setColor(JOptionPane.showInputDialog("Introduce Color"));
		
		System.out.println(micoche.getColor());
		
		System.out.println(micoche.getDatos());
		
		micoche.setAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?: "));
		
		System.out.println(micoche.getAsientos());
		
		micoche.setClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?: "));
		
		System.out.println(micoche.getClimatizador());
		
		System.out.println(micoche.getPesoCoche());
		
		System.out.println("El precio final del coche es: " + micoche.getPrecio_coche());
		*/
		
		Coche micoche1 = new Coche();
		
		micoche1.setColor("Rojo");
		
		Furgoneta mifurgoneta1 = new Furgoneta(7, 580);
		
		mifurgoneta1.setColor("Azul");
		
		mifurgoneta1.setAsientos("Si");
		
		mifurgoneta1.setClimatizador("Si");
		
		System.out.println(micoche1.getDatos());
		
		System.out.println(mifurgoneta1.getDatos() + mifurgoneta1.getDatosFurgoneta());
	
	}

}
