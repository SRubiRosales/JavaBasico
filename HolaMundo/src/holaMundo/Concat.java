package holaMundo;

public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var usuario = "Juan";
		var titulo = "Ingeniero";
		var union = titulo + " " + usuario;
		System.out.println(union);
		
		var i = 3;
		var j = 4;
		System.out.println(i + j);//Suma de numeros
		System.out.println(i + j + usuario);//Suma de numeros y concatenacion
		System.out.println(usuario + i + j);//Concatenacion; contexto cadena
		//Uso de parentesis modifica la prioridad
		System.out.println(usuario + (i + j));//Concatenacion y suma de numeros 
	}

}
