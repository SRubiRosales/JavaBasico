/**
 * 
 */
package domain;

/**
 * @author srosales
 *
 */
public class Persona {
	private String nombre;

	/**
	 * @param nombre
	 */
	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]" + ", " + super.toString();
	}
}
