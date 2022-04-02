package ejerciciosVectoresObjetos2;

public class Oferta extends Producto{
	private int descuento;

	public Oferta(String identificador, String descripcion, double precio, int descuento) {
		super(identificador, descripcion, precio);
		this.descuento=descuento;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return "Oferta [descuento=" + descuento + ", identificador=" + identificador + ", descripcion=" + descripcion
				+ ", precio=" + precio + "]";
	}
	
	
	
	
}
