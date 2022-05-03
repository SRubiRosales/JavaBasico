/**
 * 
 */
package test;

import dominio.Persona;//Importa la clase Persona. Se carga en memoria hasta que se inicializa

/**
 * @author srosales
 *
 */
public class PersonaPrueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona("Sharon", "Rosales", 2000.00, false);
		System.out.println("Persona 1, nombre original: " + persona1.getNombre());
		System.out.println(persona1);//Llama automaticamente al metodo toString
		persona1.setNombre("Rubí");//Modifica el nombre
		//persona1.nombre = "Rubí"; El atributo es privado, no puede modificarse de esta forma
		//Recupera la información de la persona1 de manera individual
		/*System.out.println("Persona 1, nombre con cambio:\t" + persona1.getNombre());
		System.out.println("Persona 1, apellido:\t" + persona1.getApellido());
		System.out.println("Persona 1, sueldo:\t" + persona1.getSueldo());
		System.out.println("Persona 1, eliminado:\t" + persona1.isEliminado());*/
		System.out.println("Persona 1 " + persona1.toString());
	}

}
