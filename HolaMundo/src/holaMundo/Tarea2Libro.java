package holaMundo;

import java.util.Scanner;

public class Tarea2Libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Escribe el título del libro: ");
		Scanner consola = new Scanner(System.in);//Crea un objeto de tipo scanner
		var libro = consola.nextLine();
		System.out.println("Escribe el nombre del autor: ");
		var autor = consola.nextLine();
		System.out.println("Escribe la editorial: ");
		var editorial = consola.nextLine();
		System.out.println("Escribe el precio: ");
		var precio = Double.parseDouble(consola.nextLine());
		//boolean envioGratis = Boolean.parseBoolean(consola.nextLine());
		System.out.println("Datos del libro: " + libro + "\n" + autor + "\n" + editorial + "\n$" + precio);
		
	}

}
