package prueba_excepciones;
import java.util.*;
public class Uno {
	static Scanner teclado=new Scanner(System.in);
	final int TAM=4;
	
	public Uno() {
		int[] vec=new int[TAM];
		vec=cargarVector(vec);
		visualizar(vec);
		
		try {
			System.out.println("No se entra si no hay excepción.");
			System.out.println("Inserta numerador.");
			int numerador=teclado.nextInt();
			System.out.println("Inserta divisor.");
			int divisor=teclado.nextInt();
			int resultado=numerador/divisor;
			System.out.println(resultado);
		}
	
		catch(IndexOutOfBoundsException e) {
			System.out.println("Estamos fuera de rango.");
			e.printStackTrace();
		}
		catch(ArithmeticException elem) {
			System.out.println(elem.getMessage());
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
		finally {
			System.out.println("Se ejecuta siempre. Permite liberar recursos del sistema.");
		}
	}
	
	public int[] cargarVector(int[] vec) {
		for(int i=0; i<vec.length; i++) {
			System.out.println("Insertar número.");
			vec[i]=teclado.nextInt();
		}
		return vec;
	}
	
	public void visualizar(int[] vec) {
		System.out.println("Meter posición.");
		int pos=teclado.nextInt();
		System.out.println(vec[pos]);
	}
	
	
	
	public static void main(String[] args) {
		new Uno();
	}
	//Haer un programa que implemente un método llamado transformar, que nos permita meter una cadena de caracteres, y transformarla en un número. El método debe devolver un número, y capturar las posibles excepciones.
}
