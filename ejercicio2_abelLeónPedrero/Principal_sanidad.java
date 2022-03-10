package ejercicio2_abelLeónPedrero;
import java.util.*;
public class Principal_sanidad {
	static Scanner teclado=new Scanner(System.in);
	public Principal_sanidad() {
		String respuesta="";
		Sanidad san1=new Publica(100, 15000, true);
		Sanidad san2=new Privada(150, 15000, 235);
		Caracteristicas obj=new Caracteristicas();
		while(!respuesta.equalsIgnoreCase("privada") && !respuesta.equalsIgnoreCase("publica")) {
			System.out.println("Introduzca el tipo de sanidad con el que quiera operar: publica o privada.");
			respuesta=teclado.nextLine();
		}
		if(respuesta.equalsIgnoreCase("privada")) {
			obj.imprimir(san2);
		}
		else if(respuesta.equalsIgnoreCase("publica")){
			obj.imprimir(san1);;
		}
		
	}

	public static void main(String[] args) {
		Principal_sanidad interfaz=new Principal_sanidad();
	}

}
