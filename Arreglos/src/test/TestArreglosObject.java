/**
 * 
 */
package test;

import domain.Persona;

/**
 * @author srosales
 *
 */
public class TestArreglosObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Persona personas[] = new Persona[2];//Arreglo de la clase Persona con dos elementos
		personas[0] = new Persona("Sharon");
		personas[1] = new Persona("Rubi");
		System.out.println("Persona [0]" + personas[0]);
		System.out.println("Persona [1]" + personas[1]);
		for(int contador = 0; contador < personas.length; contador++) {
			System.out.println("Persona " + contador + ": " + personas[contador]);
		}
		String frutas[] = {"Guineo", "Mango", "Guayaba", "Rambutan"};//Sintaxis resumida
		for(int contador = 0; contador < frutas.length; contador++) {
			System.out.println("Frutas " + contador + ": " + frutas[contador]);
		}
	}

}