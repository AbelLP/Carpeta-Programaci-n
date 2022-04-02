package pruebaMatrices;
import java.util.*;

public class EjercicioDeTeoria {
	final int TAM_FIL=3, TAM_COL=2;
	static Scanner teclado=new Scanner(System.in);
	
	public EjercicioDeTeoria() {
		int[][] v1=new int[TAM_FIL] [TAM_COL];
		v1[0]=new int[3];
		v1[1]=new int[4];
		v1[2]=new int[2];
		cargarMatriz(v1);
		visualizar(v1);
	}
	
	public void cargarMatriz(int[][] v1) {
		int valor=1, columnas;
		for(int i=0; i<v1.length;i++) {
			System.out.println("Número de columnas para la fila "+i);
			columnas=teclado.nextInt();
			v1[i]=new int[columnas];
		}
		for (int fila=0; fila<v1.length;fila++) {
			for(int col=0; col<v1[fila].length;col++) {
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
		System.out.println(v1[2][1]);
	}
	
	public static void main(String[] args) {
		new EjercicioDeTeoria();

	}

}
