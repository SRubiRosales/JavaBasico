/**
 * 
 */
package holaMundo;

/**
 * @author srosales
 *
 */
public class Ciclos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ciclo while
		var contador = 0;
		while(contador < 3) {
			System.out.println("Contador while = " + contador);
			contador++;
		}
		// Ciclo do - while
		var contador2 = 4;
		do {
			System.out.println("Contador do while = " + contador2);
			contador2++;
		}
		while(contador2 < 3);
		// Ciclo for
		for(var contador3 = 0; contador3 < 3; contador3++) {
			System.out.println("Contador for = " + contador3);
		}
		// Break
		for(var contador4 = 0; contador4 < 3; contador4++) {
			if (contador4 % 2 == 0) {
				System.out.println("Numero par = " + contador4);
				break;//Termina el ciclo cuando encuentra el primer número par
			}
		}
		// Continue
		for(var contador5 = 0; contador5 < 3; contador5++) {
			if (contador5 % 2 != 0) {//Si no es número par
				continue;//Omite lo demás del ciclo y pasa a la siguiente iteración
			}
			System.out.println("Numero par = " + contador5);
		}
		// Continue con etiqueta
		etiqueta:
		for(var contador5 = 0; contador5 < 3; contador5++) {
			if (contador5 % 2 != 0) {//Si no es número par
				continue etiqueta;//Omite lo demás del ciclo y pasa a la siguiente iteración
			}
			System.out.println("Numero par = " + contador5);
		}
	}

}
