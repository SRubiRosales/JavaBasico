/**
 * 
 */
package test;

import manejoarchivos.ManejoArchivos;

/**
 * @author srosales
 *
 */
public class TestManejoArchivos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String nombreArchivo = "Prueba.txt";
		//ManejoArchivos.crearArhivo(nombreArchivo);
		ManejoArchivos.escribirArchivo(nombreArchivo, "Hola desde Java");
		ManejoArchivos.anexarArchivo(nombreArchivo, "Nuevo contenido");
		ManejoArchivos.leerArchivo(nombreArchivo);
	}

}
