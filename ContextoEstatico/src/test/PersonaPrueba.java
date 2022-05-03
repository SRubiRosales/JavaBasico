/**
 * 
 */
package test;

import domain.Persona;

/**
 * @author srosales
 *
 */
public class PersonaPrueba {
	
	private int contador;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Persona persona1 = new Persona("Sharon");
		//System.out.println("Persona 1: " + persona1);
		
		Persona persona2 = new Persona("Rubí");
		//System.out.println("Persona 2: " + persona2);
		imprimir(persona1);
		imprimir(persona2);
	}
	//El orden de los modificadores no importa
	public static void imprimir(Persona persona) {//Es estatico porque se llama desde un metodo estatico
		System.out.println(persona);
	}
	
	public int getContador() {
		imprimir(new Persona("Alguien"));
		return this.contador;
	}

}
