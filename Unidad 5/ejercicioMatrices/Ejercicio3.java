package ejerciciosMatrices;
import java.util.*;
public class Ejercicio3 {
	static Scanner teclado=new Scanner(System.in);
	final int TAM_FIL=4, TAM_COL=3;
	int[][] mat=new int[TAM_FIL][TAM_COL];
	int mayor=0;
	int menor=0;
	
	public Ejercicio3() {
		cargar();
		sumar();
		visualizar();
	}
	
	public void cargar() {
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.println("Inserta número");
				mat[i][j]=teclado.nextInt();
			}
		}
	}
	
/*	public void sumar() {
		int i;
		int j;
		int suma=0;
		for(i=0; i<mat.length; i++) {
			for(j=0; j<mat[i].length; j++) {
				suma +=mat[j][i];
			}
			if(suma>20) {
				mayor++;
			}
			else {
				menor++;
			}
		}
	}
*/	
	/*
	 * Se suma por columnas, así que serán 3 iteraciones, que es el número de 
	 * columnas que tiene la matriz. Bucle exterior debe comprobar que i<mat[i].length
	 * Por cada columna tenemos que recorrer las 4 filas. Bucle interno debe comprobar j<mat.length
	   Al finalizar el recorrido de cada columna comprobamos si es mayor que 20 para 
	   incrementar las variables mayor o menor según corresponda.
	   Posteriormente es necesario poner la variable suma igual a cero para que no vaya acumulando la suma de todas las columnas
	 * */

    public void sumar() {
		int i;
		int j;
		int suma=0;
		for(i=0; i<mat[i].length; i++) {
			for(j=0; j<mat.length; j++) {
				suma +=mat[j][i];
					
		     }
			if(suma>20) {
				mayor++;
			}
			else {
				menor++;
			}
			suma=0;
		}
	}
	
	public void visualizar() {
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.println("Número de las posiciones "+ i+ ", "+j+": "+mat[i][j]+".");
			}
		}
		/*System.out.println("El número de columnas cuya suma fueron más de 20 son: "+3*mayor+".");
		System.out.println("El número de columnas cuya suma fueron menos de 20 son: "+3*menor+".");
		NO TIENES QUE MULTIPLICAR POR 3. En la variable mayor y menor ya se van guardando directamente
		el número de columnas cuya suma es mayor a 20, o igual o menor a 20 respectivamente.
		
		*/
		System.out.println("El número de columnas cuya suma fueron más de 20 son: "+ mayor+".");
		System.out.println("El número de columnas cuya suma fueron menos de 20 son: "+menor+".");
	}
	
	
	public static void main(String[] args) {
		new Ejercicio3();
	}

}
