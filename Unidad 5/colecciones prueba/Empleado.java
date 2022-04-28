package pruebaColecciones;

public class Empleado {
	private int edad;
	private String nombre;
	private double salario;
	
	public Empleado(int edad, String nombre, double salario) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.salario = salario;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [edad=" + edad + ", nombre=" + nombre + ", salario=" + salario + "]";
	}
	
	
}
