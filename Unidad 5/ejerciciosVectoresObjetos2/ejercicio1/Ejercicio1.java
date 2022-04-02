package ejerciciosVectoresObjetos2;
import java.util.*;
public class Ejercicio1 {
	static Scanner teclado=new Scanner(System.in);
	public Ejercicio1() {
		Almacen alm=new Almacen(700);
		alm.cargar();
		String respuesta="";
		while(!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
			System.out.println("Inserta si quieres buscar productos: si o no.");
			respuesta= teclado.nextLine();
		}	
		while(!respuesta.equalsIgnoreCase("no")) {
			alm.buscar();
			System.out.println("Inserta si quieres o no seguir buscando productos.");
			teclado.nextLine();
			respuesta=teclado.nextLine();
		}
		if(respuesta.equalsIgnoreCase("no")) {
			System.out.println("Hasta luego.");
		}
		
		
		
	}

	public static void main(String[] args) {
		new Ejercicio1();
	}

}
