package ejerciciosCaracteres;
import java.util.*;
public class Ejercicio1 {
	static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		String cadena=null;
		int longitud=0;
		int repeticion=0;
		do {
			System.out.println("Escriba una cadena de caracteres.");
			cadena= teclado.nextLine();
			longitud=calcularLongitud(cadena);
			System.out.println("Esta cadena tiene " +longitud+ " caracteres.");
			convertirMayusculas(cadena);
			convertirMinusculas(cadena);
			sacarSubcadena(cadena);
			repeticion=contarCaracteres(cadena, longitud);
			if (repeticion==0) {
				System.out.println("El caracter introducido no está en la cadena.");
			}
			else if(repeticion!=0){
				System.out.println("El caracter introducido se ha repetido " +repeticion+ " veces.");
			}
		}while (cadena!="fin");
	}
	
	public static int calcularLongitud(String cadena){
		int longitud=0;
		longitud= cadena.length();
		return longitud;
	}
	
	public static void convertirMayusculas(String cadena) {
		System.out.println("Asi estaría escrito "+cadena.toUpperCase()+" en mayúsculas.");
	}
	
	public static void convertirMinusculas(String cadena) {
		System.out.println("Asi estaría escrito "+cadena.toLowerCase()+" en mayúsculas.");
	}
	
	public static void sacarSubcadena(String cadena) {
		String subCadena="";
		subCadena=cadena.substring(1, 4);
		System.out.println("Los caracteres entre las posiciones 1 y 3 son " +subCadena);
	}
	
	public static int contarCaracteres(String cadena, int longitud) {
		int posicion, repeticion=0;
		char caracter;
		System.out.println("Introduzca un caracter.");
		caracter=teclado.next().charAt(0);
		for (int i=1; i<longitud; i++) {
			if(cadena.charAt(i)==caracter) {
				repeticion++;
			}
		}
		return repeticion;
	}

}
