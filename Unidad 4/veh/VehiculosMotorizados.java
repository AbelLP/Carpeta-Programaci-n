package ejercicios;

public class VehiculosMotorizados {
	protected String fabricante;
	protected String modelo;
	protected int a�o;
	protected double kilometraje;
	
	
	
	public VehiculosMotorizados(String fabricante, String modelo, int a�o, double kilometraje) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.a�o = a�o;
		this.kilometraje = kilometraje;
	}

	public VehiculosMotorizados() {
		this(null,null,0,0);
	}

	public String getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getA�o() {
		return a�o;
	}
	
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	
	public double getKilometraje() {
		return kilometraje;
	}
	
	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}

	@Override
	public String toString() {
		return "VehiculosMotorizados [fabricante=" + fabricante + ", modelo=" + modelo + ", a�o=" + a�o
				+ ", kilometraje=" + kilometraje + "]";
	}
	
	
	
	
	
	

}
