import java.util.*;
public class Metodos_2 {
	static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		int result=0, valor1=0, valor2=0;
		System.out.println("Selecciona el primer valor.");
		valor1=teclado.nextInt();
		System.out.println("Selecciona el segundo valor.");
		valor2=teclado.nextInt();
		result= sumarNumeros(valor1, valor2);
		sacarResultado(valor1,valor2,result);
	}
	
	public static int sumarNumeros (int valor1, int valor2) {
		return valor1+valor2;
	}
	
	public static void sacarResultado (int vl1, int vl2, int suma) {
		System.out.println("La suma de "+vl1+ " y de "+vl2+" es "+suma);   
	}
	
	
	
}
