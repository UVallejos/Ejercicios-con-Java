package PAC_DESARROLLO_UF5;

//Excepción para indicar cuando se intenta hacer un gasto y no se tiene dinero en la cuenta
public class GastoException extends Exception{

	public GastoException () {
		//Mensaje que lanzaremos
		super("\nNo se pueden agregar gastos porque no hay ingresos");
	}
}

