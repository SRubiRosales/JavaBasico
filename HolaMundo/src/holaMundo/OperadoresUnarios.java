/**
 * 
 */
package holaMundo;

/**
 * @author srosales
 *
 */
public class OperadoresUnarios {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var a = 3;
		var b = -a;//Cambio de signo
		System.out.println("Var a = " + a);
		System.out.println("Cambio de signo = " + b);
		
		var c = true;
		var d = !c;//Negacion
		System.out.println("Var c = " + c);
		System.out.println("Negacion de c = " + d);
		
		var e = 3;
		var f = ++e;//Preincremento
		System.out.println("Var e = " + e);
		System.out.println("Preincremento de e = " + f);
		
		var g = 5;
		var h = g++;//Postincremento
		System.out.println("Var g = " + g);//Teniamos pendiente un incremento
		System.out.println("Postincremento de g = " + h);
		
		var i = 2;
		var j = --i;//Predecremento
		System.out.println("Var i = " + i);
		System.out.println("Predecremento de i = " + j);
		
		var k = 2;
		var l = k--;//Postdecremento
		System.out.println("Var k = " + k);//Tenia pendiente un decremento
		System.out.println("Predecremento de k = " + l);
	}

}
