/**
 * 
 */
package aritmetica;

import excepciones.OperacionExcepcion;

/**
 * @author srosales
 *
 */
public class Aritmetica {
	public static int division(int numerador, int denominador) throws OperacionExcepcion {//Posiblemente va arrojar una excepcion
		if(denominador == 0) {
			throw new OperacionExcepcion("Division entre cero");
		}
		return numerador/denominador;
	}
}
