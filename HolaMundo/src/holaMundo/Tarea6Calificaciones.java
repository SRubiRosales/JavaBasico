/**
 * 
 */
package holaMundo;

import java.util.Scanner;

/**
 * @author srosales
 *
 */
public class Tarea6Calificaciones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 double calif;
		 System.out.println("Ingresa una calificación entre 1 y 10: ");
		 calif = scan.nextDouble();
		 if (calif >= 9 && calif <= 10) {
			 System.out.println("A");
		 } else if (calif >= 8 && calif < 9) {
			 System.out.println("B");
		 } else if (calif >= 7 && calif < 8) {
			 System.out.println("C");
		 } else if (calif >= 6 && calif < 7) {
			 System.out.println("D");
		 } else if (calif >= 0 && calif < 6) {
			 System.out.println("F");
		 } else {
			 System.out.println("Calificación inválida");
		 }
	}

}
