package prueba_automovil;

public class Vehiculo {
	protected String matricula;
	protected int ruedas;
	protected double precio;
	private String color;
	
	public Vehiculo() {
		super();
	}
	
	public Vehiculo(String matricula, int ruedas, double precio, String color) {
		super();
		this.matricula = matricula;
		this.ruedas = ruedas;
		this.precio = precio;
		this.color = color;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public int getRuedas() {
		return ruedas;
	}
	
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", ruedas=" + ruedas + ", precio=" + precio + ", color=" + color
				+ "]";
	}

	public double establecer_precio() {
		double precioIVA;
		double IVA= (getPrecio()*21)/100;
		precioIVA= getPrecio()+IVA;
		return precioIVA;
	}
	
	
	
}
