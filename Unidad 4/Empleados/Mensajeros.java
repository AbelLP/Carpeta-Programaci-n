package ejercicios;

public class Mensajeros extends Trabajadores{
	private int edad;
	private double dietas;
	
	public Mensajeros(int codigo, String nombre, double sueldoBase, int edad) {
		super(codigo, nombre,sueldoBase);
		this.edad = edad;
		dietas=48;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getDietas() {
		return dietas;
	}

	public void setDietas(double dietas) {
		this.dietas = dietas;
	}

	@Override
	public String toString() {
		return "Mensajeros [edad=" + edad + ", dietas=" + dietas + ", codigo=" + codigo + ", nombre=" + nombre
				+ ", Sueldo=" + calcularSueldo() + "]";
	}
	
	@Override
	public double calcularSueldo() {
		super.calcularSueldo();
		double sueldo=getSueldoBase()+dietas;
		return sueldo;
	}
	
	
	
	
	
	
	

}
