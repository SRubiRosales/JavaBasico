package holaMundo;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Escribe tu nombre: ");
		Scanner consola = new Scanner(System.in);//Crea un objeto de tipo scanner
		var usuario = consola.nextLine();
		System.out.println("Usuario: " + usuario);
		System.out.println("Escribe tu título: ");
		var titulo = consola.nextLine();
		System.out.println("Usuario: " + titulo + usuario);
	}

}
