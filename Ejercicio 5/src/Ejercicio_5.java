
import java.util.*;
public class Ejercicio_5 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		System.out.println("Pon el puesto en el que has quedado.");
		int puesto= teclado.nextInt();
		
		switch (puesto){
			case 1: 
				System.out.println("Enhorabuena, has quedado en primera posici�n. Aqu� tienes tu medalla de oro.");
				break;
			case 2:
				System.out.println("Enhorabuena, has quedado en segunda posici�n. Aqu� tienes tu medalla de plata.");
				break;
			case 3:
				System.out.println("Enhorabuena, has quedado en tercer posici�n. Aqu� tienes tu medalla de bronce.");
				break;
			default:
				System.out.println("L�stima, no has ganado ninguna medalla, pero gracias por participar.");
				break;
		}

	}

}
