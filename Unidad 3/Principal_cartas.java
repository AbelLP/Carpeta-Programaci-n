package repaso;
import java.util.*;
public class Principal_cartas {
	static Scanner teclado=new Scanner(System.in);
	static Cartas j1=new Cartas();
	static Cartas j2=new Cartas();
	static Cartas puntero;
	
	
	
	public static void main(String[] args) {
		Principal_cartas interfaz=new Principal_cartas();
		empezarJugar();
	}
	
	public static void empezarJugar() {
		String respuesta=null;
		int victoria1=0;
		int victoria2=0;
		String ganador=null;
		System.out.println("¿Quieren jugar? Inserte si o no.");
		respuesta=teclado.nextLine();
		while(respuesta.equalsIgnoreCase("si")) {
			if (respuesta.equalsIgnoreCase("si")) {
				j1.sacarCarta();
				j2.sacarCarta();
				ganador=comprobar(victoria1, victoria2);
				if (ganador.equalsIgnoreCase("jugador1")) {
					victoria1++;
				}
				else if(ganador.equalsIgnoreCase("jugador2")) {
					victoria2++;
				}
				else {
					System.out.println("Ha habido un empate.");
				}
				imprimirResultadoPartidas();
				System.out.println("¿Quieren volver a jugar?");
				respuesta=teclado.nextLine();
			}
		
		if (respuesta.equalsIgnoreCase("no")) {
			System.out.println("Hasta luego.");
		}
	}	
	
	}		
	public static String comprobar(int victoria1, int victoria2) {
		String ganador=null;
		if (j1.getNumeroCarta()>j2.getNumeroCarta()) {
			System.out.println("El ganador es el jugador 1.");
			victoria1++;
			j1.setVictoria(victoria1);
			ganador="jugador1";
		}
		else if (j1.getNumeroCarta()<j2.getNumeroCarta()) {
			System.out.println("El ganador es el jugador 2.");
			victoria2++;
			j2.setVictoria(victoria2);
			ganador="jugador2";
		}
		else if (j1.getNumeroCarta()==j2.getNumeroCarta()) {
			System.out.println("Hay un empate.");
		}
	
		return ganador;
		
	}
	
	public static void imprimirResultadoPartidas() {
		System.out.println("El jugador 1 tiene " +j1.getVictoria()+ " victorias.");
		System.out.println("El jugador 2 tiene " +j2.getVictoria()+ " victorias.");
	}
	
	

}
