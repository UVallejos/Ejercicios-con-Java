package poo;
import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//Estado inicial de los objetos
		Empleado empleado1 = new Empleado("Ulises Vallejos", 85000, 1990, 12, 17);
		
		Empleado empleado2 = new Empleado("Cristian Barbato", 95000, 1995, 06, 02);
		
		Empleado empleado3 = new Empleado("Maria Martín", 105000, 2022, 03, 15);
		
		
		//Cambiamos el estado inicial de la instancia
		empleado1.setSubeSueldo(5);
		empleado2.setSubeSueldo(5);
		empleado3.setSubeSueldo(5);
		
		System.out.println("Nombre: " + empleado1.getNombre() + ", Sueljdo: " + empleado1.getSueldo()
							+ " Fecha de Alta: " + empleado1.getFechaAlta());
		
		System.out.println("Nombre: " + empleado2.getNombre() + ", Sueljdo: " + empleado2.getSueldo()
		+ " Fecha de Alta: " + empleado2.getFechaAlta());
		
		System.out.println("Nombre: " + empleado3.getNombre() + ", Sueljdo: " + empleado3.getSueldo()
		+ " Fecha de Alta: " + empleado3.getFechaAlta());
		*/
		
		//Forma más optimizada de instanciar los objetos en un array y recorrerlo en un bucle ford normal y un bucle ford mejorado
		
		
		//Polimorfismo
		Jefatura jefe_RRHH = new Jefatura("Lorena Barbato", 55000, 206,9,25);
		
		jefe_RRHH.estableceIncentivo(2570);
		
		Empleado[] misEmpleados = new Empleado[6];
		
		misEmpleados[0] = new Empleado("Ulises Vallejos", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Ana López", 95000, 1995, 6, 2);
		misEmpleados[2] = new Empleado("Maria Martín", 105000, 2022, 03, 15);
		misEmpleados[3] = new Empleado("Maria Martín");
		misEmpleados[4] = jefe_RRHH; //Polimorfismo en acción. Principio de sustitución.
		misEmpleados[5] = new Jefatura("Jesus", 95000, 1999,5,26);
		
		//Casting de objetos, le decimos que lo que se encuentra almacenado en misEmpleados[5] que es una lista de clase Empleado
		// en un objeto de tipo jefatura
		Jefatura jefa_Finanzas = (Jefatura) misEmpleados[5];
		
		//Podemos utilizar los métodos porque ya hecho la reconversión del objeto de tipo Empleado a tipo Jefatura
		jefa_Finanzas.estableceIncentivo(55000);

		
		/*
		 * bucle ford normal
		for (int i = 0; i < 3; i++) {
			misEmpleados[i].setSubeSueldo(5);
		}
		*/
		
		//bucle ford mejorado
		for (Empleado e: misEmpleados) {
			e.setSubeSueldo(5);
		}
		
		/*
		for (int i = 0; i<3; i++) {
			System.out.println("Nombre: " + misEmpleados[i].getNombre() + ", Sueldo: " + misEmpleados[i].getSueldo()
								+ " Fecha de Alta: " + misEmpleados[i].getFechaAlta());
		}*/
		
		//bucle ford mejorado
		for (Empleado e: misEmpleados) {
			System.out.println("Nombre: " + e.getNombre() + ", Sueldo: " + e.getSueldo()
					+ " Fecha de Alta: " + e.getFechaAlta());
		}
		
	}

}


class Empleado {
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
		nombre = nom;
		
		sueldo = sue;
		
		//Usamos una clase para definir una fecha en la variable calendario, dato tipo Date
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		
		//Utilizamos la herencia de GregorianCalendar, hereda de la clase Calender. 
		//Este método devuelve un dato de tipo Date, por eso almacenamos esto en una variable de tipo Dato
		altaContrato = calendario.getTime();
		
		Id = IdSiguiente;
		
		IdSiguiente++;
		
	}
	//Sobrecarga de constructores, podemos tener tantos constyructores como queramos, siempre que no compartan el mismo número de argunmentos que necesitan para instanciarse.
	
	public Empleado(String nom) {
		//Le pasamos parametros por defecto y que crea la  instancia del objeto con los datos por defecto.
		this(nom, 30000, 2000,01,01);
	}
	
	
	//Getter Nombre
	public String getNombre() {
		
		return nombre;
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
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	private int Id;
	
	private static int IdSiguiente = 1;
	
}

//Declarar una clase como final sirve para evitar que otra clase pueda heredar de esta.
//final class Jefatura extends Empleado

class Jefatura extends Empleado {
	
	public Jefatura (String nom, double sue, int agno, int mes, int dia) {
		
		//Le decimos que ocupe el constructor de la superclase Empleado
		super(nom, sue, agno, mes, dia);
	}
	
	public void estableceIncentivo(double b) {
		
		incentivo = b;
	}
	
	public double getSueldo() {
		//Le decimos que almacene al valor por defecto de getSueldo()
		double sueldoJefe = super.getSueldo();
		
		return sueldoJefe + incentivo;
	}

	private double incentivo;
	
}

/*
class Director extends Jefatura {
	
	public Director (String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);
	}
}
*/