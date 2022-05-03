/**
 * 
 */
package manejoarchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author srosales
 *
 */
public class ManejoArchivos {

	public static void crearArhivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);//Objeto de tipo file en memoria
		try {
			PrintWriter salida = new PrintWriter(archivo);//Abriendo el archivo
			salida.close();//Se crea el archivo en el disco duro
			System.out.println("Se ha creado el archivo");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void escribirArchivo(String nombreArchivo, String contenido) {
		File archivo = new File(nombreArchivo);//Objeto de tipo file en memoria
		try {
			PrintWriter salida = new PrintWriter(archivo);//Abriendo el archivo
			salida.println(contenido);
			salida.close();//Se crea el archivo en el disco duro
			System.out.println("Se ha escrito el archivo");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void anexarArchivo(String nombreArchivo, String contenido) {//Evita que se pierda la informacion que se va anexar
		File archivo = new File(nombreArchivo);//Objeto de tipo file en memoria
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));//True=el nuevo contenido se anexa
			salida.println(contenido);
			salida.close();//Se crea el archivo en el disco duro
			System.out.println("Se ha anexado informacion al archivo");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void leerArchivo(String nombreArchivo) {//Evita que se pierda la informacion que se va anexar
		File archivo = new File(nombreArchivo);//Objeto de tipo file en memoria
		try {
			BufferedReader entrada = new BufferedReader(new FileReader(archivo));
			var lectura = entrada.readLine();
			while(lectura != null) {//Itera cada linea del archivo
				System.out.println("Lectura: " + lectura);
				lectura = entrada.readLine();
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
