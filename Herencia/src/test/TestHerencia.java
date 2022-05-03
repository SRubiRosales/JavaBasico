/**
 * 
 */
package test;

import java.util.Date;

import domain.Cliente;
import domain.Empleado;

/**
 * @author srosales
 *
 */
public class TestHerencia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Sharon", 10.0);
		System.out.println(empleado1);//Imprime info de la clase persona porque la clase Empleado hereda de Persona
		
		var fecha = new Date();
		Cliente cliente1 = new Cliente("Rubí", 'F', 23, "Mi casa", fecha, true);
		System.out.println(cliente1);
	}

}
