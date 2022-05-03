package holaMundo;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3, b = 2;
		var resultado = a + b;//Suma aritmetica
		System.out.println("Suma " + resultado);
		resultado = a -b;//Resta aritmetica
		System.out.println("Resta " + resultado);
		resultado = a * b;//Multiplicacion
		System.out.println("Producto aritmetico " + resultado);
		var cociente = 3.0 / b;
		System.out.println("Cociente " + cociente);
		resultado = a % b;
		System.out.println("Residuo " + resultado);
		
		if (b % 2 == 0)
			System.out.println("El numero es par");
		else
			System.out.println("El numero es impar");
	}

}
