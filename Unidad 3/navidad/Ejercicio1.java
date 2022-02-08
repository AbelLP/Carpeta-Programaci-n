package navidad;
import java.util.*;
public class Ejercicio1 {
	static Scanner teclado=new Scanner(System.in);
	static Cafe caf1;
	
	public Ejercicio1() {
		caf1= new Cafe();
	}
	
	public static void main(String[] args) {
		Ejercicio1 interfaz=new Ejercicio1();
		caf1.llenarCafetera();
		caf1.servirTazaCafe();
		if (caf1.getCantidadActual()>0) {
			caf1.vaciarCafetera();
		}
	}
	
		
	

}
