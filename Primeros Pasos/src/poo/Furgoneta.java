package poo;

//Furgoneta hereda de coche
public class Furgoneta extends Coche {

	private int capacidadCarga;
	
	private int plazasExtras;
	
	public Furgoneta (int plazasExtras, int capacidadCarga) {
		
		super(); //Llamar al constructor de la clase padre Coche
		
		this.capacidadCarga = capacidadCarga;
		this.plazasExtras = plazasExtras;
	}
	
	public String getDatosFurgoneta() {
		
		return "La capacidad de carga es: "+  capacidadCarga + " Y las plazas son: " +  plazasExtras;
	}
	
}	
