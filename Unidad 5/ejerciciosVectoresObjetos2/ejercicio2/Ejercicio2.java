package ejerciciosVectoresObjetos2;
import java.util.*;
public class Ejercicio2 {
	static Scanner teclado=new Scanner(System.in);
	Aeropuerto aer=new Aeropuerto("Oviedo", 10);
	
	public Ejercicio2() {	
		menu();
	}
	
	public void menu() {
		int respuesta=0;
		boolean salir=false;
	while (!salir) {
			System.out.println("Inserte una de las siguientes opciones:\n"
				+ "1-Dar de alta un vuelo   "
				+ "2-Borrar un vuelo   "
				+ "3-Visualizar datos   "
				+ "4-Salir");
			respuesta=teclado.nextInt();
			
		while(respuesta!=1 && respuesta!=2 && respuesta!=3 && respuesta!=4) {
			respuesta=teclado.nextInt();
			
		}
		if(respuesta==4) {
			System.out.println("Hasta luego");
			salir=true;
		}
		else {
			if(respuesta==1) {
				aer.añadirVuelo();
			}
			else if(respuesta==2){
				aer.borrarVuelos();
			}
			else if(respuesta==3){
				aer.visualizarDatos();
			}
		}
		
		
		}

	}
	
	public static void main(String[] args) {
		new Ejercicio2();
	}

}
