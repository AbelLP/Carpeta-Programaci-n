package interfaces;

public class Planta implements SerVivo{
	private String denominacion;

	public Planta(String denominacion) {
		super();
		this.denominacion = denominacion;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}
	
	public void comer() {
		System.out.println("La "+denominacion+" hace la fotosintesis.");
	}
	

}
