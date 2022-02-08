
import java.util.Scanner;

public class ejercicio_1 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int aptas= 0;
		double longitud= 0;
		System.out.println("Inserte la cantidad de piezas que quiera procesar.");
		int n= teclado.nextInt();
		for (int cont=0; cont < n; cont++ ){
			System.out.println("Inserte la longitud de cada perfil.");
			longitud= teclado.nextDouble();
		}	
		if (longitud< 1.30 || longitud> 1.20) {
				aptas ++;
			}
		System.out.println("Hay un total de " + aptas + "piezas aptas en este lote.");
	}

}
