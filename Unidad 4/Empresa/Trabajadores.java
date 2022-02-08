package ejercicios;

public class Trabajadores {
	protected int codigo;
	protected String nombre;
	protected double sueldoBase;
	
	public Trabajadores() {
		codigo=0;
		nombre=null;
		sueldoBase=0;
	}
	
	public Trabajadores(int codigo, String nombre,double sueldoBase) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getSueldoBase() {
		return sueldoBase;
	}
	
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	@Override
	public String toString() {
		return "Trabajadores [codigo=" + codigo + ", nombre=" + nombre + ", sueldoBase=" + sueldoBase + "]";
	}
	
	public double calcularSueldo() {
		double sueldo=getSueldoBase();
		return sueldo;
	}

	
	
		
	
	
	
	
	
	
	

}
