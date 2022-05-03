/**
 * 
 */
package clases;

/**
 * @author srosales
 *
 */
public class PruebaPersona {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person persona1 = new Person();//Definir variable e inicializarla
		persona1.nombre = "Sharon";//Accede al atributo de la clase y la modifica
		persona1.apellido = "Rosales";
		persona1.desplegarInformacion();//Invoca un método de la clase
		Person persona2 = new Person();//Nuevo objeto. Reserva memoria
		//Imprime la dirección de memoria donde está almacenado el objeto
		System.out.println("Persona 1 " + persona1);
		System.out.println("Persona 2 " + persona2);
		persona2.desplegarInformacion();//Imprime datos nulos de los atributos de la persona2
		persona2.nombre = "Rubí";
		persona2.apellido = "Sánchez";
		persona2.desplegarInformacion();
	}

}
