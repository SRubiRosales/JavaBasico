package holaMundo;

public class Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean varBoolean = true;
		System.out.println("Variable booleana: " + varBoolean);
		
		if(varBoolean)
			System.out.println("La bandera es verdadera");
		else
			System.out.println("La bandera es falsa");
		
		var edad = 22;
		var esAdulto = edad >= 18;//Sentencia de comparacion de dos numeros
		if (esAdulto)
			System.out.println("Es mayor de edad");
		else 
			System.out.println("Es menor de edad");
	}

}
