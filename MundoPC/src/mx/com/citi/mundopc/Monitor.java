/**
 * 
 */
package mx.com.citi.mundopc;

/**
 * @author srosales
 *
 */
public class Monitor {
	private final int idMonitor;
	private String marca;
	private double tamanio;
	private static int contadorMonitores;
	public Monitor() {
		this.idMonitor = ++Monitor.contadorMonitores;
	}
	public Monitor(String marca, double tamanio) {
		this();
		this.marca = marca;
		this.tamanio = tamanio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getTamanio() {
		return tamanio;
	}
	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}
	public int getIdMonitor() {
		return idMonitor;
	}
	@Override
	public String toString() {
		return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + "]";
	}
}
