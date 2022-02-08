package metodos;
import java.util.*;
public class Ejercicio_1 {
	static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		int valor= 0;
		leerNumeros();
		comprobarNumero(valor);
		System.out.println("Fin.");
	}
	
	public static int leerNumeros() {
		System.out.println("Selecciona un numero cualquiera");
		int valor= teclado.nextInt();
		return valor;
	}	
	
	public static int comprobarNumero() {
		if (valor > 8) {
			visualizardoble(valor);	
		}
		else if (valor < 8) {
			visualizartriple(valor);	
		}
	}
	
	public static int visualizardoble() {
		return valor*2;
	}
	
	public static int visualizartriple() {
		return valor*3;
	}	
}
