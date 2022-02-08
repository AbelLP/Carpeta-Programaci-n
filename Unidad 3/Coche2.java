package Ejercicios;
import java.util.*;
public class Coche2 {
	static Scanner teclado=new Scanner(System.in);
	private double precio;
	private String marca;
	public static int contador=0;
	
	public Coche2() {
		System.out.println("Inserte precio.");
		precio= teclado.nextDouble();
		System.out.println("Inserte marca.");
		marca= teclado.nextLine();
		contador++;
	}
	
	public Coche2(double precio, String marca) {
		setPrecio(precio);
		setMarca(marca);
		contador++;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setPrecio(double precio) {
		precio=Math.abs(precio);
	}
	
	public void setMarca(String marca) {
		this.marca=marca;
	}

	

}
