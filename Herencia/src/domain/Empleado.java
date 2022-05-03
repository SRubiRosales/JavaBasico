/**
 * 
 */
package domain;

/**
 * @author srosales
 *
 */
public class Empleado extends Persona {//Herencia simple de la clase Persona
	private int idEmpleado;
	private double sueldo;
	private static int contadorEmpleado;//Incrementa en uno cada vez que se instancia un empleado
	
	public Empleado() {
		//super();
		this.idEmpleado = ++Empleado.contadorEmpleado;
	}
	/**
	 * Cosntructor con los dos argumentos de la clase hija
	 * @param idEmpleado
	 * @param sueldo
	 */
	public Empleado(String nombre, double sueldo) {
		//super(nombre);//Llama al constructor de la clase padre
		this();//Llama al constructor vacio y asigna el idEmpleado
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public double getSueldo() {
		return this.sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [idEmpleado=");//Otra forma de concatenar
		builder.append(idEmpleado);
		builder.append(", sueldo=");
		builder.append(sueldo);
		builder.append(", Persona=");
		builder.append(super.toString());//Super accede a la informacion de la clase Padre
		builder.append("]");
		return builder.toString();
	}
}
