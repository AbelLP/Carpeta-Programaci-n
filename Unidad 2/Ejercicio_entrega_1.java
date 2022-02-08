package ejercicios_entrega;
import java.util.*;
public class Ejercicio_entrega_1 {
	static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		int lado1;
		int lado2;
		int lado3;
		String tipoTriangulo;
		lado1=introducirLongitud();
		System.out.println("El valor del primer lado es " +lado1);
		lado2=introducirLongitud();
		System.out.println("El valor del segundo lado es " +lado2);
		lado3=introducirLongitud();
		System.out.println("El valor del tercer lado es " +lado3);
		tipoTriangulo=calcularTipo(lado1, lado2, lado3);
		imprimir(lado1, lado2, lado3, tipoTriangulo);
	}
	
	public static int introducirLongitud() {
		System.out.println("Introduzca el valor de un lado.");
		int lado=teclado.nextInt();
		return lado;
	}
	
	public static String calcularTipo(int lado1, int lado2, int lado3) {
		String tipoTriangulo="";
		int igualdad=0;
		if (lado1==lado2) {
			igualdad++;
		}
			
		if (lado2==lado3) {
			igualdad++;
		}
			
		if (igualdad==2) {
			tipoTriangulo="equilátero";
		}
		
		else if(igualdad==1) {
			tipoTriangulo="isósceles";
		}
		
		else {
			tipoTriangulo="escaleno";
		}
	return tipoTriangulo;
}
	
	public static void imprimir(int lado1, int lado2, int lado3, String tipoTriangulo) {
		System.out.println("La longitud del primer lado es " +lado1);
		System.out.println("La longitud del segundo lado es " +lado2);
		System.out.println("Y la longitud del tercer lado es " +lado3);
		System.out.println("Por lo cual, es un triángulo " +tipoTriangulo);
	}
}

