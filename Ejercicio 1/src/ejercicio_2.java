

import java.util.*;
public class ejercicio_2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un n�mero. El que quieras.");
		int n= teclado.nextInt();
		System.out.println("El n�mero que ha metido es el" + n);
		if (n > 0) {
			if (n > 8) {
				n= n * 2;
				System.out.println("El doble del n�mero que has metido es" + n);
			}
			else if (n < 8) {
				n= n * 3;
				System.out.println("El triple del n�mero que has metido es" + n);
			}
		}
		
		System.out.println("Fin.");

	}

}
