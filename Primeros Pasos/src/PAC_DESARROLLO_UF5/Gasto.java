package PAC_DESARROLLO_UF5;

public class Gasto extends Dinero {
	
	//Contructor que hereda de la clase abstracta padre Dinero
	public Gasto(double dinero, String description) {
		super();
		this.dinero = dinero;
		this.description = description;
	}
	
	//Sobre escritura del método
	@Override
	public String toString() {
		
		return  "Gasto: " + this.description + ", " + "Cantidad: " + String.format("%.2f", this.dinero) ; 
	}

}
