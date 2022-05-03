package domain;

/**
 * @author srosales
 *
 */
//public final class Persona {//Si tiene "final" no puede tener clases hijas
public class Persona {
	public final static int MI_CONSTANTE = 1;//Constante
	
	private String nombre;
	
	public final void imprimir() {
		System.out.println("Metodo imprimir");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
