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
		var numeroTexto = "N�mero desconocido";
		switch(numero) {
			case 1:
				numeroTexto = "N�mero uno";
				break;
			case 2:
				numeroTexto = "N�mero dos";
				break;
			case 3:
				numeroTexto = "N�mero tres";
				break;
			case 4:
				numeroTexto = "N�mero cuatro";
				break;
			default:
				numeroTexto = "N�mero no encontrado";
		}
		System.out.println("N�mero texto: " + numeroTexto);
	}

}
