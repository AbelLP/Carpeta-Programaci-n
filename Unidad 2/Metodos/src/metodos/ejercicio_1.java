package metodos;
import java.util.*;
public class ejercicio_1 {
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("¿Quieres cambiar dinero? Teclee fin si no quiere.");
		String respuesta= teclado.nextLine(); 
		while (!respuesta.equalsIgnoreCase("fin")) {
			double euros= 0;
			String moneda;
			double cambio= 0;
			euros= introducirEuros();
			System.out.println("Se ha introducido " +euros + "euros.");
			moneda= introducirMoneda();
			System.out.println("Se quiere cambiar a " +moneda);
			cambio= cambiarMoneda(euros, moneda);
			imprimir(cambio);
			System.out.println("¿Quieres cambiar dinero? Teclee fin si no quiere.");
			respuesta=teclado.nextLine();
		}
	}
	
	public static double introducirEuros() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce la cantidad.");
		double euros= teclado.nextDouble();
		return euros;
	}

	public static String introducirMoneda() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca el tipo de moneda a cambiar.");
		String moneda= teclado.nextLine();
		return moneda;	
	}
	
	public static double cambiarMoneda(double euros, String moneda) {
		double cambio=0;
		switch (moneda) {
		case ("libras"):
			cambio= euros*0.87;
			break;
		case ("dolar"):
			cambio= euros*1.11;
			break;
		case ("yen"):
			cambio= euros*120.63;
			break;
		default:
			System.out.println("Introduzca un tipo de moneda CORRECTO.");
		}
		return cambio;
	}
	
	public static void imprimir(double cambio) {
		System.out.println("El cambio a devolver es: " + cambio);
	}
	
	
	
	
	
	
}
