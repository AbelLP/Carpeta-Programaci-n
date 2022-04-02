package ejerciciosMatrices;
import java.util.*;
public class Ejercicio2 {
	static Scanner teclado=new Scanner(System.in);
	final int TAM_FIL=3, TAM_COL=3;
	final int TAM_COL2=2;
	int[][]primera=new int[TAM_FIL][TAM_COL];
	int[][]segunda=new int[TAM_FIL][TAM_COL2];
	
	
	public Ejercicio2() {
		cargar();
	}
	
	public void cargar() {
		for(int i=0; i<primera.length; i++) {
			for(int j=0; j<primera[i].length; j++) {
				System.out.println("Inserta un número.");
				primera[i][j]=teclado.nextInt();
			}
		}
	}
	
	public void crear() {
		int v=0;
		for(int j=0; j<segunda.length; j++) {
			for(int i=0; i<segunda[j].length; i++) {
				segunda[i][j]=primera[v][v];
				v++;
			}
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		new Ejercicio2();
	}

}
