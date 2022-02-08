package ejercicios_prueba;
import java.util.*;
public class Ejercicio_5 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double longitud;
		int aptas=0;
		System.out.println("Introduzca el número de perfiles que quiera.");
		int cantidad= teclado.nextInt();
		for (int perfil=1; perfil<cantidad; perfil++) {
			System.out.println("Introduzca su longitud.");
			longitud= teclado.nextDouble();
			if (longitud>=1.20 || longitud<=1.30){
				aptas++;
			}
		}
		System.out.println("De las " +cantidad+ " que pediste, " +aptas+ "son aptas.");
	}

}
