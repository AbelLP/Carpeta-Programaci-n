package ejerciciosMatrices;
import java.util.*;
public class Ejercicio4 {
	NotasAlumnos notas;
	String mod[];
	
	public Ejercicio4() {
		notas=new NotasAlumnos();
		mod=new String[3];
		mod=notas.cargarVector();
		notas.cargarMatriz(mod);
		notas.visualizar();
	}
	
	
	public static void main(String[] args) {
		Ejercicio4 ej4=new Ejercicio4();
		ej4.mod=ej4.notas.cargarVector();
		ej4.notas.cargarMatriz(ej4.mod);
		ej4.notas.visualizar();
	}

}
