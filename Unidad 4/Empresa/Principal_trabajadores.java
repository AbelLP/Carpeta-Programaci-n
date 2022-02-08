package ejercicios;
import java.util.*;
public class Principal_trabajadores {
	static Scanner teclado=new Scanner(System.in);
	
	public Principal_trabajadores() {
		System.out.println("Introduzca el código del mozo.");
		int codigo1=teclado.nextInt();
		System.out.println("Introduzca el nombre del mozo.");
		teclado.nextLine();
		String nombre1=teclado.nextLine();
		System.out.println("Introduzca el número de trienios del mozo");
		int trienios=teclado.nextInt();
		Trabajadores tr1= new Mozos(codigo1, nombre1, 1000, trienios);
		System.out.println("Introduzca el código del mensajero.");
		int codigo2=teclado.nextInt();
		System.out.println("Introduzca el nombre del mensajero.");
		teclado.nextLine();
		String nombre2=teclado.nextLine();
		System.out.println("Introduzca la edad del mensajero.");
		int edad=teclado.nextInt();
		Trabajadores tr2=new Mensajeros(codigo2, nombre2, 1000, edad);
		Caracteristicas car=new Caracteristicas();
		car.imprimir(tr1);
		car.imprimir(tr2);
	}
	
	
	public static void main(String[] args) {
		Principal_trabajadores interfaz=new Principal_trabajadores();
	}

}
