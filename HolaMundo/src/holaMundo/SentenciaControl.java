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
			System.out.println("Condici�n verdadera");
		}
		else {//Es opcional
			System.out.println("Condici�n falsa");
		}
		//Sentencias anidadas
		var numero = 2;
		var numeroText = "N�mero desconocido";
		if(numero == 1) {
			numeroText = "N�mero uno";
		}
		else if(numero == 2) {
			numeroText = "N�mero dos";
		}
		else if (numero == 3) {
			numeroText = "N�mero tres";
		}
		else if (numero == 4) {
			numeroText = "N�mero cuatro";
		}
		else {
			numeroText = "N�mero no encontrado";
		}
		System.out.println("N�mero texto: " + numeroText);
	}

}
