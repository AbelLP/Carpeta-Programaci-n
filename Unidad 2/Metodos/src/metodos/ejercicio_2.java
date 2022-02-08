package metodos;
import java.util.*;
public class ejercicio_2 {

	public static void main(String[] args) {
		double precio=0;
		double precioFinal=0;
		precio=leerPrecio();
		System.out.println("Se ha introducido el precio.");
		precioFinal=calcularPrecio(precio);
		imprimir(precio, precioFinal);
	}
	
	public static double leerPrecio() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca el precio.");
		double precio= teclado.nextDouble();
		return precio;
	}
	
	public static double calcularPrecio(double precio) {
		double precioFinal= precio +(precio*0.21);
		return precioFinal;
	}
	
	public static void imprimir(double precio, double precioFinal) {
		System.out.println("El precio original es " +precio+ ". El precio con IVA es " +precioFinal);
	}
	

}
