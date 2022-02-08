package ejercicios;

public class Moto extends Flota{
	private boolean faros;
	
	public Moto() {
		super();
		faros=false;
	}
	
	public Moto(String matricula, int ruedas, double precio, String color, boolean faros) {
		super(matricula, ruedas, precio, color);
		this.setFaros(faros);
	}
	
	public Moto(String matricula, double precio, String color, boolean faros) {
		super(matricula, precio, color);
		this.setFaros(faros);
	}

	public boolean isFaros() {
		return faros;
	}

	public void setFaros(boolean faros) {
		this.faros = faros;
	}

	@Override
	public String toString() {
		return "Moto [faros=" + faros + ", matricula=" + matricula + ", ruedas=" + ruedas + ", precio=" + precio + "]";
	}
	
	public double precioLuces(double precioReal) {
		double precioRealMoto2;
		precioRealMoto2=precioReal+200;
		return precioRealMoto2;
	}
	
	

}
