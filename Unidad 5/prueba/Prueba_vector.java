package prueba;
import java.util.*;
public class Prueba_vector {
	static Scanner teclado=new Scanner(System.in);
	
	public Prueba_vector() {
		Gestion_vectores p=new Gestion_vectores();
		int []vec=p.cargarVector();
		p.visualizar(vec);
		p.buscar(vec);
	}
	
	

	public static void main(String[] args) {
		Prueba_vector interfaz=new Prueba_vector();
	}

}
