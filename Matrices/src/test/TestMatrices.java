package test;

import java.util.Iterator;

import domain.Persona;

/**
 * 
 */

/**
 * @author srosales
 *
 */
public class TestMatrices {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int edades[][] = new int[3][2];//El primer arreglo maneja los renglones y el segundo las columnas
		System.out.println("Edades " + edades);
		edades[0][0] = 5;
		edades[0][1] = 7;
		edades[1][0] = 8;
		edades[1][1] = 4;
		edades[2][0] = 3;
		edades[2][1] = 2;
		System.out.println("Edades 0 - 0\t" + edades[0][0]);
		System.out.println("Edades 0 - 1\t" + edades[0][1]);
		System.out.println("Edades 1 - 0\t" + edades[1][0]);
		System.out.println("Edades 1 - 1\t" + edades[1][1]);
		for (int ren = 0; ren < edades.length; ren++) {
			for (int col = 0; col < edades[ren].length; col++) {
				System.out.println("Edades " + ren + "-" + col + " : " + edades[ren][col]);
			}
			
		}
		//Inicializacion de matriz en forma simplificada
		String[][] frutas = {{"Naranja", "Limon", "Mandarina"}, {"Fresa", "Zarzamora", "Arandano"}, {"Mango"}};
		/*for (int ren = 0; ren < frutas.length; ren++) {
			for (int col = 0; col < frutas[ren].length; col++) {
				System.out.println("Frutas " + ren + "-" + col + " : " + frutas[ren][col]);
			}
			
		}*/
		imprimir(frutas);
		Persona personas[][] = new Persona[2][3];
		personas[0][0] = new Persona("Sharon");
		personas[0][1] = new Persona("Rubi");
		imprimir(personas);
	}
	
	public static void imprimir(Object matriz[][]) {
		for (int ren = 0; ren < matriz.length; ren++) {
			for (int col = 0; col < matriz[ren].length; col++) {
				System.out.println("Matriz " + ren + "-" + col + " : " + matriz[ren][col]);
			}
			
		}
	}

}
