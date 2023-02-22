package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona[] lasPersonas = new Persona[2];
		lasPersonas[0] = new Empleado2("Ulises Vallejos", 50000, 2009, 02, 25);
		lasPersonas[1] = new Alumno("Eliel Vallejos", "Cuidado de personas");
		
		//Bucle for mejorado
		//For (Declaramos variable del tipo del array que vamos a recorrer , dos puntos y el nombre del array que queremos recorrer)
		for (Persona p: lasPersonas) {
			System.out.println(p.getNombre() + ", " + p.getDescripcion());
		}
	}

}

//Una clase con un método abstracto debe ser una clase abstracta 
abstract class Persona {
	
	public Persona (String nom) {
		
		nombre = nom;
	}
	
	//Getter para mostrar nombre
	public String getNombre() {
		return nombre;
	}
	
	//Declaramos método abstracto que todas las clases que hereden de persona tendrás que definir la utilidad en las clases que hereden de persona
	public abstract String getDescripcion ();
	
	
	private String nombre;
} 


//Clase que hereda de la clase abstracta persona
class Empleado2 extends Persona {
	
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom);
		
		sueldo = sue;
		
		//Usamos una clase para definir una fecha en la variable calendario, dato tipo Date
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		
		//Utilizamos la herencia de GregorianCalendar, hereda de la clase Calender. 
		//Este método devuelve un dato de tipo Date, por eso almacenamos esto en una variable de tipo Dato
		altaContrato = calendario.getTime();
		
		IdSiguiente++;
		
		Id = IdSiguiente;
		
		
	}
	
	//Debemos construir en la clase Empleado() que hereda de la clase Persona() , el método abstracto que solamente construimos y lo definimos en la clase Empleado()
	public String getDescripcion() {
		
		return "Este empleado tiene un ID: " + Id + " con un sueldo: " + sueldo;
	}
	
	
	//Getter Sueldo
	public double getSueldo() {
			
		return sueldo;
	}
		
	//Getter Fecha de alta
	public Date getFechaAlta() {
		
		return altaContrato;
	}
	
	//Setter subeSueldo
	public void setSubeSueldo(double porcentaje) {
		
		double aumento = (sueldo * porcentaje) / 100; 
		
		sueldo += aumento;
		
	}
	
	public static String dameIdSiguiente () {
		
		return "El ID siguiente es: " + IdSiguiente;
	}
	
	
	private double sueldo;
	
	private Date altaContrato;
	
	private int Id;
	
	private static int IdSiguiente = 1;
	
}

class Alumno extends Persona{
	
	public Alumno(String nom, String car) {
		
		super(nom);
		carrera = car;
	}
	
	public String getDescripcion() {
		
		return "Este Alumno astá estudiando la carrera de " + carrera;
	}
	
	private String carrera;
}