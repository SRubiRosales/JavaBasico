/**
 * 
 */
package holaMundo;

/**
 * @author srosales
 *
 */
public class SentenciaControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var condicion = true;
		if (condicion) {
			System.out.println("Condición verdadera");
		}
		else {//Es opcional
			System.out.println("Condición falsa");
		}
		//Sentencias anidadas
		var numero = 2;
		var numeroText = "Número desconocido";
		if(numero == 1) {
			numeroText = "Número uno";
		}
		else if(numero == 2) {
			numeroText = "Número dos";
		}
		else if (numero == 3) {
			numeroText = "Número tres";
		}
		else if (numero == 4) {
			numeroText = "Número cuatro";
		}
		else {
			numeroText = "Número no encontrado";
		}
		System.out.println("Número texto: " + numeroText);
	}

}
