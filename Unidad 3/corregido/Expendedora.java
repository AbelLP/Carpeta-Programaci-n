package Ejercicios;
import java.util.*;
public class Expendedora {
	static Scanner teclado=new Scanner(System.in);
	private final String producto="pañuelos";
	private double monedero;
	private int existencias;
	private final int precio=90;
	private double ganancias;
	
	public Expendedora() {
		monedero=0;
		setExistencias(0);
		ganancias=0;
	}
	
	public Expendedora(int existencias) {
		this();
		setExistencias(existencias);
	}
	
	public String getProducto() {
		return producto;
	}
	
	public double getMonedero() {
		return monedero;
	}
	
	public int getExistencias() {
		return existencias;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public double getGanacias() {
		return ganancias;
	}
	
	public void setMonedero(double monedero) {
		monedero=Math.abs(monedero);
	}
	
	public void setExistencias(int existencias) {
		this.existencias=existencias;
	}
	
	public void setGanancias(double ganancias) {
		this.ganancias=ganancias;
	}
	
	public void tragarMoneda() {
		monedero=0;
		do {
			System.out.println("Introduzca moneda. Solo se aceptan monedas de 10, 20 y 50 céntimos");
			int monedas= teclado.nextInt();
			if (monedas==10 || monedas==20 || monedas==50) {
				monedero= monedero+monedas;
			}
			else {
				System.out.println("Esta moneda no sirve.");
			}
			System.out.println("Se han metido " +monedero+ " céntimos.");
		} while (monedero<precio);
		if(monedero>precio) {
			double cambio=devolverMonedas(monedero);
			System.out.println("El cambio es de " +cambio+ " céntimos.");
			monedero= monedero-cambio;
		}
		vender(monedero);
	}
	
	public void vender(double monedero) {
		if(existencias>0){
			existencias--;
			ganancias=ganancias+(monedero/100);
		}	
		else {
			System.out.println("No quedan existencias.");
		}
	}
	
	public double devolverMonedas(double monedero) {
		double cambio= monedero-precio;
		return cambio;	
	}
	
	public String toString() {
		return "Expendedora [producto=" + producto + ", monedero=" + monedero + ", existencias=" + existencias
				+ ", precio=" + precio + ", ganancias=" + ganancias + "]";
	}
	
}
