package ejercicios;
import java.util.*;
public class Principal_flota {
	static Scanner teclado=new Scanner(System.in);
	
	public Principal_flota() {
		Moto puntero=null;
		double precioReal=0;
		boolean luzHonda=false;
		boolean luzScooter=false;
		Gasolina gasolinaCamion=null;
		System.out.println("Inserte la matrícula de la moto Honda .");
		String matriculaHonda=teclado.nextLine();
		System.out.println("Inserte el precio de la moto Honda.");
		double precioHonda= teclado.nextDouble();
		System.out.println("Inserte el color de la moto Honda.");
		teclado.nextLine();
		String colorHonda= teclado.nextLine();
		System.out.println("Inserte si o no si tiene o no luces antiniebla.");
		teclado.nextLine();
		String respuestaLuzHonda=teclado.nextLine();
		if (respuestaLuzHonda.equalsIgnoreCase("si")) {
			luzHonda=true;
		}
		else if (respuestaLuzHonda.equalsIgnoreCase("no")) {
			luzHonda=false;
		}
		Moto honda=new Moto(matriculaHonda, precioHonda, colorHonda, luzHonda);
		System.out.println("Inserte el número de ruedas para la moto Scooter.");
		int ruedasScooter=teclado.nextInt();
		System.out.println("Inserte la matricula de la moto Scooter.");
		teclado.nextLine();
		String matriculaScooter=teclado.nextLine();
		System.out.println("Inserte el precio de la moto Scooter.");
		double precioScooter=teclado.nextDouble();
		System.out.println("Inserte el color de la moto Scooter.");
		teclado.nextLine();
		String colorScooter=teclado.nextLine();
		System.out.println("Inserte si o no si tiene o no luces antiniebla.");
		teclado.nextLine();
		String respuestaLuzScooter=teclado.nextLine();
		if (respuestaLuzScooter.equalsIgnoreCase("si")) {
			luzScooter=true;
		}
		else if(respuestaLuzScooter.equalsIgnoreCase("no")) {
			luzScooter=false;
		}
		Moto scooter=new Moto(matriculaScooter, ruedasScooter, precioScooter, colorScooter, luzScooter);
		System.out.println("Inserte la matricula del camión.");
		String matriculaCamion=teclado.nextLine();
		System.out.println("Inserte el número de ruedas para su camión.");
		int ruedasCamion= teclado.nextInt();
		System.out.println("Inserte el precio del camión.");
		double precioCamion= teclado.nextDouble();
		System.out.println("Inserte el color de camión.");
		teclado.nextLine();
		String colorCamion=teclado.nextLine();
		System.out.println("Inserte el peso del camión.");
		double pesoCamion=teclado.nextDouble();
		System.out.println("Inserte el tipo de gasolina para el camión.");
		teclado.nextLine();
		String respuestaGasolinaCamion=teclado.nextLine();
		if (respuestaGasolinaCamion.equalsIgnoreCase("diesel")) {
			gasolinaCamion=Gasolina.DIESEL;
		}
		else if (respuestaGasolinaCamion.equalsIgnoreCase("gasolina")) {
			gasolinaCamion=Gasolina.GASOLINA;
		}
		Camion cam=new Camion(matriculaCamion, ruedasCamion, precioCamion, colorCamion, gasolinaCamion, pesoCamion);
		teclado.nextLine();
		double precioRealScooter=0;
		double precioRealHonda=0;
		double precioRealCamion=0;
		double precioRealScooter2=0;
		double precioRealHonda2=0;
		double precioRealCamion2=0;
		System.out.println("Datos de la moto Honda:");
		System.out.println("Matricula: " +honda.getMatricula());
		System.out.println("Color: "+honda.getColor());
		System.out.println("Ruedas: 2");
		System.out.println("Luces: " +honda.isFaros());
		if (honda.isFaros()==true) {
			precioRealHonda=honda.establecerPrecio();
			precioRealHonda2=honda.precioLuces(precioRealHonda);
			System.out.println("Precio: "+ precioRealHonda2+ " euros.");
		}
		else if (honda.isFaros()==false) {
			precioRealHonda=honda.establecerPrecio();
			System.out.println("Precio: "+ precioRealHonda+ " euros.");
		}
		
		System.out.println("Datos de la moto Scooter:");
		System.out.println("Matricula: " +scooter.getMatricula());
		System.out.println("Color: "+scooter.getColor());
		System.out.println("Ruedas: "+ scooter.getRuedas());
		System.out.println("Luces: " +scooter.isFaros());
		if (scooter.isFaros()==true) {
			precioRealScooter=scooter.establecerPrecio();
			precioRealScooter2=scooter.precioLuces(precioRealHonda);
			System.out.println("Precio: "+ precioRealScooter2+ " euros.");
		}
		else if (scooter.isFaros()==false) {
			precioRealScooter=scooter.establecerPrecio();
			System.out.println("Precio: "+ precioRealScooter+ " euros.");
		}
		
		System.out.println("Datos del camion: ");
		System.out.println("Matricula: "+ cam.getMatricula());
		System.out.println("Color: " +cam.getColor());
		System.out.println("Ruedas: " +cam.getRuedas());
		System.out.println("Peso: "+cam.getPeso());
		System.out.println("Gasolina: "+cam.getGasolina());
		precioRealCamion=cam.establecerPrecio();
		precioRealCamion2=cam.precioGasolina(precioRealCamion);
		System.out.println("Precio: " +precioRealCamion2);
	}

	public static void main(String[] args) {
		Principal_flota interfaz=new Principal_flota();
	}

}
