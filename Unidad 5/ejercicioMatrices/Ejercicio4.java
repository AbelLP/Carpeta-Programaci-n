package ejerciciosMatrices;
import java.util.*;
public class Ejercicio4 {
	static Scanner teclado=new Scanner(System.in);
	final int TAM_FILAS=3, TAM_COL=5;
	String[] alum=new String[3];	//en el vector de los alumnos va el nombre de las asignaturas
	int[][] notas=new int[TAM_FILAS][TAM_COL];
	
	public Ejercicio4() {
		cargarMatriz();
		alum=cargarVector();
		visualizar();
	}
	
	public void cargarMatriz() {
		
	}
	
	public String[] cargarVector() {
		for(int i=0; i<3; i++) {
			System.out.println("Inserte nombre de la asignatura.");
			alum[i]=teclado.nextLine();
			teclado.nextLine();
		}
		return alum;
	}
	
	public void visualizar() {
		
	}
	
	public static void main(String[] args) {
		new Ejercicio4();
	}

}
