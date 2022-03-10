package ejercicio1_abelLeónPedrero;
import java.util.*;

public class Taxi {
	private String matricula;
	private enum color{blanco, amarillo};
	private boolean discapacitado;
	private Conductor conductor;
	static Scanner teclado=new Scanner(System.in);
	
	public Taxi(String matricula, String color, boolean discapacitado, Conductor conductor) {
		super();
		this.matricula = matricula;
		this.discapacitado = discapacitado;
		this.conductor = conductor;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public boolean isDiscapacitado() {
		return discapacitado;
	}

	public void setDiscapacitado(boolean discapacitado) {
		this.discapacitado = discapacitado;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	@Override
	public String toString() {
		return "Taxi: matricula= "+getMatricula()+ ", licencia= " +conductor.getLicencia();
	}
	
	public boolean recoger() {
		String respuesta="";
		boolean adecuado=false;
		System.out.println("Inserte si es discapacitado o no.");
		respuesta=teclado.nextLine();
		if(respuesta.equalsIgnoreCase("si")) {
			if(isDiscapacitado()==true) {
				System.out.println("El taxi es el adecuado.");
				adecuado=true;
			}
			else {
				System.out.println("El taxi que acudió no es el adecuado. ");
				adecuado=false;
			}	
		}
			else if(respuesta.equalsIgnoreCase("no")){
				if(isDiscapacitado()==true) {
				System.out.println("El taxi que acudió no es el adecuado. ");
				adecuado=false;
			}
			else {
				System.out.println("El taxi es el adecuado.");
				adecuado=true;
			}
		}
		return adecuado;
	}
	
	public void transportar() {
		int respuesta=0;
		double costeCarrera;
		System.out.println("Introduce los kilómetros que quiere recorrer.");
		respuesta=teclado.nextInt();
		while(respuesta>=5) {
			System.out.println("Opción inválida. Sólo puede viajar menos de 5 kilómetros. Inserte otra respuesta.");
			respuesta=teclado.nextInt();
		}
		if(conductor.getExperiencia()>12) {
			costeCarrera=(1.25*respuesta)+5;
			System.out.println("El trayecto le costará "+costeCarrera+" euros.");
		}
		else {
			costeCarrera=1.25*respuesta;
			System.out.println("El trayecto le costará "+costeCarrera+ " euros.");
		}
	}
	
}
