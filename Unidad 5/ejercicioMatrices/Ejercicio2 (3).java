package ejerciciosMatrices;
import java.util.*;
public class Ejercicio2 {
	static Scanner teclado=new Scanner(System.in);
	final int TAM_FIL=3, TAM_COL=3;
	
	/*La segunda matriz siempre va a tener 2 filas (una por cada diagonal) y las mismas 
	 * columnas que la primera
	 */
	//final int TAM_COL2=2;   ESTA INSTRUCCIÓN NO ES CORRECTA, lo que son 2 son las filas
	
	final int TAM_FIL2=2;  
	int[][]primera=new int[TAM_FIL][TAM_COL];
	
	//int[][]segunda=new int[TAM_FIL][TAM_COL2];
	  int[][]segunda=new int[TAM_FIL2][TAM_COL];
	
	public Ejercicio2() {
		cargar();
		crear();
		visualizarPrimera();
		visualizarSegunda();
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
		//rellenamos fila 0 de la segunda matriz con la diagonal principal de la primera
		for (int i=0; i<primera.length;i++) {
			for (int j=0;j<primera[i].length; j++) {
			    if (i==j) segunda[0][j]=primera[i][j];
			  }
		}
		// rellenamos fila 1 de la segunda matriz con la diagonal secundaria de la primera
		for(int i=0; i<primera.length;i++) {
	    	segunda[1][i]=primera[i][TAM_COL-1-i];
			
		}
	}
	
	public void visualizarPrimera() {
		System.out.println("PRIMERA MATRIZ");
		for(int i=0; i<primera.length; i++) {
			for(int j=0; j<primera[i].length; j++) {
				System.out.print(primera[i][j]+"   ");
			}
			System.out.println();
	    }
	}
	
	public void visualizarSegunda() {
		System.out.println("SEGUNDA MATRIZ");
		for(int i=0; i<2; i++) {
			for(int j=0; j<TAM_COL; j++) {
				System.out.print(segunda[i][j]+"   ");
			}
			System.out.println();
	    }
		
	}
	
	public static void main(String[] args) {
		Ejercicio2 ej=new Ejercicio2();
		ej.crear();
		ej.visualizarPrimera();
		ej.visualizarSegunda();
	}

}