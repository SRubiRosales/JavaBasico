/**
 * 
 */
package holaMundo;

import java.util.Scanner;

/**
 * @author srosales
 *
 */
public class Tarea4Rectangulo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner consola = new Scanner(System.in);
		System.out.println("Base (b): ");
		var base = Integer.parseInt(consola.nextLine());
		System.out.println("Altura (h): ");
		var altura = Integer.parseInt(consola.nextLine());
		System.out.println("Area del rectangulo b x h: " + base * altura);
		System.out.println("Perimetro del rectangulo: " + 2 * (base + altura));
	}

}
