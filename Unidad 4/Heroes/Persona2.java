package entregar;

public class Persona2 {
	protected String nombre;
	protected int edad;
	protected Categoria caracteristica;
	
	
	public Persona2(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona2() {
		this(null,0);
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void Corre() {
		System.out.println("Corro como cualquier persona.");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Categoria getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(Categoria caracteristica) {
		this.caracteristica = caracteristica;
	}

	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
}
