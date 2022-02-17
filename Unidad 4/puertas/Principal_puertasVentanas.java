package ejercicio_puertas;
import java.util.*;
public class Principal_puertasVentanas {
	static Scanner teclado=new Scanner (System.in);
	public Principal_puertasVentanas() {
		int contador=0;
		int numAlea=0;
		Puerta p1=new Puerta(1);
		Manual p2=new Manual(2);
		Puerta p3=new Puerta(3);
		Ventana v4=new Ventana(4);
		while(contador<=6) {
			System.out.println("Situación de la puerta 1: "+p1.isBloqueo());
			System.out.println("Situación de la puerta 2: "+p2.isBloqueo());
			System.out.println("Situación de la puerta 3: "+p3.isBloqueo());
			System.out.println("Situación de la ventana 4: "+v4.isBloqueo());
			/*numAlea=Math.round((int)Math.random() * ( 5 - 1) + 1);*/
			System.out.println("Inserte un número.");
			numAlea=teclado.nextInt();
			System.out.println("El número que ha salido es "+numAlea+ " .");
			if(numAlea==1) {
				if(p1.isBloqueo()==false) {
					p1.setBloqueo(true);
				}
				else {
					p1.setBloqueo(false);
				}
			}
			else if(numAlea==2) {
				if(p2.isBloqueo()==false) {
					p2.setBloqueo(true);
				}
				else {
					p2.setBloqueo(false);
				}
			}
			else if(numAlea==3) {
				if(p3.isBloqueo()==false){
					p3.setBloqueo(true);
				}
				else {
					p3.setBloqueo(false);
				}
			}
			else {
				if(v4.isBloqueo()==false) {
					v4.setBloqueo(true);
				}
				else {
					v4.setBloqueo(false);
				}
			}	
			contador++;
		}
		System.out.println("Situación de la puerta 1: "+p1.isBloqueo());
		System.out.println("Situación de la puerta 2: "+p2.isBloqueo());
		System.out.println("Situación de la puerta 3: "+p3.isBloqueo());
		System.out.println("Situación de la ventana 4: "+v4.isBloqueo());
	}
	
	public static void main(String[] args) {
		Principal_puertasVentanas interfaz=new Principal_puertasVentanas();
	}
	

}
