package PAC_DESARROLLO_UF5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Declaramos variable Scanner para gestionar la entrada de texto por consola
		Scanner entrada = new Scanner(System.in);
		
		//Instanciammos objeto usuario1 para pasarlo por parametros a los métodos que gestionan la creacción del objeto
		Usuario usuario1 = new Usuario();
		
		//Instanciammos (Creamos) objeto cuenta con el return de un método que ya ha instanciado a usuario1
		Cuenta cuenta = new Cuenta(pedirDatos(usuario1,entrada));
		
		//Bucle para presentar el menú de opciones del programa y seleccionar una opción.
		boolean comp2 = true;
		while(comp2){
					
			
			String opcion = entrada.nextLine();
			switch (opcion) {
				
			case "1":
				//Método que gestiona el introducir gastos
				opcion1(entrada, cuenta);
				break;
				
			case "2":
				//Método que gestiona el introducir ingresos
				opcion2(entrada, cuenta);
				break;	
	
			case "3":
				//Método que muestra todos los gastos
				opcion3(cuenta);
				break;
					
			case "4":
				//Método que muestra todos los ingresos
				opcion4(cuenta);
				break;
				
			case "5":
				//Método que muestra el saldo de la cuenta
				opcion5(cuenta);
				break;
				
			case "0":
				//Método que sale del bucle
				if (opcion0(cuenta) == false) {
					comp2 = false;
				}
				break;
					
				}
			 if (comp2 == true) {
				 muestraMenu();
			 }
			}
			
		}
		
		//Método que pide los datos de usuario1, instancia el objeto usuario1 con los getters y setters de la clase. Luego retorna un objeto de tipo Usuario usuario1 para pasarlo al objeto cuenta
		public static Usuario pedirDatos(Usuario usuario1, Scanner entrada){
			boolean comp1 = true;
			
			System.out.println("Introduce el Nombre del Usuario:");
			usuario1.setNombre(entrada.nextLine());
				
			System.out.println("Introduce la edad del Usuario:");
			usuario1.setEdad(Integer.parseInt(entrada.nextLine()));
			
			while (comp1){	
				System.out.println("Introduce el DNI por favor:");
				if(usuario1.setDNI(entrada.next())) {
					System.out.println("Usuario creado correctamente");
					break;
					
				}
				else {
					System.out.println("Introduce el DNI del usuario valido");
				}	
				
			}
			
			return usuario1;
		}
		
		//Método que puestra el menú de opciones
		public static void muestraMenu() {
			System.out.println("1 Introduce un nuevo gasto");
			System.out.println("2 Introduce un nuevo ingreso");
			System.out.println("3 Mostrar Gastos");
			System.out.println("4 Mostrar Ingresos");
			System.out.println("5 Mostrar saldo");
			System.out.println("0 Salir");
		}
		
		//Método que gestiona el introducir gastos
		public static void opcion1(Scanner entrada, Cuenta cuenta) {
			System.out.println("Introduce una descripción:");
			String descriptionGasto = entrada.nextLine();
			
			System.out.println("Introduce la cantidad:");
			double cantidadGasto = Double.parseDouble(entrada.nextLine());
				
			cuenta.addGastos(descriptionGasto, cantidadGasto);
				
			System.out.println("Saldo Restante: "+ String.format("%.2f", cuenta.getSaldo()) + "€");
			
		}
		
		//Método que gestiona el introducir ingresos
		public static void opcion2(Scanner entrada2, Cuenta cuenta2) {
			System.out.println("Introduce una descripción:");
			String descriptionIngreso = entrada2.nextLine();
	
			System.out.println("Introduce la cantidad:");
			double cantidadIngreso = Double.parseDouble(entrada2.nextLine());
				
			cuenta2.addIngresos(descriptionIngreso, cantidadIngreso);
				
			System.out.println("Saldo Restante: "+ String.format("%.2f", cuenta2.getSaldo())+ "€");
			
		}
		
		//Método que muestra todos los gastos
		public static void opcion3(Cuenta cuenta3) {
			for (Gasto Gasto:cuenta3.getGastos()) {
				 System.out.println(Gasto.toString() + "€");
			}
		}
		
		//Método que muestra todos los ingresos
		public static void opcion4(Cuenta cuenta4) {
			for (Ingreso Ingreso:cuenta4.getIngresos()) {
				 System.out.println(Ingreso.toString() + "€");
			}
		}
		
		//Método que muestra el saldo de la cuenta
		public static void opcion5(Cuenta cuenta5) {
			System.out.println("El saldo actual de la cuenta es: " + String.format("%.2f", cuenta5.getSaldo()) + "€");
		}
		
		//Método que sale del bucle
		public static boolean opcion0(Cuenta cuenta0) {
			System.out.println("Fin del programa.\n"
					+  "Gracias por utilizar la aplicación de M03B en el curso 1s2223."	);
			return false;
		}

	}


