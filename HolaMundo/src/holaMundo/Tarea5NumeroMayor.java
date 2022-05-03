/**
 * 
 */
package holaMundo;

import java.util.Scanner;

/**
 * @author srosales
 *
 */
public class Tarea5NumeroMayor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el numero1: ");
        int numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el numero2: ");
        int numero2 = Integer.parseInt(consola.nextLine());
        if (numero1 > numero2)
        	System.out.println("El numero mayor es:\n" + numero1);
        else
        	System.out.println("El numero mayor es:\n" + numero2);
	}

}
