package ejercicios;

public class Motocicleta extends VehiculosMotorizados{
	private String tipo;
	
	public Motocicleta() {
		super();
	}

	public Motocicleta(String fabricante, String modelo, int año, double kilometraje,String tipo) {
		super(fabricante, modelo, año, kilometraje);
		this.tipo=tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Motocicleta= "+" fabricante: "+fabricante+", modelo: "+modelo+", año: "+año+", kilometraje: "+kilometraje+", tipo: "+tipo;
	}

}
