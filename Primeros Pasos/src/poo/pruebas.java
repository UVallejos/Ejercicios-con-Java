package poo;

public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados empleado1 = new Empleados ("Ulises Vallejos");
		Empleados empleado2 = new Empleados ("Eliel Vallejos");
		
		empleado1.setSeccion("RRHH");
		
		System.out.println(empleado1.getSeccion());
		System.out.println(empleado2.getSeccion());
	}

}

class Empleados {
	  
	//CONSTRUCCTOR
	public Empleados (String nom) {
		
		nombre = nom;
		
		seccion = "Administración";
		
		
	}
	
	
	//Setter sección
	public void setSeccion(String seccion) {
		
		this.seccion = seccion;
	}
	
	//Getter 
	public String getSeccion() {
		
		return "EL NOMBRE ES: " + nombre + " Y LA SECCIÓN ES: " + seccion;
		
	}
	
	
	private final String nombre;
	
	private String seccion;
}
