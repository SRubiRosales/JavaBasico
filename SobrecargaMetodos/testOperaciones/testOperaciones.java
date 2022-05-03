import operaciones.Operaciones;

/**
 * 
 */

/**
 * @author srosales
 *
 */
public class testOperaciones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		var resultado = Operaciones.sumar(5, 3);//Operacion sumar con argumentos enteros
		System.out.println("Resultado de metodo int " + resultado);
		var resultadoDouble = Operaciones.sumar(2.5, 2.5);//Operacion sumar con argumentos double
		System.out.println("Resultado de metodo double " + resultadoDouble);
		var resultado3 = Operaciones.sumar(3, 5L);//El tipo double soporta el tipo long y el tipo int
		System.out.println("Resultado de metodo double " + resultado3);//La suma es con la funcion de argumentos double
	}

}
