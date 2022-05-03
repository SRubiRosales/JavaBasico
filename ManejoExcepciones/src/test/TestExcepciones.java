/**
 * 
 */
package test;

import aritmetica.Aritmetica;
import excepciones.OperacionExcepcion;

/**
 * @author srosales
 *
 */
public class TestExcepciones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int resultado = 0;//Variable definida antes de bloque try - catch
		try {
			resultado = 10/0;//Division por cero
		} catch (Exception e) {
			e.printStackTrace();//Imprime la pila de excepciones
		}
		System.out.println(resultado);
		//Excepcion con clase personalizada
		try {
			resultado = Aritmetica.division(10, 0);
		} catch (OperacionExcepcion e) {
			System.out.println("Ocurrio un error de tipo OperacionExcepcion");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Ocurrio un error de tipo Excepcion");
			e.printStackTrace();//Imprime la pila de excepciones
		} finally { //Se ejecuta siempre, aunque no se produzca una excepcion
			System.out.println("Se realizó la division entre cero");
		}
		resultado = Aritmetica.division(10, 0);//No se procesa la excepcion (RuntimeException)
	}

}
