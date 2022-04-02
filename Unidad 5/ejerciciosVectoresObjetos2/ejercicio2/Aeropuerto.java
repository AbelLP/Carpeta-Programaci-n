package ejerciciosVectoresObjetos2;
import java.util.*;
public class Aeropuerto {
	static Scanner teclado=new Scanner(System.in);
	private String ciudad;
	private int vuelos;
private int posicion=0;	

	private Vuelos[] vec;
	
	
	public Aeropuerto(String ciudad, int vuelos) {
		this.ciudad=ciudad;
		this.vuelos=vuelos;
		this.vec=new Vuelos[vuelos];
	}
	
	public void añadirVuelo() {
		Vuelos vue;
		int num;
		String compañia;
		String destino;
	
		if (!plazasLibres())
			System.out.println("No se pueden gestionar más vuelos\n");
		else {
			System.out.println("\nInserte el número de vuelo.");
			num=teclado.nextInt();
			System.out.println("\nInserte la compañía del vuelo.");
			compañia=teclado.nextLine();
			teclado.nextLine();
			System.out.println("\nInserte el destino");
			destino=teclado.nextLine();
			vue= new Vuelos(num, compañia, destino);
			vec[posicion]=vue;
			posicion++;
		
		}
	}
	
	public void borrarVuelos() {
		boolean encontrado=false;
		System.out.println("Inserte el número de vuelo que desea eliminar.");
		int num= teclado.nextInt();
		for(int i=0; i<vuelos; i++) {
			if(!(vec[i]==null)) {
			if(vec[i].getNum()==num) {
				encontrado=true;
				  for(int pos=i; pos<vuelos-1; pos++) {
				    	if (pos==vuelos-1) vec[pos]=null;
				    	else vec[pos]=vec[pos+1];
				    }
				  posicion--;
			}
		}	  
	  }
		if (!encontrado) System.out.println("El vuelo número "+ num+" no está en el aeropuerto\n");
		else System.out.println("El vuelo número "+ num+" ha sido eliminado\n");
	}
	
	public void visualizarDatos() {
		if (posicion==0) System.out.println("No hay vuelos en el aeropuerto de "+ ciudad+ "\n");
		else {
		System.out.println("Vuelos del aeropuerto de "+ ciudad);
		for(int i=0; i<vuelos; i++) {
			if (!(vec[i]==null))
				System.out.println(vec[i].toString());
		}
		}
	}
	
	public void salir() {
		System.out.println("Hasta luego.");
	}
	
/// AÑADIR ESTE MÉTODO PARA COMPROBAR SI YA ESTÁN OCUPADAS TODAS LAS PLAZAS QUE EL AEROPUERTO PUEDE GESTIONAR
	public boolean plazasLibres() {
		return posicion<vuelos;
	}
}
