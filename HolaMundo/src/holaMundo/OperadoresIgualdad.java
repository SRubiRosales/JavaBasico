/**
 * 
 */
package holaMundo;

/**
 * @author srosales
 *
 */
public class OperadoresIgualdad {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var a = 3;
		var b = 2;
		var c = (a == b);//Operador de igualdad
		System.out.println("a es igual a b? " + c);
		var d = (a != b);//Operador de desigualdad
		System.out.println("a es diferente a b? " + d);
		
		String cadena1 = "Hola";
		String cadena2 = "Adiós";
		var e = cadena1 == cadena2;//Se compara la referencia de objetos
		var f = cadena1.equals(cadena2);//Comparamos contenidos de cadenas
		System.out.println("cadena1 es igual a cadena2? " + e);
		System.out.println("El contenido de las cadenas es el mismo? " + f);
		
		var g = a > b;
		System.out.println("a es mayor que b? " + g);
		
		var h = a >= b;
		System.out.println("a es mayor o igual que b? " + h);
		
		if (a % 2 == 0)
			System.out.println(a + " es numero par");
		else
			System.out.println(a + " es numero impar");
		
		var edad = 22;
		var adulto = 18;
		if (edad >= adulto)
			System.out.println("Es mayor de edad");
		else
			System.out.println("Es menor de edad");
	}

}
