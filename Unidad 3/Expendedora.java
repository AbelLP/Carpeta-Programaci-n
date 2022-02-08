package Ejercicios;
import java.util.*;
public class Expendedora {
	static Scanner teclado=new Scanner(System.in);
	private String producto;
	private double monedero;
	private int existencias;
	private int precio;
	private double ganancias;
	
	public Expendedora() {
		producto= "pañuelos";
		monedero=0;
		System.out.println("Inroduzca las existencias que desee introducir.");
		existencias=teclado.nextInt();
		precio=90;
		ganancias=0;
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
	
	public void setProducto(String producto) {
		this.producto=producto;
	}
	
	public void setMonedero(double monedero) {
		monedero=Math.abs(monedero);
	}
	
	public void setExistencias(int existencias) {
		existencias=Math.abs(existencias);
	}
	
	public void setPrecio(int precio) {
		precio=Math.abs(precio);
	}
	
	public void setGanancias(double ganancias) {
		this.ganancias=ganancias;
	}
	
	public void tragarMoneda() {
		monedero=0;
		do {
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
		existencias--;
		ganancias=ganancias+(monedero/100);
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
