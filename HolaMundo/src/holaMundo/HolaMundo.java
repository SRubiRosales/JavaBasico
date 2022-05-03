package holaMundo;

public class HolaMundo {

	public static void main(String[] args) {
		//System.out.println("Hola mundo desde Java");
		//Definimos la variable
		int miVariableEntera = 10;
		System.out.println(miVariableEntera);
		//Modificamos el valor de la variable
		miVariableEntera = 5;
		System.out.println(miVariableEntera);
		String miVariableCadena = "You say good bye";
		System.out.println(miVariableCadena);
		miVariableCadena = "And I say hello";
		System.out.println(miVariableCadena);
		
		var miVariableEntera2 = 10;
		System.out.println(miVariableEntera2);
		
		var miVariableCadena2 = "The Beatles";
		System.out.println(miVariableCadena2);
		
		var miVariable = "Variable con nombre que empieza en minúscula";
		var _miVariable = "Variable con nombre que empieza en _";
		var $miVariable = "Variable con nombre que empieza en $";
		System.out.println(miVariable);
		System.out.println(_miVariable);
		System.out.println($miVariable);
		
	}

}
