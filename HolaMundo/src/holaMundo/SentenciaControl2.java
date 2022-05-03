/**
 * 
 */
package holaMundo;

import java.util.Scanner;

/**
 * @author srosales
 *
 */
public class SentenciaControl2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner consola = new Scanner(System.in);
		System.out.println("Mes: ");
		int mes = Integer.parseInt(consola.nextLine());
		var estacion = "Estación desconocida";
		if (mes == 1 || mes == 2 || mes == 12) {
			estacion = "Invierno";
		}
		else if (mes == 3 || mes == 4 || mes == 5) {
			estacion = "Primavera";
		}
		else if (mes == 6 || mes == 7 || mes == 8) {
			estacion = "Verano";
		}
		else if (mes == 9 || mes == 10 || mes == 11) {
			estacion = "Otoño";
		}
		System.out.println("Estación: " + estacion);
	}

}
