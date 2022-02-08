package metodos;
import java.util.*;

public class ejercicio_3 {

	public static void main(String[] args) {
		empezar();
	}
	
	public static void empezar() {
		double cateto1=0;
		double cateto2=0;
		double hipotenusa=0;
		cateto1=meterCateto();
		System.out.println("El valor del primer cateto es " +cateto1*cateto1);
		cateto2=meterCateto();
		System.out.println("El valor del segundo cateto es " +cateto2*cateto2);
		hipotenusa=calcularHipotenusa(cateto1,cateto2);
		System.out.println("La hipotenusa de " +cateto1*cateto1+ " y " +cateto2*cateto2+ " es " +hipotenusa);
	}
	
	public static double meterCateto() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Inserta el valor del cateto.");
		double cateto= teclado.nextDouble();
		return cateto;
	}
	
	public static double calcularHipotenusa(double cateto1, double cateto2) {
		double hipotenusa= Math.sqrt((cateto1*cateto1) + (cateto2*cateto2));
		return hipotenusa;
	}
	
	

}
