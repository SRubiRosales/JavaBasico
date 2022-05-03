/**
 * 
 */
package caja;

/**
 * @author srosales
 *
 */
public class PruebaCaja {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caja caja = new Caja();
		caja.setAncho(3);
		caja.setAlto(2);
		caja.setProfundidad(6);
		System.out.println("Volumen de la caja: " + caja.volumen());
	}

}
