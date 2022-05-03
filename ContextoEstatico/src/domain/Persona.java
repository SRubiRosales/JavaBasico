/**
 * 
 */
package domain;

/**
 * @author srosales
 *
 */
public class Persona {
	private int idPersona;
	private String nombre;
	private static int contadorPersonas;//Se asocia a la clase, no a los objetos
	
	//Constructor con un argumento (el id es autoincrementable)
	public Persona(String nombre) {
		this.nombre = nombre;
		//Incrementar el contador por cada objeto nuevo
		Persona.contadorPersonas++;//Se accede a la variable desde la clase, no desde el objeto
		this.idPersona = Persona.contadorPersonas;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int getContadorPersonas() {
		return contadorPersonas;
	}

	public static void setContadorPersonas(int contadorPersonas) {
		Persona.contadorPersonas = contadorPersonas;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + "]";
	}
}
