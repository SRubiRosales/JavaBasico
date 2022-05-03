package holaMundo;

import java.util.Scanner;

public class ConversionPrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Convertir tipo string a int
		var edad = Integer.parseInt("22");
		System.out.println("Edad: " + (edad + 1));
		
		//Convertir tipo string a double
		var pi = Double.parseDouble("3.1416");
		char piLetra = '\u0360';
		System.out.println("Número pi " + piLetra + " " + pi);
		
		//Convertir string de consola a int en variable existente
		var consola = new Scanner(System.in);
		System.out.println("Dime tu edad ");
		edad = Integer.parseInt(consola.nextLine());
		System.out.println("Edad int de consola: " + edad);
		
		//Convertir tipo int a String
		var edadTexto = String.valueOf(10);
		System.out.println("Edad texto: " + edadTexto);
		//Convertir tipo String a char
		var caracter = "Hola".charAt(0);
		System.out.println("Proporciona un caracter: ");
		caracter = consola.nextLine().charAt(0);
		System.out.println("Character: " + caracter);
		
	}

}
