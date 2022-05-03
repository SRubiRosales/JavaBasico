/**
 * 
 */
package mx.com.citi.ventas;

/**
 * @author srosales
 *
 */
public class Orden {
	private final int idOrden;
	private Producto productos[];//Arreglo de productos, declaracion
	private static int contadorOrdenes;
	private int contadorProductos;//Se relaciona con el arreglo de productos
	private static final int MAX_PRODUCTOS = 10;//Maximo de productos en un arreglo
	
	public Orden() {//Constructor vacio
		this.idOrden = ++Orden.contadorOrdenes;//Operador de preincremento
		this.productos = new Producto[Orden.MAX_PRODUCTOS];
	}
	
	public void agregarProducto(Producto producto) {
		if (this.contadorProductos < Orden.MAX_PRODUCTOS) {//Si no se ha superado el numero de productos
			productos[this.contadorProductos++] = producto;//Operador postincremento. Agrega el producto a la orden
		} else {
			System.out.println("Se ha superado el maximo de productos" + Orden.MAX_PRODUCTOS);
		}
	}
	public double calcularTotal() {
		double total = 0;
		for (int i = 0; i < this.contadorProductos; i++) {//Por cada elemento del arreglo Productos
			//Producto producto = this.productos[i];//Obtiene el producto que se esta iterando
			//total += producto.getPrecio();//Suma el precio del producto
			total += this.productos[i].getPrecio();
		}
		return total;
	}
	public void mostrarOrden() {
		System.out.println("Id Orden:\t\t" + this.idOrden);
		double totalOrden = this.calcularTotal();
		System.out.println("Total de la Orden:\t$" + totalOrden);
		System.out.println("Productos de la Orden:");
		for (int i = 0; i < this.contadorProductos; i++) {
			System.out.println(this.productos[i]);
		}
	}
}
