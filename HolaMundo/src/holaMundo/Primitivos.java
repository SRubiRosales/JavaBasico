package holaMundo;

public class Primitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte numeroByte = 10;
		System.out.println("Valor mínimo - máximo de byte: " + Byte.MIN_VALUE + "\t" + Byte.MAX_VALUE);
		short numeroShort = 123;
		System.out.println("Valor de short: " + numeroShort);
		System.out.println("Valor mínimo - máximo de short: " + Short.MIN_VALUE + "\t" + Short.MAX_VALUE);
		int numeroInt = 1234567;
		System.out.println("Valor de int: " + numeroInt);
		System.out.println("Valor mínimo - máximo de int: " + Integer.MIN_VALUE + "\t" + Integer.MAX_VALUE);
		long numeroLong = 1234567;
		System.out.println("Valor de long: " + numeroLong);
		System.out.println("Valor mínimo - máximo de long: " + Long.MIN_VALUE + "\t" + Long.MAX_VALUE);
		
		//Tipos flotantes
		float numeroFloat = 10.0F;
		System.out.println("Valor de float: " + numeroFloat);
		System.out.println("Valor mínimo - máximo de float: " + Float.MIN_VALUE + "\t" + Float.MAX_VALUE);
		double numeroDouble = 20.5;
		System.out.println("Valor de double: " + numeroDouble);
		System.out.println("Valor mínimo - máximo de double: " + Double.MIN_VALUE + "\t" + Double.MAX_VALUE);
	}

}
