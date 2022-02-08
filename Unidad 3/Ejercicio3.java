package ejerciciosCaracteres;
import java.util.*;
public class Ejercicio3 {
	static Scanner teclado= new Scanner(System.in);
	public static void main(String[] args) {
		StringBuffer cadena=new StringBuffer("Hoal Muuundo");
		System.out.println("La cadena principal es " +cadena);
		String cadenaTransformada= transformarCadena(cadena);
		System.out.println("La cadena transformada es " + cadenaTransformada);
	}
	
	public static String transformarCadena(StringBuffer cadena ){
		cadena.replace(2, 4, "la"); //remplazamos las posiciones 2 y 4 por la.
		cadena.deleteCharAt(6); //eliminamos la posici�n 6 que es una u.
		cadena.deleteCharAt(7); //eliminamos la posici�n 7 que es una u.
		cadena.append("!"); //a�adimos el simbolo admiraci�n al final.
		cadena.insert(0, "�"); //a�adimos el simbolo admiraci�n al principio.
		return cadena.toString(); //convertimos StringBuffer a String.
	}

}

