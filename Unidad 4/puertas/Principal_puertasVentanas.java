package ejercicio_puertas;
import java.util.*;
public class Principal_puertasVentanas {
	static Scanner teclado=new Scanner (System.in);
	public Principal_puertasVentanas() {
		int contador=1;
		Puerta p1=new Puerta(1);
		Manual p2=new Manual(2);
		Puerta p3=new Puerta(3);
		Ventana v4=new Ventana(4);
		while(contador<=6) {
			System.out.println("Situación de la puerta 1: "+p1.isBloqueo());
			System.out.println("Situación de la puerta 2: "+p2.isBloqueo());
			System.out.println("Situación de la puerta 3: "+p3.isBloqueo());
			System.out.println("Situación de la ventana 4: "+v4.isBloqueo());
			int numAlea=(int)Math.round(Math.random() *  4 + 1);
			/*System.out.println("Inserte un número.");
			numAlea=teclado.nextInt();*/
			System.out.println("El número que ha salido es "+numAlea+ ".");
			switch (numAlea) {
			case 1:
				if(p1.isBloqueo()==false) {
					p1.bloquear();
				}
				else {
					p1.desbloquear();
				}
				break;
			case 2:
				if(p2.isBloqueo()==false) {
					p2.bloquear();;
				}
				else {
					p2.desbloquear();
				}
				break;
			case 3:
				if(p3.isBloqueo()==false){
					p3.bloquear();
				}
				else {
					p3.desbloquear();
				}
				break;
			case 4:
				if(v4.isBloqueo()==false) {
					v4.bloquear();
				}
				else {
					v4.desbloquear();
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
