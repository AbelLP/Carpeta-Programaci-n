package ejerciciosMatrices;

import java.util.Scanner;

public class NotasAlumnos {
	
	static Scanner teclado=new Scanner(System.in);
	final int TAM_FILAS=3, TAM_COL=5;
	
	//String[] alum=new String[3];	//en el vector de los alumnos va el nombre de las asignaturas
	// Si aquí vas a meter en nombre de los módulos, llámalo módulos y no alum
	String[] modulos;	
	int[][] notas;
	
	public NotasAlumnos() {
		notas=new int[TAM_FILAS][TAM_COL];
		modulos=new String[3];
	}
	
	public NotasAlumnos(String[] modulos) {
		notas=new int[TAM_FILAS][TAM_COL];
		this.modulos=modulos;
	}
	
	public void cargarMatriz(String[] modulos) {
		for (int i=0; i<notas.length; i++) {
			System.out.println("Notas para módulo "+ modulos[i]);
			for (int j=0; j<notas[i].length; j++) {
				System.out.println("Introduzca nota: ");
				notas[i][j]=teclado.nextInt();
			}
				
		}		
	}
	
	public String[] cargarVector() {
		for(int i=0; i<3; i++) {
			System.out.println("Inserte nombre de la asignatura.");
		//	alum[i]=teclado.nextLine();
			modulos[i]=teclado.nextLine();
			//teclado.nextLine();
		}
		//return alum;
		return modulos;
	}
	
	public void visualizar() {
		int aprobados = 0;
		for (int i=0; i<notas.length; i++) {
			for (int j=0; j<notas[i].length; j++) {
				if (notas[i][j]>=5) aprobados++;
			}
			System.out.println("En el módulo "+ modulos[i]+ " han aprobado "+ aprobados);
			aprobados=0;	
		}		
		
	}

}
