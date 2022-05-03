/**
 * 
 */
package excepciones;

/**
 * @author srosales
 *
 */
//public class OperacionExcepcion extends Exception {//Clase personalizada de excepcion
public class OperacionExcepcion extends RuntimeException {//No es obligatorio usar el bloque try catch
	public OperacionExcepcion(String mensaje) {
		super(mensaje);
	}
}
