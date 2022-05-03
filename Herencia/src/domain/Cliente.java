/**
 * 
 */
package domain;

import java.util.Date;

/**
 * @author srosales
 *
 */
public class Cliente extends Persona {
	private int idCliente;
	private Date fecha;
	private boolean vip;
	private static int contadorCliente;
	/**
	 * @param nombre
	 */
	public Cliente(String nombre, char genero, int edad, String direccion, Date fecha, boolean vip) {
		super(nombre, genero, edad, direccion);//Debe ser la primer línea del constructor
		this.fecha = fecha;
		this.vip = vip;
		this.idCliente = ++Cliente.contadorCliente;//Recomendable usar el nombre de la clase en atributos estaticos
	}
	public int getIdCliente() {
		return idCliente;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public boolean isVip() {
		return vip;
	}
	public void setVip(boolean vip) {
		this.vip = vip;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [idCliente=");
		builder.append(idCliente);
		builder.append(", fecha=");
		builder.append(fecha);
		builder.append(", vip=");
		builder.append(vip);
		builder.append(", Persona=");
		builder.append(super.toString());//Imprime todos los valores de la clase Padre
		builder.append("]");
		return builder.toString();
	}
	
}
