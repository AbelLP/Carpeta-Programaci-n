package ejerciciosVectoresObjetos2;

public class Producto {
	protected String identificador;
	protected String descripcion;
	protected double precio;
	
	public Producto(String identificador, String descripcion, double precio) {
		super();
		this.identificador = identificador;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	public String getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [identificador=" + identificador + ", descripcion=" + descripcion + ", precio=" + precio + "]";
	}
	
	
}
