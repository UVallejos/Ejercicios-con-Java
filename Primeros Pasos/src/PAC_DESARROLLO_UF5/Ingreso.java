package PAC_DESARROLLO_UF5;

public class Ingreso extends Dinero {
	
	//Contructor que hereda de la clase abstracta padre Dinero
	public Ingreso(double dinero, String description) {
		super();
		this.dinero = dinero;
		this.description = description;
	}
	
	//Sobre escritura del método toString
	@Override
	public String toString() {
		
		return "Ingreso: " + this.description + ", " + "Cantidad: " + String.format("%.2f", this.dinero); 
	}
}
