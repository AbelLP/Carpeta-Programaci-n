package Ejercicios;
import java.util.*;
public class Principal_coche {
	static Scanner teclado=new Scanner(System.in);
	static Motor mot1=new Motor("Diesel", 120);
	static Motor mot2=new Motor("Gasolina", 90);
	static Coche coch1= new Coche("3024JHT", 5, mot1);
	static Coche coch2=new Coche("2078HTL", 7, mot2);
	static Coche puntero;
	
	public static void main(String[] args) {
		Principal_coche interfaz= new Principal_coche();
		insertar_menu();
	}
	
	public static void insertar_menu() {
		int opcion=0;
		int plazas=0;
		do {
			do {
				if (coch1.getReservado()==false || coch2.getReservado()==false) {
					System.out.println("Seleccione una de las siguientes opciones:\n 1. Alquilar coche \n 2.Devolver coche");
					opcion= teclado.nextInt();
				}
				else if (coch1.getReservado()==true && coch2.getReservado()==true){
					System.out.println("No hay coches disponibles.");
				}
			}while (opcion!=1 && opcion!=2);
			switch (opcion) {
			case 1:
				System.out.println("Seleccione las plazas que quiere para su coche: 5 o 7.");
				puntero= meterPlazas();
				if(puntero.getReservado()==false) {
					System.out.println(puntero.toString());
					puntero.setReservado(true);
				}
				else if(puntero.getReservado()==true) {
					System.out.println("Ese coche ya está alquilado.");
				}
				break;
			case 2:
				System.out.println("Seleccione las plazas del coche a devolver.");
				puntero= meterPlazas();
				if(puntero.getReservado()==true) {
					puntero.setReservado(false);
					puntero.toString();
				}
				else if(puntero.getReservado()==false) {
					System.out.println("Este coche ya ha sido devuelto");
				}
				break;
			}	
		}while(opcion==1 || opcion==2);
		
	}
			
	public static Coche meterPlazas() {
		int plazas=0;
		do {
			System.out.println("Seleccione las plazas que quiere para su coche.");
			plazas= teclado.nextInt();
		}while (plazas!=5 && plazas!=7);
		if(plazas==5) {
			puntero=coch1;
		}
		else if(plazas==7) {
			puntero=coch2;
		}
		return puntero;
	}

}