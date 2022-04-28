package ejercicios_colecciones;

public class Deportistas {
	private String nombre;
	private String deporte;
	
	public Deportistas(String nombre, String deporte) {
		super();
		this.nombre = nombre;
		this.deporte = deporte;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	@Override
	public String toString() {
		return "Deportistas [nombre=" + nombre + ", deporte=" + deporte + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
