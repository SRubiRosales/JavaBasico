/**
 * 
 */
package pasoPorValor;

/**
 * @author srosales
 *
 */
public class PasoPorValor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		System.out.println("x = " + x);
		cambioValor(x);//Enviamos una copia del valor primitivo
		System.out.println("Nuevo valor = " + x);//No fue modificado el de x
	}
	
	public static void cambioValor(int arg1) {
		System.out.println("arg1 = " + arg1);
		arg1 = 15;
	}

}
