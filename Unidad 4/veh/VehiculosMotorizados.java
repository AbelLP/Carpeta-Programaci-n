package ejercicios;

public class VehiculosMotorizados {
	protected String fabricante;
	protected String modelo;
	protected int año;
	protected double kilometraje;
	
	
	
	public VehiculosMotorizados(String fabricante, String modelo, int año, double kilometraje) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.año = año;
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
	
	public int getAño() {
		return año;
	}
	
	public void setAño(int año) {
		this.año = año;
	}
	
	public double getKilometraje() {
		return kilometraje;
	}
	
	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}

	@Override
	public String toString() {
		return "VehiculosMotorizados [fabricante=" + fabricante + ", modelo=" + modelo + ", año=" + año
				+ ", kilometraje=" + kilometraje + "]";
	}
	
	
	
	
	
	

}
