/**
 * 
 */
package test;

/**
 * @author srosales
 *
 */
public class TestArreglos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int edades[] = new int[3];//Debe indicarse el numero de elementos que tiene el arreglo. No pueden crecer dinamicamente
		System.out.println("Arreglo edades " + edades);//Imprime la referencia de memoria del Array
		edades[0] = 23;//Modifca el valor del indice 0
		System.out.println("Edades [0] " + edades[0]);//Accede al indice 0 del arreglo de edades
		edades[1] = 17;//Modifca el valor del indice 0
		System.out.println("Edades [1] " + edades[1]);//Accede al indice 0 del arreglo de edades
		edades[2] = 15;//Modifca el valor del indice 0
		System.out.println("Edades [2] " + edades[2]);//Accede al indice 0 del arreglo de edades
		/*edades[3] = 18;//Indice fuera del arreglo
		System.out.println("Edades [3] " + edades[3]);//Provoca un error en tiempo de ejecucion*/
		for(int i = 0; i < edades.length; i++) {
			System.out.println("Edades [" + i + "]:\t" + edades[i]);
		}
	}

}
