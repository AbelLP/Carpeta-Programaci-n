package navidad;

public class Saldo {
	private String nombre;
	private int edad;
	private String categoria;
	private String antiguedad;
	
	public Saldo(){
		nombre=null;
		edad=0;
		categoria=null;
		antiguedad=null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(String antiguedad) {
		this.antiguedad = antiguedad;
	}

	public String toString() {
		return "Saldo [nombre=" + nombre + ", edad=" + edad + ", categoria=" + categoria + ", antiguedad=" + antiguedad
				+ "]";
	}
	
	

}
