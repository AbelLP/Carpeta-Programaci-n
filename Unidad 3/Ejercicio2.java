package ejerciciosCaracteres;
import java.util.*;
public class Ejercicio2 {
	static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		String palabra1="";
		String palabra2="";
		String palabra3="";
		String palabra4="";
		String primerCaracter="";
		String ultimoCaracter="";
		palabra1=meterPalabra();
		primerCaracter=obtenerPrimera(palabra1);
		construirTriangulos(palabra1);
		System.out.println("El primer caracter de " +palabra1+ " es " +primerCaracter);
		ultimoCaracter=obtenerUltima(palabra1);
		System.out.println("El último caracter de " +palabra1+ " es " +ultimoCaracter);
		construirTriangulos(palabra1);
		palabra2=meterPalabra();
		primerCaracter=obtenerPrimera(palabra2);
		System.out.println("El primer caracter de " +palabra2+ " es " +primerCaracter);
		ultimoCaracter=obtenerUltima(palabra2);
		System.out.println("El último caracter de " +palabra2+ " es " +ultimoCaracter);
		construirTriangulos(palabra2);
		palabra3=meterPalabra();
		primerCaracter=obtenerPrimera(palabra3);
		System.out.println("El primer caracter de " +palabra3+ " es " +primerCaracter);
		ultimoCaracter=obtenerUltima(palabra3);
		System.out.println("El último caracter de " +palabra3+ " es " +ultimoCaracter);
		construirTriangulos(palabra3);
		palabra4=meterPalabra();
		primerCaracter=obtenerPrimera(palabra4);
		System.out.println("El primer caracter de " +palabra4+ " es " +primerCaracter);
		ultimoCaracter=obtenerUltima(palabra4);
		System.out.println("El último caracter de " +palabra4+ " es " +ultimoCaracter);
		construirTriangulos(palabra4);
	}
	
	public static String meterPalabra() {
		String palabra="";
		System.out.println("Introduce una palabra.");
		palabra=teclado.nextLine();
		return palabra;
	}
	
	public static String obtenerPrimera(String palabra) {
		String primerCaracter="";
		primerCaracter=palabra.substring(0, 1);
		return primerCaracter;
	}
	
	public static String obtenerUltima(String palabra) {
		String ultimoCaracter="";
		int longitud= palabra.length();
		ultimoCaracter=palabra.substring(longitud-1);
		return ultimoCaracter;
	}
	
	public static void construirTriangulos(String palabra) {
		int posicion=0;
		for (int i=0; i<palabra.length(); i++) {
			for (int j=0; j<i; i++) {
				System.out.println(palabra.charAt(j));
			}
			System.out.println();
		}
	}

}
