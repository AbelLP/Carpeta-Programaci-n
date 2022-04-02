package ejercicios_vectores;

import java.util.*;

public class Ejercicio2{
	static Scanner teclado=new Scanner(System.in);
	int numPar=1;
	public Ejercicio2(){
		do{
			System.out.println("Introduzca la dimensión del vector");
			numPar=teclado.nextInt();
		}while (numPar%2!=0);
	
		Vector vec=new Vector(numPar);
		vec.cargar();
		Vector vec2=new Vector(numPar);
		
		System.out.println("VALORES VECTOR NÚMERO 1");
		vec.visualizarVector();
		vec2=vec.rellenarVector();
		System.out.println("VALORES VECTOR NÚMERO 2");
		vec2.visualizarVector();
	}

	public static void main(String[] args) {
		Ejercicio2 interfaz=new Ejercicio2();
	}
}