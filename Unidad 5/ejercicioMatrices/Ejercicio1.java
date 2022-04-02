package ejerciciosMatrices;
import java.util.*;
public class Ejercicio1 {
	static Scanner teclado=new Scanner(System.in);
	final int TAM_FILA=2, TAM_COL=3;
	final int tamaño=2;
	int[][]v1=new int[TAM_FILA][TAM_COL];
	int[] v2=new int[tamaño];
	
	public Ejercicio1() {
		cargar(v1);
		sumar();
		visualizar();
	}
	
	public void cargar(int[][] v1) {
		for (int i=0; i<v1.length; i++) {
			for(int j=0; j<v1[i].length; j++) {
				System.out.println("Inserta número.");
				v1[i][j]=teclado.nextInt();
			}
		}
	}
	
	public void sumar(){
		int suma;
		int posicion=0;
		for(int j=0; j<v1.length; j++) {
			suma=0;
			for(int i=0; i<v1[j].length; i++) {
				suma +=v1[j][i];
			}
			v2[posicion]=suma;
			posicion++;
		}
	}
	
	public void visualizar() {
		for(int i=0; i<v1.length; i++) {
			for(int j=0; j<v1[i].length; j++) {
				System.out.println("El número en esta posición de la matriz es " +v1[i][j]+".");
			}
		}
		for (int x=0; x<v2.length; x++) {
			System.out.println("El número en esta posición del vector es "+v2[x]+".");
		}
		
	}
	
	public static void main(String[] args) {
		new Ejercicio1();
	}

}
