/**
 * 
 */
package holaMundo;

/**
 * @author srosales
 *
 */
public class OperadorTernario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Condicion ? Codigo si es verdadero : Codigo si es falso
		var resultado = 0 > 2 ? "verdadero" : "falso" ;
		System.out.println("Resultado\t" + resultado);
		
		var numero = 8;
		resultado = (numero % 2 == 0) ? " es par" : " es impar";
		System.out.println("Resultado\t" + numero + resultado);
	}

}
