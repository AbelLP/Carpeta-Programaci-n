package ejercicios;

public class Flota {
	protected String matricula;
	protected int ruedas;
	protected double precio;
	private String color;
	
	public Flota(String matricula, int ruedas, double precio, String color) {
		super();
		this.setMatricula(matricula);
		this.setRuedas(ruedas);
		this.setPrecio(precio);
		this.setColor(color);
	}
	
	public Flota(String matricula, double precio, String color) {
		super();
		this.setMatricula(matricula);
		this.setPrecio(precio);
		this.setColor(color);
	}
	
	public Flota() {
		super();
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
		return "Flota [matricula=" + matricula + ", ruedas=" + ruedas + ", precio=" + precio + ", color=" + color + "]";
	}
	
	public double establecerPrecio() {
		double precioReal;
		double IVA= (getPrecio()*21)/100;
		precioReal= getPrecio()+IVA;
		return precioReal;
	}
	

}
