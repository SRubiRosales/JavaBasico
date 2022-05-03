/**
 * 
 */
package holaMundo;

/**
 * @author srosales
 *
 */
public class EstructuraSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var numero = 2;
		var numeroTexto = "Número desconocido";
		switch(numero) {
			case 1:
				numeroTexto = "Número uno";
				break;
			case 2:
				numeroTexto = "Número dos";
				break;
			case 3:
				numeroTexto = "Número tres";
				break;
			case 4:
				numeroTexto = "Número cuatro";
				break;
			default:
				numeroTexto = "Número no encontrado";
		}
		System.out.println("Número texto: " + numeroTexto);
	}

}
