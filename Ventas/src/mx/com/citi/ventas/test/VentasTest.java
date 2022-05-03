/**
 * 
 */
package mx.com.citi.ventas.test;

import mx.com.citi.ventas.*;

/**
 * @author srosales
 *
 */
public class VentasTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Producto producto1 = new Producto("Blusa", 50.00);
		Producto producto2 = new Producto("Pantalon", 100.00);
		Orden orden1 = new Orden();
		orden1.mostrarOrden();//Muestra orden vacia
		orden1.agregarProducto(producto1);
		orden1.agregarProducto(producto2);
		orden1.mostrarOrden();//Muestra orden con dos productos
		orden1.agregarProducto(new Producto("Falda", 119.99));
		orden1.mostrarOrden();//Muestra orden con tres productos
	}

}
