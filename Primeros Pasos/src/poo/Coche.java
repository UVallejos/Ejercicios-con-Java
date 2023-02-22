package poo;

import javax.swing.*;

public class Coche {
	
	private int ruedas;
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso_plataforma;
	
	private String color;
	
	private int peso_total;
	
	private boolean asientos_cuero, climatizador;
	
	//Método constructor
	public Coche () {
		
		ruedas = 4;
		
		largo = 2000;
		
		ancho = 300;
		
		motor = 1600;
		
		peso_plataforma = 500;
		
	}
	
	public String getDatos() {
		
		return "La plataforma del vehículo tiene " + ruedas + " ruedas " + ""
				+ ". Mide " + largo/1000 + " metros con un ancho de " + ancho +""
						+ " CM y un peso de plataforma de " + peso_plataforma + " KG." ;
	}
	
	//Método setter que se encarga de modificar una propiedad
	public void setColor(String color_coche) {
		
		color = color_coche;
	}
	
	//Método getter que se encarga de mostrar una propiedad
	public String getColor() {
		
		return "El color del coche es: " + color;
	}
	
	//Setter Asientos
	public void setAsientos (String asientos_cuero) {
		
		//Importante Equals IGNORE CASE COMPARA CADENAS STRING IGNORANDO MAYUSCULA Y MINUSCULAS
		if (asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero = true;
		
		}
		else {
			this.asientos_cuero = false;
		}
	}
	
	//Getter Asientos
	public String getAsientos() {
		
		if (asientos_cuero) {
			return "El coche tiene asientos de cuero.";
		}
		else {
			return "El coche tiene asientos de serie.";
		}
	}
	
	//Setter Climatizador
	public void setClimatizador(String climatizador) {
		
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		}
		else {
			this.climatizador = false;
		}
	}
	
	//Getter Climatizador
	public String getClimatizador() {
		
		if (climatizador == true) {
		
			return "El coche tiene Climatizador.";
		}
		else {
			return "El coche lleva aireacondicionado.";
		}
	}
	
	//Método SETTER | GETTER (No es recomendable hacer esto, es mejor funciones individuales)
	public String getPesoCoche() {
		
		int peso_carroceria = 500;
		
		peso_total = peso_plataforma + peso_carroceria;
		
		if (asientos_cuero == true) {
			
			peso_total = peso_total + 50;
		}
		if (climatizador = true) {
			
			peso_total = peso_total + 20;
		}
		
		return "El peso del coche es " + peso_total;
	}
	
	//Getter
	public int getPrecio_coche() {
		
		int precio_final = 10000;
		
		if (asientos_cuero == true) {
			precio_final += 2000;
		}
		
		if (climatizador == true) {
			precio_final += 1500;
		}
		
		return precio_final;
	}
}
