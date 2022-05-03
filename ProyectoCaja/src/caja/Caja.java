/**
 * 
 */
package caja;

/**
 * @author srosales
 *
 */
public class Caja {
	static int ancho;
	static int alto;
	static int profundidad;
	
	//Constructor sin argumentos
	public Caja() {
		System.out.println("Ejecutando constructor");
	}
	//Constructor con sobrecarga
	public Caja(int ancho, int alto, int profundidad) {
		this.ancho = ancho;
		this.alto = alto;
		this.profundidad = profundidad;
		System.out.println("Ejecutando constructor con sobrecarga");
	}
	public static int volumen() {
		int volumen = ancho * alto * profundidad;
		return volumen;
	}
	public static int getAncho() {
		return ancho;
	}
	public static void setAncho(int ancho) {
		Caja.ancho = ancho;
	}
	public static int getAlto() {
		return alto;
	}
	public static void setAlto(int alto) {
		Caja.alto = alto;
	}
	public static int getProfundidad() {
		return profundidad;
	}
	public static void setProfundidad(int profundidad) {
		Caja.profundidad = profundidad;
	}
}
