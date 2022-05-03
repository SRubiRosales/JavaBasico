/**
 * 
 */
package holaMundo;

/**
 * @author srosales
 *
 */
public class OperadoresAsignacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3, b = 2;
		int c = a + 5 - b;
		System.out.println("Resultado " + c);
		a += 1;//Operador de composicion; a se incrementa en 1
		System.out.println("Variable a " + a);
		a += 3;//Operador de composicion; a se incrementa en 3
		System.out.println("Variable a " + a);
		a -= 2;//Operador de composicion; a se disminuye en 2
		System.out.println("Variable a " + a);
		a *= 2;//Operador de composicion; a se multiplica por 2
		System.out.println("Variable a " + a);
		a /= 4;//Operador de composicion; a divide entre 4
		System.out.println("Variable a " + a);
		a %= 2;//Operador de composicion; modulo de a entre 2
		System.out.println("Variable a " + a);
	}

}
