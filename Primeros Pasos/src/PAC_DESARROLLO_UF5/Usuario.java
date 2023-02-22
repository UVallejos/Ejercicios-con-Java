package PAC_DESARROLLO_UF5;

public class Usuario {
	
	//Variebles que se inicializan con los métodos en la clase main
	private String nombre;
	private int edad;
	private String DNI;
	
	public Usuario() {
	
	}
	
	//Métodos getters y setters
	public String getNombre(){
		
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public int getEdad(){
		
		return this.edad;
	}
	
	public void setEdad(int edad) {
		
		this.edad = edad;
	}
	
	public String getDNI(){
		
		return this.DNI;
	}
	
	//Método para comprobar que el DNI es valido
	public boolean setDNI(String DNI){
		
		if (DNI.matches("^[0-9]{8}-?[A-Z]{1}$")) {
			this.DNI = DNI;
			return true;
		}
		else {
			return false;
		}
	}
	
	//Sobre escritura del método toString
	@Override
	public String toString(){
		
		return "Eombre = " + nombre +
				"Edad = " + edad + 
				"DNI = " + DNI; 
	}

	
}
