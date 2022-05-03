/**
 * 
 */
package holaMundo;

/**
 * @author srosales
 *
 */
public class PrecedenciaOperadores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var x = 5;
		var y = 10;
		var z = ++x + y--;//Primero los operadores unarios y luego el aritmetico
		System.out.println("x\t\t" + x);
		System.out.println("y\t\t" + y);
		System.out.println("Resultado\t" + z);
		
		var resultado = 4 + 5 * 6 / 3;//Primero multiplicacion y division y luego suma
		System.out.println("Resultado\t" + resultado);
		resultado = (4 + 5) * 6 / 3;//Primero dentro del parentesis y luego multiplicacion y division
		System.out.println("Resultado\t" + resultado);
	}

}
