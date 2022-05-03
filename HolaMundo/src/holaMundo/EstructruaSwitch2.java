/**
 * 
 */
package holaMundo;

import java.util.Scanner;

/**
 * @author srosales
 *
 */
public class EstructruaSwitch2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner consola = new Scanner(System.in);
		System.out.println("Mes: ");
		int mes = Integer.parseInt(consola.nextLine());
		String estacion;
		switch(mes) {
			case 1: case 2: case 12:
				estacion = "Invierno";
				break;
			case 3: case 4: case 5:
				estacion = "Primavera";
				break;
			case 6: case 7: case 8:
				estacion = "Verano";
				break;
			case 9: case 10: case 11:
				estacion = "Otoño";
				break;
			default:
				estacion = "Estación desconocida";
		}
		System.out.println("Estación: " + estacion);
	}

}
