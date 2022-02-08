package prueba;

public class Alumno {
	private String nombre;
	private Matricula datos;
	
	public Alumno() {
		nombre="";
		datos=null;
	}
	
	public Alumno(String nombre, Matricula datos) {
		this.nombre=nombre;
		this.datos=datos;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Matricula getDatos() {
		return datos;
	}
	public void setDatos(Matricula datos) {
		this.datos = datos;
	}
	
	public String toString() {
		return "Alumno [nombre=" + nombre + ", curso=" + datos.getCurso() + ", expediente=" +datos.getExpediente()+ "]";
	}
}	