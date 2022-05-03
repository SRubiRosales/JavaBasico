/**
 * 
 */
package dominio;

/**
 * @author srosales
 *
 */
public class Persona {
	//Atributos de la clase Persona
	private String nombre;
	private String apellido;
	private double sueldo;
	private boolean eliminado;
	//Constructor para inicializar el objeto
	public Persona(String nombre, String apellido, double sueldo, boolean eliminado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldo = sueldo;
		this.eliminado = eliminado;
	}
	//Getters y setters
	public String getNombre() {//Obtiene el atributo de nombre
		return nombre;
	}
	//Modifica el atributo de nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public boolean isEliminado() {//Is en lugar de get para tipo boolean
		return eliminado;
	}

	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	//Metodo toString convierte a una cadena el estado del objeto
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", sueldo=" + sueldo + ", eliminado="
				+ eliminado + "]";
	}
}
