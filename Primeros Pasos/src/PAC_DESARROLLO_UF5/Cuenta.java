package PAC_DESARROLLO_UF5;

import java.util.List;
import java.util.ArrayList;

public class Cuenta{
	
	//Variables de la clase cuenta
	private double saldo;
	private Usuario usuario; 
	private List<Gasto> gastos;
	private List<Ingreso> ingresos;
	
	//Contructor de la clase cuenta
	public Cuenta(Usuario usuario) {
		
		this.usuario = usuario;
		this.saldo = 0.0;
	}
	
	//Métodos Getters y Setters
	public double getSaldo(){
		
		return this.saldo ;
	}
	
	public void setSaldo(double saldo){
		
		this.saldo = saldo;
	}
	
	 public Usuario getUsuario(){
		 
		 return this.usuario;
	 }
	 
	 public void setUsuario(Usuario usuario){
		 
		 this.usuario = usuario;
	 }
	 
	 //Método para agregar ingresos a la List<Ingreso> 
	 public double addIngresos(String description, double cantidad){
		 ingresos = new ArrayList<>();
		 Ingreso ingreso = new Ingreso(cantidad,description);
		 this.ingresos.add(ingreso);		 
		 return this.saldo += cantidad;
	 }
	 
	//Método para agregar ingresos a la List<Gasto> y controlamos que no podemos gastar cuando no tenemos dinero
	 public double addGastos(String description, double cantidad){
		 gastos = new ArrayList<>();
		 		 
		 try {
			 this.saldo -= cantidad;
			 if(this.getSaldo() < 0){
				 this.saldo = 0.0;
				 throw new GastoException();	 
			 }
		 }catch(GastoException error){
			 System.out.println(error.getMessage());
			 return this.saldo;
		 }
		 this.gastos.add(new Gasto(cantidad,description));
		 
		 return this.saldo;


		 
	 }
	 
	 //Métodos Getter para obtener las List<>
	 public List<Ingreso> getIngresos(){
		 
		 return this.ingresos;
		 
		 
	 }
	 
	 public List<Gasto> getGastos(){
		 
		 return this.gastos;
	 }

	 
	//Sobre escritura del método
	@Override
	public String toString() {
			
		return   "Usuario: " +this.usuario.toString() + "\n" +
				"Saldo: " + this.saldo;
				
		}
	
}
