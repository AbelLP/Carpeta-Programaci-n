package metodos2;
import java.util.*;
public class ejercicio_2 {

	public static void main(String[] args) {
		int n= 0;
		n= leerEntero();
		comprobarNumero(n);


	}
	
	public static int leerEntero() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca un n�mero entero.");
		int n= teclado.nextInt();
		return n;
	}
	
	public static void comprobarNumero(int n) {
		if (n < 999) {
			Scanner teclado=new Scanner(System.in);
			System.out.println("Introduzca un n�mero de 4 d�gitos.");
			n= teclado.nextInt();
		}
		
		
	}

}
