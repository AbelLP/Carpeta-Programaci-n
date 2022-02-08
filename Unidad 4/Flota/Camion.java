package ejercicios;

public class Camion extends Flota{
	private Gasolina gasolina;
	private double peso;
	
	public Camion() {
		super();
		gasolina=null;
		peso=0;
	}
	
	public Camion(String matricula, int ruedas, double precio, String color, Gasolina gasolina, double peso) {
		super(matricula, ruedas, precio, color);
		this.setGasolina(gasolina);
		this.setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Gasolina getGasolina() {
		return gasolina;
	}

	public void setGasolina(Gasolina gasolina) {
		this.gasolina = gasolina;
	}

	@Override
	public String toString() {
		return "Camion [gasolina=" + gasolina + ", matricula=" + matricula + ", ruedas=" + ruedas + ", precio=" + precio
				+ "]";
	}
	
	public double precioGasolina(double precioReal) {
		double precioRealCamion=0;
		if (getGasolina()==Gasolina.DIESEL) {
			precioRealCamion=precioReal+(precioReal*5)/100;
		}
		else if (getGasolina()==Gasolina.GASOLINA) {
			precioRealCamion=precioReal+(precioReal*2)/100;
		}
		return precioRealCamion;
	}
	

}
