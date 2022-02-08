package ejercicios;

public class Administrativo extends Empleados{
	private int horasExtras;
	
	public Administrativo() {
		super();
		horasExtras=0;
	}

	public Administrativo(int codigo, String nombre, double sueldoFijo, Empresa empresa, int horasExtras) {
		super(codigo, nombre, sueldoFijo, empresa);
		this.horasExtras = horasExtras;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}
	
	@Override
	public double calcularSueldoMensual() {
		double horaExTrabajada= 30*horasExtras;
		double sueldoMensual= getSueldoFijo()+horaExTrabajada;
		return sueldoMensual;
	}

}
