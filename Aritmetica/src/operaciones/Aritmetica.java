/**
 * 
 */
package operaciones;

/**
 * @author srosales
 *
 */
public class Aritmetica {
	//Atributos
	int a;
	int b;
	
	//Constructor
	public Aritmetica() {
		System.out.println("Ejecutando constructor");
	}
	
	//Constructor con sobrecarga
	public Aritmetica(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Ejecutando constructor con sobrecarga");
	}
	
	//Métodos
	public void sumar() {
		int resultado = a + b;
		System.out.println("Resultado de la suma " +  resultado);
	}
	public int sumarConRetorno() {
		return a + b;
	}
	
	public int sumarConArgumentos(int a, int b) {
		this.a = a;
		this.b = b;
		return a + b;
	}
}
