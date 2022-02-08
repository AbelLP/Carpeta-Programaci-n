package metodos2;
import java.util.*;
public class ejercicio_1 {

	public static void main(String[] args) {
		int posicion= 0;
		posicion= meterPosicion();
		calcularNumero(posicion);
	}
	
	public static int meterPosicion() {
		Scanner teclado=new Scanner(System.in);
		int posicion;
		do {
			System.out.println("Ingrese posición.");
			posicion=teclado.nextInt();
		}while (posicion<1);
		

	}
	
	public static void calcularNumero(int posicion) {
		int num1= 0;
		int num2= 1;
		int resultado= 0;
		for (int pos=1; pos < posicion; pos++) {
			num1= num2;
			num2=resultado;
			resultado= num1+num2;
		}
		System.out.println("El número en la posición " +posicion+ " es " +resultado);
	}

}
