/**
 * 
 */
package pasoPorReferencia;

import clases.Person;

/**
 * @author srosales
 *
 */
public class PasoPorReferencia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person persona1 = new Person();
		persona1.nombre = "Juan";
		System.out.println("NOMBRE " + persona1.nombre);
		persona1 = cambiaValor(persona1);//Paso por referencia
		System.out.println("NOMBRE NUEVO " + persona1.nombre);
	}
	
	public static Person cambiaValor(Person persona) {
		persona.nombre = "Karla";
		return persona;
	}

}
