/**
 * 
 */
package domain;

/**
 * @author srosales
 *
 */
public class Persona {
	protected String nombre;//El modificador protected hereda los atributos a las clases hijas
	protected char genero;
	protected int edad;
	protected String direccion;
	//Los constructores no se heredan
	public Persona() {
		//Constructor vacio
	}
	public Persona(String nombre) {
		this.nombre = nombre;//Constructor solo con un atributo
	}
	public Persona(String nombre, char genero, int edad, String direccion) {
		super();//Constructor con todos los atributos
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.direccion = direccion;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public char getGenero() {
		return this.genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/*@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + "]";
	}*/
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nombre=");
		builder.append(nombre);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", ");
		builder.append(super.toString());//Imprime la direccion de memoria del objeto
		builder.append("]");
		return builder.toString();
	}
	
}
