/**
 * 
 */
package palabrathis;

/**
 * @author srosales
 *
 */
public class PalabraThis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona = new Persona("Juan", "Pérez");
		System.out.println("persona = " + persona);
		System.out.println("persona = " + persona.nombre);
		System.out.println("persona = " + persona.apellido);
	}

}

class Persona {//Solo puede utilizarse dentro de este paquete
	String nombre;
	String apellido;
	Persona(String nombre, String apellido) {//No agrega el constructor vacio por default
		//super(); Llamada implícita al constructor de la clase padre (Object)
		this.nombre = nombre;
		this.apellido = apellido;
		System.out.println("Objeto Persona usando this: " + this);
		new Imprimir().imprimir(this);
	}
}

class Imprimir {
	public void imprimir(Persona persona) {
		System.out.println("Persona desde imprimir " + persona);//Imprime la referencia
		System.out.println("Impresion del objeto actual this " + this);//Imprime el objeto actual
	}
}
