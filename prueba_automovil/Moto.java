package prueba_automovil;

public class Moto extends Vehiculo{
	private boolean faros;

	public Moto() {
		super();
	}

	public Moto(String matricula, int ruedas, double precio, String color, boolean faros) {
		super(matricula, ruedas, precio, color);
		this.faros=faros;
	}

	public boolean isFaros() {
		return faros;
	}

	public void setFaros(boolean faros) {
		this.faros = faros;
	}

	@Override
	public String toString() {
		return "Moto [faros=" + faros + ", matricula=" + matricula + ", ruedas=" + ruedas + ", precio=" + precio
				+ ", color=" + getColor() + "]";
	}
	
	@Override
	public double establecer_precio() {
		
	}
	
	
	
	
}
