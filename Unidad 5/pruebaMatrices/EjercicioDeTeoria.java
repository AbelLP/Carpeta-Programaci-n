package pruebaMatrices;
import java.util.*;

public class EjercicioDeTeoria {
	final int TAM_FIL=3, TAM_COL=2;
	static Scanner teclado=new Scanner(System.in);
	
	public EjercicioDeTeoria() {
		int[][] v1=new int[TAM_FIL] [TAM_COL];
		cargarMatriz(v1);
		visualizar(v1);
	}
	
	public void cargarMatriz(int[][] v1) {
		int valor=1;
		for(int fila=0; fila<v1.length;fila++) {
			for(int col=0; col<v1[fila].length;col++){
				v1[fila][col]=valor;
				valor++;
			}
			
		}
	}
	
	public void visualizar(int[][] v1) {
		for(int fila=0; fila<v1.length; fila++) {
			for(int col=0; col<v1[fila].length; col++) {
				System.out.print(v1[fila][col]+" ");
			}
				System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new EjercicioDeTeoria();

	}

}
