package Ejercicios;
import java.util.*;
import Ejercicios.Coche2;
public class Principal_coche2 {
	static Scanner teclado= new Scanner(System.in);
	Coche2 coch1;
	public Principal_coche2() {
		coch1= new Coche2();
	}
	
	
	
	public static void main(String[] args) {
		Principal interfaz= new Principal();
		interfaz.run();
	}
	
	public static double calcularPrecio(double precio) {
		double precioFinal=precio *0.21;
		return precioFinal;
	}
	
	public static void empezar_conducir() {
		System.out.println("Arrancar coche.");
		System.out.println("Meter marcha.");
		System.out.println("Acelerar coche.");
	}

}
