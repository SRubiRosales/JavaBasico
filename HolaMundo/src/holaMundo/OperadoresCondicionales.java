/**
 * 
 */
package holaMundo;

/**
 * @author srosales
 *
 */
public class OperadoresCondicionales {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var a = 19;
		var min = 0;
		var max = 10;
		//Operador and &&
		var resultado = a >= min && a <= max;//Es verdadero si ambos lados de la expresiono son true
		if (resultado){
			System.out.println("Dentro de rango");
		}
		else {
			System.out.println("Fuera de rango");
		}
		//Operador or ||
		var vacaciones = true;
		var diaDescanso = false;
		if (vacaciones || diaDescanso) {
			System.out.println("El padre puede asistir al juego de su hijo");
		}
		else {
			System.out.println("El padre esta ocupado");
		}
	}

}
