/**
 * 
 */
package test;

import domain.Persona;

/**
 * @author srosales
 *
 */
public class TestFinal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int miVariable = 10;//Una vez asigando el valor, ya no puede modificarse
		System.out.println("Mi variable: " + miVariable);
		//Persona.MI_CONSTANTE = 3;//No puede modificarse
		System.out.println("Mi constante: " + Persona.MI_CONSTANTE);
		
		final Persona persona1 = new Persona();//No puede cambiar su referencia en memoria
		persona1.setNombre("Sharon");//Si se pueden modificar los atributos
		System.out.println("Nombre de Persona1 " + persona1.getNombre());
		persona1.setNombre("Rubí");//Si se pueden modificar los atributos
		System.out.println("Nombre de Persona1 " + persona1.getNombre());
	}

}
