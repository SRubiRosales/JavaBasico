/**
 * 
 */
package operaciones;

/**
 * @author srosales
 *
 */
public class PruebaAritmetica {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Variables locales
		var a = 0;//Var solo puede usarse para definir una variable local
		var b = 2;
		miMetodo();
		Aritmetica aritmetica1 = new Aritmetica();
		aritmetica1.a = 3;
		aritmetica1.b = 2;
		aritmetica1.sumar();
		var resultado = aritmetica1.sumarConRetorno();
		System.out.println("Resultado desde la prueba " + resultado);
		resultado = aritmetica1.sumarConArgumentos(5, 8);
		System.out.println("Resultado de suma con argumentos " + resultado);
		Aritmetica aritmetica2 = new Aritmetica(2, 9);
		System.out.println("Aritmetica 2, a = " + aritmetica2.a);
		System.out.println("Aritmetica 2, b = " + aritmetica2.b);
	}
	
	public static void miMetodo() {
		//Variables locales
		var a = 10;//Variable fuera del alcance del método main
	}

}
