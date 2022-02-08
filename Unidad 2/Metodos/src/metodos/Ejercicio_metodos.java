package metodos;
import java.util.*;
public class Ejercicio_metodos {
	//static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		int valor= 1;
		while (valor!=0) {
			valor=leerNumero();
			System.out.println("El número introducido es " +valor);
			if (valor==0)
				System.out.println("Fin");
			else if (comprobarNumero(valor))
				visualizardoble(valor);
			else
				visualizartriple(valor);
	}
}		
	
	public static int leerNumero() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Selecciona un numero cualquiera");
		int valor= teclado.nextInt();
		return valor;
	}	
	
	public static boolean comprobarNumero(int valor) {
		if (valor > 8) 
			return true;
		else 
			return false;	
	}
	
	public static void visualizardoble(int valor) {
		System.out.println("El doble de " + valor + " es " + valor*2);
	}
	
	public static void visualizartriple(int valor) {
		System.out.println("El triple de " + valor + " es " + valor*3);
	}	
}


	


