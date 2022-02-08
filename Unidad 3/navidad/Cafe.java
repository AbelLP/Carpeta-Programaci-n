package navidad;
import java.util.*;
public class Cafe {
	static Scanner teclado=new Scanner(System.in);
	private int capacidadMaxima;
	private int cantidadActual;
	
	public Cafe(){
		capacidadMaxima=2000;
		cantidadActual=0;
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}

	public String toString() {
		return "Cafe [capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + "]";
	}
	
	public void llenarCafetera() {
		setCantidadActual(2000);
	}
	
	public void servirTazaCafe() {
		int dia=1;
		while(true) {
		if (dia==1||dia==2||dia==3||dia==4||dia==5) {	
			System.out.println("Seleccione la cantidad que quiere de cafe.");
			int cantidad=teclado.nextInt();
			if (cantidad<getCantidadActual()) {
				cantidadActual=cantidadActual-cantidad;
				System.out.println("Aquí tiene sus " +cantidad+ " litros de café.");
			}
			else {
				System.out.println("No tenemos tantos litros de café.");
			}
		}
		else if (dia==6||dia==7) {
			System.out.println("Aquí tiene su chocolate.");
		}
		
		switch (dia) {
		case 1:
			System.out.println("Hoy es lunes");
			break;
			
		case 2:
			System.out.println("Hoy es martes");
			break;
			
		case 3:
			System.out.println("Hoy es miércoles");
			break;
			
		case 4:
			System.out.println("Hoy es jueves");
			break;
			
		case 5:
			System.out.println("Hoy es viernes");
			break;
			
		case 6:
			System.out.println("Hoy es sábado");
			break;
			
		case 7:
			System.out.println("Hoy es domingo");
			break;	
		}
		if (dia<8) {
			dia++;
		}
		
		else if (dia==8) {
			dia=1;
		}
	}

	}
	
	public void vaciarCafetera() {
		cantidadActual=cantidadActual-cantidadActual;
	}
	
}	
