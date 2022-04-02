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
	
	public void sumar() {
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
	
	public void visualizar() {
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.println("Número de las posiciones "+ i+ ", "+j+": "+mat[i][j]+".");
			}
		}
		System.out.println("El número de columnas cuya suma fueron más de 20 son: "+3*mayor+".");
		System.out.println("El número de columnas cuya suma fueron menos de 20 son: "+3*menor+".");
	}
	
	public static void main(String[] args) {
		new Ejercicio3();
	}

}
